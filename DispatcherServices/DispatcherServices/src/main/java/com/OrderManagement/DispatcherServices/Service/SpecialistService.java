package com.OrderManagement.DispatcherServices.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.OrderManagement.DispatcherServices.Model.Services;
import com.OrderManagement.DispatcherServices.Model.Specialists;
import com.OrderManagement.DispatcherServices.Repositories.SpecialistRepository;
import com.OrderManagement.DispatcherServices.Repositories.WorkflowProxy;

@Service
public class SpecialistService {
	
	@Autowired
	WorkflowProxy specialistProxy;
	
	@Autowired
	SpecialistRepository specialistRepository;
	
	
	

	public List<Specialists> getServiceByspecialistId(int no) {
		List<Specialists> tr = specialistRepository.getServiceByspecialistId(no);
		return tr;
	}
	
	
	public List<Specialists> getSpecialistbyName(String no){
		List<Specialists> tr = specialistRepository.getSpecialistbyName(no);
		return tr;
	}
	public List<Specialists> getSpecialistbyRequestId(int no){
		List<Specialists> tr = specialistProxy.getSpecialistbyRequestId(no);
		return tr;
	}

	public List<Specialists> getAllSpecialists() {
		List<Specialists> tr = specialistRepository.findAll();
		  
		  return tr;
	}
	public List<Specialists> getAllAvaSpecialists() {
		List<Specialists> tr = specialistRepository.findAll();
		  List<Specialists> availableSpecialists = new ArrayList<>();
		  for (Specialists specialists : tr) {
			  if(specialists.getStatus().equalsIgnoreCase("free"))
			  {
			availableSpecialists.add(specialists);
			  }
	  }
		  return availableSpecialists;
	}
	
	public void saveAll(List<Specialists> list)
	{
		for(Specialists specialist: list)
		{
			specialistRepository.save(specialist);
		}
	}

	
	
	

}
