package com.WorkflowService.Controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.WorkflowService.Entities.RequestSpecialistMapping;
import com.WorkflowService.Fascade.DispatcherServiceProxy;
import com.WorkflowService.Service.MappingService;

@RestController
public class MappingController {
	
	@Autowired
	private DispatcherServiceProxy dispatcherServiceProxy;
	
	@Autowired
	private MappingService mappingService;
	
	 @PostMapping("/mapping")
	public void addMapping(@RequestBody RequestSpecialistMapping requestSpecialist){
		  
			requestSpecialist.setStatus("busy");
			requestSpecialist.setStartDate(LocalDate.now());
			mappingService.saveMapping(requestSpecialist);
			
		}
	 @GetMapping("/mappings") 
	  public List<RequestSpecialistMapping> getAllMappings()
	  {
		  List<RequestSpecialistMapping> availableSpecialists = dispatcherServiceProxy.getAllMappings();
		  return availableSpecialists; 
	  }

}
