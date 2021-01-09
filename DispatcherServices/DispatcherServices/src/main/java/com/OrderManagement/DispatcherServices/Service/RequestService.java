package com.OrderManagement.DispatcherServices.Service;

import java.util.ArrayList;
import java.util.List;

import org.apache.naming.factory.webservices.ServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OrderManagement.DispatcherServices.Model.Request;
import com.OrderManagement.DispatcherServices.Model.Specialists;
import com.OrderManagement.DispatcherServices.Repositories.RequestRepository;
import com.OrderManagement.DispatcherServices.Repositories.WorkflowProxy;

@Service
public class RequestService {
	
	
	
	@Autowired
	private RequestRepository requestRepository;
	
	@Autowired
	private WorkflowProxy specialistProxy;
	
	public void saveAll(List<Request> list)
	{
		for(Request request: list)
		{
			requestRepository.save(request);
		}
	}
	public List<Request> getAll() {
		List<Request> tr = requestRepository.findAll();
		
	  
		return tr;
		 
	}

	public List<Request> getAllUnassigned() {
		List<Request> tr = requestRepository.findAll();
		List<Request> unassignedList = new ArrayList<>();
		  for (Request request : tr) {
			  if(request.getRegistrationStatus().equalsIgnoreCase("no"))
			  {
				  unassignedList.add(request);
			  }
	  }
		return unassignedList;
		 
	}
		
	

}