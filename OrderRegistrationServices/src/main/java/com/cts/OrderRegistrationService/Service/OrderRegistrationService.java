package com.cts.OrderRegistrationService.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.OrderRegistrationService.Entities.RequestInfo;
import com.cts.OrderRegistrationService.Repository.Orders;

@Service
public class OrderRegistrationService {
	
	@Autowired
	private Orders ordersdao;

	public RequestInfo addOrder(RequestInfo info) {
		RequestInfo newOrder = ordersdao.save(info); 
		return newOrder;
	}

	public List<RequestInfo> getAllUsers() {
		// TODO Auto-generated method stub
		return ordersdao.findAll();
		
	}
	


}
