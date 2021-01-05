package com.orderManagement.Workflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.orderManagement.Workflow.Model.Specialists;
import com.orderManagement.Workflow.Repository.SpecialistRepository;
import com.orderManagement.Workflow.service.specialistService;


@RestController
public class SpecialistController {
	
	@Autowired
	private specialistService specialistService;
	
	
	
	@GetMapping("specialist/{specialistId}")
	public List<Specialists> getSpecialistbyID(@PathVariable("specialistId") int no){
	
		List<Specialists> transaction = specialistService.getServiceByspecialistId(no);
		return transaction;
	}
	
	@GetMapping("specialists/{SpecialistName}")
	public List<Specialists> getSpecialistbyName(@PathVariable("SpecialistName") String no){
	
		List<Specialists> transaction = specialistService.getSpecialistByspecialistName(no);
		return transaction;
	}
	@GetMapping("/specialists") public List<Specialists> getAllSpecialists(){
		  List<Specialists> tr = specialistService.getAllSpecialists();
		  
		  return tr; }
	

}
