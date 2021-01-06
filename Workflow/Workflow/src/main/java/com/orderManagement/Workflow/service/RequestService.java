package com.orderManagement.Workflow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderManagement.Workflow.Model.Request;
import com.orderManagement.Workflow.Repository.RequestRepository;

@Service
public class RequestService {
	
	@Autowired
	private RequestRepository requestRepository;
	
	public List<Request> getAllRequests()
	{
		List<Request> requests= requestRepository.findAll();
		return requests;
	}

}
