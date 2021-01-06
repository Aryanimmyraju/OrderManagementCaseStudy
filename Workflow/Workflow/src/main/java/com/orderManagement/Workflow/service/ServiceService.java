package com.orderManagement.Workflow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderManagement.Workflow.Model.Request;
import com.orderManagement.Workflow.Model.Services;
import com.orderManagement.Workflow.Repository.RequestRepository;
import com.orderManagement.Workflow.Repository.ServiceRepository;

@Service
public class ServiceService {
	
	@Autowired
	private ServiceRepository serviceRepository;
	
	public List<Services> getAllServices()
	{
		List<Services> service= serviceRepository.findAll();
		return service;
	}
}
