package com.WorkflowService.Service;

import java.util.List;


import javax.servlet.Registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.WorkflowService.Entities.Request;
import com.WorkflowService.Repository.Register;


@Service
public class WorkflowService {
	
	@Autowired
	private Register ordersdao;
	
	@Autowired
	private RestTemplate template;

	public Request addOrder(Request info) {
		Request test = new Request();
		Request newOrder = ordersdao.save(info); 
		newOrder.setRegistrationStatus(test.getRegistrationStatus());
		return newOrder;
	}
	
	public List<Request> getAllUsers(){
	
	List<Request> entity=  ordersdao.findAll();
	return entity;

	}
	

}
