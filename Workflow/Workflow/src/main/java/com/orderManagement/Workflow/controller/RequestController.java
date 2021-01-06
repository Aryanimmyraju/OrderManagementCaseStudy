package com.orderManagement.Workflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orderManagement.Workflow.Model.Request;
import com.orderManagement.Workflow.service.RequestService;

@RestController
public class RequestController {
	
	@Autowired
	private RequestService requestService;
	
	@GetMapping("/requests")
	public List<Request> getAllRequest()
	{
		List<Request> requests= requestService.getAllRequests();
		return requests;
	}

}
