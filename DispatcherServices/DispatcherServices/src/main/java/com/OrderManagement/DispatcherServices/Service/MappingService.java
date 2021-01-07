package com.OrderManagement.DispatcherServices.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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
		/*
		 * List<RequestSpecialistMapping> finalList = new ArrayList<>(); for
		 * (RequestSpecialistMapping rsm:list) {
		 * if(rsm.getStatus().equalsIgnoreCase("no")) { finalList.add(rsm); } }
		 * Collections.sort(finalList, new Comparator<RequestSpecialistMapping>() {
		 * public int compare(RequestSpecialistMapping o1, RequestSpecialistMapping o2)
		 * { return o1.getStartDate().compareTo(o2.getStartDate()); } });
		 */
		return list;
		
	}
	
	public void saveMapping(RequestSpecialistMapping requestSpecialistMapping)
	{
		
		requestSpecialistRepository.save(requestSpecialistMapping);
	}
	
	
	
	

}
