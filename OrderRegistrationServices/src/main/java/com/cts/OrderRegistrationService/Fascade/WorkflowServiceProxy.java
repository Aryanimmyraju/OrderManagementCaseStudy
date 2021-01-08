package com.cts.OrderRegistrationService.Fascade;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cts.OrderRegistrationService.Entities.RequestInfo;

@FeignClient(name="workflow-service")
@RibbonClient(name = "workflow-service")
public interface WorkflowServiceProxy {
	

	@PostMapping(value="/Register/addnewOrder")
	public ResponseEntity<Object> addCustomer(@RequestBody RequestInfo info);


}
