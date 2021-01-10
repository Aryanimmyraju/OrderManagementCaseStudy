package com.OrderManagement.DispatcherServices.Repositories;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.OrderManagement.DispatcherServices.Model.Request;
import com.OrderManagement.DispatcherServices.Model.Services;
import com.OrderManagement.DispatcherServices.Model.Specialists;

@FeignClient(name="workflow-service")
@RibbonClient(name="workflow-service")
public interface WorkflowProxy {
	
	@GetMapping("specialist/{specialistId}")
	public List<Specialists> getServiceByspecialistId(@PathVariable("specialistId") int no);

	@GetMapping("/specialists")
	public List<Specialists> getAllSpecialists();
	
	@GetMapping("specialists/{SpecialistName}")
	public List<Specialists> getSpecialistbyName(@PathVariable("SpecialistName") String no);
	
	/*
	 * @GetMapping("/o") public List<Request> fetchAllRequests();
	 */
	
	@GetMapping("/services")
	public List<Services> getAllServices();
	
	@GetMapping("/specialists/{RequestId}")
	public List<Specialists> getSpecialistbyRequestId(@PathVariable("RequestId") int no);
	
	
}
