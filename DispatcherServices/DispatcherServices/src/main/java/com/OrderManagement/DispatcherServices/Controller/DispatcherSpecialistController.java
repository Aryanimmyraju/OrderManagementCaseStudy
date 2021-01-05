package com.OrderManagement.DispatcherServices.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.OrderManagement.DispatcherServices.Model.Specialists;
import com.OrderManagement.DispatcherServices.Repositories.RequestSpecialistRepository;
import com.OrderManagement.DispatcherServices.Repositories.SpecialistProxy;
import com.OrderManagement.DispatcherServices.Service.SpecialistService;


@RestController
public class DispatcherSpecialistController {
	

	
	@Autowired
	private SpecialistService specialistService;
	
	@GetMapping("specialist/{specialistId}")
	public List<Specialists> getServiceByspecialistId(@PathVariable("specialistId") int no)
	{
		List<Specialists> tr = specialistService.getServiceByspecialistId(no);
		return tr;
	}
	
	@GetMapping("specialists/{SpecialistName}")
	public List<Specialists> getSpecialistbyName(@PathVariable("SpecialistName") String no){
	
		List<Specialists> transaction = specialistService.getSpecialistbyName(no);
		return transaction;
	}
	
	  @GetMapping("/specialists") 
	  public List<Specialists> getAllAvailableSpecialists()
	  {
		  List<Specialists> availableSpecialists = specialistService.getAllSpecialists();
		  return availableSpecialists; 
	  }
	  
	  
}
