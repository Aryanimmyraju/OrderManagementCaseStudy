package com.WorkflowService.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WorkflowService.Entities.Services;
import com.WorkflowService.Repository.ServiceRepository;



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
