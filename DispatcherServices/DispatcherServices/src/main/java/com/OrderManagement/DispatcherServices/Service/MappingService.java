package com.OrderManagement.DispatcherServices.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OrderManagement.DispatcherServices.Model.Request;
import com.OrderManagement.DispatcherServices.Model.RequestSpecialistMapping;
import com.OrderManagement.DispatcherServices.Model.Services;
import com.OrderManagement.DispatcherServices.Model.Specialists;
import com.OrderManagement.DispatcherServices.Repositories.RequestRepository;
import com.OrderManagement.DispatcherServices.Repositories.RequestSpecialistRepository;
import com.OrderManagement.DispatcherServices.Repositories.SpecialistRepository;
import com.OrderManagement.DispatcherServices.Repositories.WorkflowProxy;

@Service
public class MappingService {
	
	@Autowired
	private RequestService reportService;
	@Autowired
	private WorkflowProxy specialistProxy;
	
	@Autowired
	private RequestRepository requestRepository;
	
	@Autowired
	private SpecialistRepository specialistRepository;
	
	@Autowired
	private RequestSpecialistRepository requestSpecialistRepository;
	
	
	public List<RequestSpecialistMapping> getAllRequestSpecialistMappings()
	{
		List<RequestSpecialistMapping> list = requestSpecialistRepository.findAll();
		return list;
		
	}
	
	public void saveMapping(RequestSpecialistMapping requestSpecialistMapping)
	{
		Request request=requestSpecialistMapping.getRequestId();
		request.setRegistrationStatus("yes");
		
		Specialists specialists=requestSpecialistMapping.getSpecialistId();
		specialists.setStatus("busy");
		requestRepository.save(request);
		specialistRepository.save(specialists);
		requestSpecialistRepository.save(requestSpecialistMapping);
	}

	public List<RequestSpecialistMapping> getAllAutoMappings() {
		List<Request> list=reportService.getAllUnassigned();
	
		for(Request request: list)
		{
			if(request.getPriority().equalsIgnoreCase("high")&&request.getComplexity().equalsIgnoreCase("low"))
			{
				RequestSpecialistMapping requestSpecialistMapping=new RequestSpecialistMapping();
				requestSpecialistMapping.setRequestId(request);
				request.setRegistrationStatus("yes");
				requestRepository.save(request);
				List<Specialists> list2=specialistRepository.findAll();
				requestSpecialistMapping.setSpecialistId(list2.get(1));
				list2.get(1).setStatus("busy");
				specialistRepository.save(list2.get(1));
				requestSpecialistMapping.setStatus("Assigned");
				requestSpecialistMapping.setStartDate(LocalDate.now());
				requestSpecialistRepository.save(requestSpecialistMapping);
			}
			
		}
		
		List<RequestSpecialistMapping> list4=requestSpecialistRepository.findAll();
		List<RequestSpecialistMapping> list3 = new ArrayList<>();
		for(RequestSpecialistMapping rsm:list4)
		{
			if(rsm.getRequestId().getComplexity().equalsIgnoreCase("low")&&rsm.getRequestId().getPriority().equalsIgnoreCase("high"))
			{
				list3.add(rsm);
			}
		}
		return list3;
	}
	
	
	
	

}
