package com.WorkflowService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.WorkflowService.Entities.Services;
import com.WorkflowService.Service.ServiceService;



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

