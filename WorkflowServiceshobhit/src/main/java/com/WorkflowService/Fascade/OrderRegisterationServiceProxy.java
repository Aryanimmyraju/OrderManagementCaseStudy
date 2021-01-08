package com.WorkflowService.Fascade;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.WorkflowService.Entities.Request;

@FeignClient(name="order-registration-service")
@RibbonClient(name="order-registration-service")
public interface OrderRegisterationServiceProxy {
	
	@GetMapping("/o")
	public List<Request> fetchAllRequests();


}
