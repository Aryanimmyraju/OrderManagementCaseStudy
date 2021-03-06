package com.OrderManagement.DispatcherServices.Controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.OrderManagement.DispatcherServices.Model.Request;
import com.OrderManagement.DispatcherServices.Model.RequestInfo;
import com.OrderManagement.DispatcherServices.Model.RequestSpecialistMapping;
import com.OrderManagement.DispatcherServices.Model.Services;
import com.OrderManagement.DispatcherServices.Model.Specialists;
import com.OrderManagement.DispatcherServices.Repositories.RequestSpecialistRepository;
import com.OrderManagement.DispatcherServices.Repositories.WorkflowProxy;
import com.OrderManagement.DispatcherServices.Service.MappingService;
import com.OrderManagement.DispatcherServices.Service.RequestService;
import com.OrderManagement.DispatcherServices.Service.ServicesService;
import com.OrderManagement.DispatcherServices.Service.SpecialistService;



@RestController
@CrossOrigin (origins="*")
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
	
	@GetMapping("specialistss/{RequestId}")
	public List<Specialists> getSpecialistByRequestId(@PathVariable("RequestId") int no){
		 List<Specialists> specialistsByRequestId = specialistService.getSpecialistbyRequestId(no);
		 return specialistsByRequestId;
	}
	
	  @GetMapping("/specialists") 
	  public List<Specialists> getAllAvailableSpecialists()
	  {
		  List<Specialists> availableSpecialists = specialistService.getAllAvaSpecialists();
		  return availableSpecialists; 
	  }
	  
	 
	  @PostMapping( "/mapping/{requestId}/{name}")
	  public void addMapping(@PathVariable("requestId") int number,@PathVariable("name") String name)
	  {
		  RequestSpecialistMapping requestSpecialistMapping= new RequestSpecialistMapping();
		  List<Request> requestList = requestService.getAllUnassigned();
		  
		  for(Request rq:requestList)
		  {
			  System.out.println(rq.getRequestId());
			  if(rq.getRequestId()==number) {
				  requestSpecialistMapping.setRequestId(rq);
			  }
		  }
		  List<Specialists> specialistList = specialistService.getAllSpecialists();
		  for(Specialists sp:specialistList)
		  {
			  if(sp.getSpecialistName().equalsIgnoreCase(name)) {
				  requestSpecialistMapping.setSpecialistId(sp);
			  }
		  }
		  
		  requestSpecialistMapping.setStatus("Assigned");
		  requestSpecialistMapping.setStartDate(LocalDate.now());
		  
			mapping.saveMapping(requestSpecialistMapping);
		 
	  }
	 
		
	  @GetMapping("/mappings") 
	  public List<RequestSpecialistMapping> getAllMappings()
	  {
		  List<RequestSpecialistMapping> mappings = mapping.getAllRequestSpecialistMappings();
		  return mappings; 
	  }
	  
	  @GetMapping("/automappings") 
	  public List<RequestSpecialistMapping> getAllAutoMappings()
	  {
		  List<RequestSpecialistMapping> mappings = mapping.getAllAutoMappings();
		  return mappings; 
	  }
	  
	  @GetMapping("/requests")
	  public List<Request> getAllUnassignedRequests()
	  {
		  List<Request> unassiList= requestService.getAllUnassigned();
		return unassiList;
		  
	  }
	  @PostMapping(value="/addnewOrder",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
		public void addCustomer(@RequestBody RequestInfo info)
		{
		       Request request = new Request();
		       request.setRequestId(info.getRequestId());
		       request.setFirstName(info.getFirstName());
		       request.setLastName(info.getLastName());
		       request.setStartDate(info.getStartDate());
		       request.setEndDate(info.getEndDate());
		       request.setPriority(info.getPriority());
		       request.setEmailId(info.getEmailId());
		       request.setRegistrationStatus(info.getRequesterStatus());
		       List<Services> services= servicesService.getAll();
		      
		       for(Services services2: services)
		       {
		    	   if(info.getServiceType().equalsIgnoreCase(services2.getServiceName()))
		    	   {
		    		   request.setServiceId(services2);
		    	   }
		       }
		       
		      requestService.save(request);
		}  
	  
	  
}
