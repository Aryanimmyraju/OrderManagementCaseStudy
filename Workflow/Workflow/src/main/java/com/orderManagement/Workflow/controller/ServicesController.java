package com.orderManagement.Workflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orderManagement.Workflow.Model.Request;
import com.orderManagement.Workflow.Model.Services;
import com.orderManagement.Workflow.service.RequestService;
import com.orderManagement.Workflow.service.ServiceService;

@RestController
public class ServicesController {
	
	@Autowired
	private ServiceService serviceService;
	
	@GetMapping("/services")
	public List<Services> getAllServices()
	{
		List<Services> services= serviceService.getAllServices();
		return services;
	}

}

