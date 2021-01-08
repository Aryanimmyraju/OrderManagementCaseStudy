package com.cts.OrderRegistrationService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.OrderRegistrationService.Entities.RequestInfo;
import com.cts.OrderRegistrationService.Fascade.WorkflowServiceProxy;
import com.cts.OrderRegistrationService.Service.OrderRegistrationService;


@RestController
public class OrderRegistrationController {
	
	@Autowired
	private OrderRegistrationService service;
	
	@Autowired
	private WorkflowServiceProxy proxyService;
	
	@PostMapping(value="/addOrder",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> addCustomer(@RequestBody RequestInfo info)
	{
		ResponseEntity<Object> response = null;
		try {
			RequestInfo addOrder = service.addOrder(info);
			response = ResponseEntity.status(200).body(addOrder);
			proxyService.addCustomer(info);
			System.out.println("order added");
		} catch (Exception e) {
			System.out.println("order added failed");
		}
		return response;
	}  
	
	@GetMapping("/o")
	public List<RequestInfo> fetchAllRequests()
	{
	List<RequestInfo> requestInfo=service.getAllUsers();
	return requestInfo;
	}
	
	

}
