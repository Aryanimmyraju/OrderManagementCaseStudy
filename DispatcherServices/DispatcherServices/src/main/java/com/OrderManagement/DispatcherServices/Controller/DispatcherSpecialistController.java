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


@RestController
public class DispatcherSpecialistController {
	

	
	@Autowired
	private SpecialistProxy specialistProxy;
	
	@GetMapping("specialist/{specialistId}")
	public List<Specialists> getServiceByspecialistId(@PathVariable("specialistId") int no)
	{
		List<Specialists> tr = specialistProxy.getServiceByspecialistId(no);
		System.out.println("output"+tr);
		return tr;
	}
	
	  @GetMapping("/specialists") 
	  public List<Specialists> getAllAvailableSpecialists()
	  {
		  List<Specialists> tr = specialistProxy.getAllSpecialists();
		  List<Specialists> availableSpecialists = new ArrayList<>();
		  for (Specialists specialists : tr) {
			  if(specialists.getStatus().equalsIgnoreCase("available"))
			  {
			availableSpecialists.add(specialists);
			  }
	  }
	  return availableSpecialists; 
	  }
}
