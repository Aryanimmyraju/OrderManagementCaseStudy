package com.OrderManagement.DispatcherServices.Controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.OrderManagement.DispatcherServices.Model.Request;
import com.OrderManagement.DispatcherServices.Model.RequestSpecialistMapping;
import com.OrderManagement.DispatcherServices.Model.Specialists;
import com.OrderManagement.DispatcherServices.Repositories.RequestSpecialistRepository;
import com.OrderManagement.DispatcherServices.Repositories.WorkflowProxy;
import com.OrderManagement.DispatcherServices.Service.MappingService;
import com.OrderManagement.DispatcherServices.Service.RequestService;
import com.OrderManagement.DispatcherServices.Service.ServicesService;
import com.OrderManagement.DispatcherServices.Service.SpecialistService;



@RestController
public class DispatcherSpecialistController {
	
	@Autowired
	private MappingService mapping;
	
	@Autowired
	private SpecialistService specialistService;
	
	@Autowired
	private RequestService requestService;
	
	@Autowired
	private ServicesService servicesService;
	
	@Autowired
	private WorkflowProxy specialistProxy;
	
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
	  
	  @PostMapping("/mapping")
		public void addMapping(@RequestBody RequestSpecialistMapping requestSpecialist){
		  requestService.saveAll(specialistProxy.fetchAllRequests());
			servicesService.saveAll(specialistProxy.getAllServices());
			specialistService.saveAll(specialistProxy.getAllSpecialists());
			requestSpecialist.setStatus("busy");
			requestSpecialist.setStartDate(LocalDate.now());
			mapping.saveMapping(requestSpecialist);
			
		}
	  @GetMapping("/mappings") 
	  public List<RequestSpecialistMapping> getAllMappings()
	  {
		  List<RequestSpecialistMapping> availableSpecialists = mapping.getAllRequestSpecialistMappings();
		  return availableSpecialists; 
	  }
	  
	  @GetMapping("/requests")
	  public List<Request> getAllUnassignedRequests()
	  {
		  List<Request> unassiList= requestService.getAllUnassigned();
		return unassiList;
		  
	  }
	  
	  
}
