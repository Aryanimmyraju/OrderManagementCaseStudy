package com.WorkflowService.Fascade;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.WorkflowService.Entities.RequestSpecialistMapping;

@FeignClient(name="dispatcher-services")
@RibbonClient(name="dispatcher-services")
public interface DispatcherServiceProxy {
	
	@GetMapping("/mappings") 
	  public List<RequestSpecialistMapping> getAllMappings();


}
