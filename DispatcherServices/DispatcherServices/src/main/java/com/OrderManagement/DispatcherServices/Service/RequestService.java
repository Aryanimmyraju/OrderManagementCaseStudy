package com.OrderManagement.DispatcherServices.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OrderManagement.DispatcherServices.Model.Request;
import com.OrderManagement.DispatcherServices.Repositories.RequestRepository;

@Service
public class RequestService {
	
	
	
	@Autowired
	private RequestRepository requestRepository;
	
	public void saveAll(List<Request> list)
	{
		for(Request request: list)
		{
			requestRepository.save(request);
		}
	}

}