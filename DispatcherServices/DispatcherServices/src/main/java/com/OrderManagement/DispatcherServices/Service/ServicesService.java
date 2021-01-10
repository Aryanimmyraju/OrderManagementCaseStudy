package com.OrderManagement.DispatcherServices.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OrderManagement.DispatcherServices.Model.Services;
import com.OrderManagement.DispatcherServices.Repositories.ServiceRepository;
import com.OrderManagement.DispatcherServices.Repositories.SpecialistRepository;

@Service
public class ServicesService {
	
	
	
	@Autowired
	private ServiceRepository serviceRepository;
	
	public void saveAll(List<Services> list)
	{
		for(Services services: list)
		{
			serviceRepository.save(services);
		}
	}
	public List<Services> getAll()
	{
		List<Services> services=serviceRepository.findAll();
		return services;
	}

}
