package com.WorkflowService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.WorkflowService.Entities.Request;
import com.WorkflowService.Fascade.OrderRegisterationServiceProxy;
import com.WorkflowService.Service.WorkflowService;


@RestController
@CrossOrigin (origins="*")

public class RequestController {
	
	@Autowired
	private WorkflowService service;
	@Autowired
	private OrderRegisterationServiceProxy service2;

	@GetMapping("/o")
	public List<Request>  fetchAllRequests()
	{
		List<Request> registerEntity=service2.fetchAllRequests();
		return service2.fetchAllRequests();
		
	}
	
	@PostMapping(value="/addnewOrder",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> addCustomer(@RequestBody Request info)
	{
		ResponseEntity<Object> response = null;
		try {
			Request addOrder = service.addOrder(info);
			response = ResponseEntity.status(200).body(addOrder);
			System.out.println("order added in workflow");
		} catch (Exception e) {
			System.out.println("order added workflow failed");
		}
		return response;
	}  
	
	
}
