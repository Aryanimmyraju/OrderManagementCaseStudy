package com.OrderManagement.DispatcherServices.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OrderManagement.DispatcherServices.Model.RequestSpecialistMapping;
import com.OrderManagement.DispatcherServices.Model.Services;
import com.OrderManagement.DispatcherServices.Repositories.RequestSpecialistRepository;
import com.OrderManagement.DispatcherServices.Repositories.SpecialistProxy;

@Service
public class MappingService {
	
	@Autowired
	private SpecialistProxy specialistProxy;
	
	
	
	@Autowired
	private RequestSpecialistRepository requestSpecialistRepository;
	
	public List<RequestSpecialistMapping> getAllRequestSpecialistMappings()
	{
		List<RequestSpecialistMapping> list = requestSpecialistRepository.findAll();
		return list;
		
	}
	
	public void saveMapping(RequestSpecialistMapping requestSpecialistMapping)
	{
		
		requestSpecialistRepository.save(requestSpecialistMapping);
	}
	
	
	
	

}
