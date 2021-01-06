package com.OrderManagement.DispatcherServices.Repositories;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.OrderManagement.DispatcherServices.Model.Request;
import com.OrderManagement.DispatcherServices.Model.Specialists;

@FeignClient(name="workflow")
@RibbonClient(name="workflow")
public interface SpecialistProxy {
	
	@GetMapping("specialist/{specialistId}")
	public List<Specialists> getServiceByspecialistId(@PathVariable("specialistId") int no);

	@GetMapping("/specialists")
	public List<Specialists> getAllSpecialists();
	
	@GetMapping("specialists/{SpecialistName}")
	public List<Specialists> getSpecialistbyName(@PathVariable("SpecialistName") String no);
	
	@GetMapping("/requests")
	public List<Request> getAllRequest();
}
