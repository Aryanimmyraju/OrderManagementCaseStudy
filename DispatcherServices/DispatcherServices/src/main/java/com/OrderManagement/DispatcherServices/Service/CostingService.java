package com.OrderManagement.DispatcherServices.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OrderManagement.DispatcherServices.Model.Costing;
import com.OrderManagement.DispatcherServices.Model.Request;
import com.OrderManagement.DispatcherServices.Repositories.WorkflowProxy;


@Service
public class CostingService {
		
	@Autowired
	private RequestService requestService;
	
	
	public List<Costing> doCostings(){
		List<Request> requests= requestService.getAll();
		double costing=0;
		List<Costing> costList= new ArrayList<>();
		for(Request request:requests)
		{
			costing=costing+request.getServiceId().getServiceAmount();
			if(request.getPriority().equalsIgnoreCase("high"))
			{
				costing+=100;
			}
			else if(request.getPriority().equalsIgnoreCase("medium"))
			{
				costing+=50;
			}
			else
			{
				costing+=10;
			}
			if(request.getComplexity().equalsIgnoreCase("high"))
			{
				costing+=100;
			}
			else if(request.getComplexity().equalsIgnoreCase("medium"))
			{
				costing+=50;
			}
			else
			{
				costing+=10;
			}
			Costing cost = new Costing();
			cost.setRequestId(request);
			cost.setServiceId(request.getServiceId());
			cost.setCost(costing);
			
			costList.add(cost);
		}
		return costList;
		
		
	}

}
