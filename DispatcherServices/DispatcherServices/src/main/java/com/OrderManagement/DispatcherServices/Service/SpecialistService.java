package com.OrderManagement.DispatcherServices.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.OrderManagement.DispatcherServices.Model.Services;
import com.OrderManagement.DispatcherServices.Model.Specialists;
import com.OrderManagement.DispatcherServices.Repositories.SpecialistProxy;
import com.OrderManagement.DispatcherServices.Repositories.SpecialistRepository;

@Service
public class SpecialistService {
	
	@Autowired
	SpecialistProxy specialistProxy;
	
	@Autowired
	SpecialistRepository specialistRepository;
	

	public List<Specialists> getServiceByspecialistId(int no) {
		List<Specialists> tr = specialistProxy.getServiceByspecialistId(no);
		return tr;
	}
	
	
	public List<Specialists> getSpecialistbyName(String no){
		List<Specialists> tr = specialistProxy.getSpecialistbyName(no);
		return tr;
	}

	public List<Specialists> getAllSpecialists() {
		List<Specialists> tr = specialistProxy.getAllSpecialists();
		  List<Specialists> availableSpecialists = new ArrayList<>();
		  for (Specialists specialists : tr) {
			  if(specialists.getStatus().equalsIgnoreCase("available"))
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
