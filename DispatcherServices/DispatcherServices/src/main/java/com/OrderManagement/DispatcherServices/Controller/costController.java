package com.OrderManagement.DispatcherServices.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OrderManagement.DispatcherServices.Model.Costing;
import com.OrderManagement.DispatcherServices.Service.CostingService;

@RestController
@CrossOrigin (origins="*")
public class costController {
	
	@Autowired
	private CostingService costingService;
	
	@GetMapping("/costing")
	public List<Costing> getAllCostings()
	{
		List<Costing> costings= costingService.doCostings();
		return costings;
	}
	
	
	

}
