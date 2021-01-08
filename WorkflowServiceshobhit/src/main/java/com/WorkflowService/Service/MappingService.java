package com.WorkflowService.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WorkflowService.Entities.RequestSpecialistMapping;
import com.WorkflowService.Repository.RequestSpecialistRepository;

@Service
public class MappingService {

	@Autowired
	private RequestSpecialistRepository requstSpecialistRepository;

	/*
	 * @Autowired private RequestSpecialistRepository requestSpecialistRepository;
	 * 
	 * public List<RequestSpecialistMapping> getAllRequestSpecialistMappings() {
	 * List<RequestSpecialistMapping> list = requestSpecialistRepository.findAll();
	 * 
	 * List<RequestSpecialistMapping> finalList = new ArrayList<>(); for
	 * (RequestSpecialistMapping rsm:list) {
	 * if(rsm.getStatus().equalsIgnoreCase("no")) { finalList.add(rsm); } }
	 * Collections.sort(finalList, new Comparator<RequestSpecialistMapping>() {
	 * public int compare(RequestSpecialistMapping o1, RequestSpecialistMapping o2)
	 * { return o1.getStartDate().compareTo(o2.getStartDate()); } });
	 * 
	 * return list;
	 * 
	 * }
	 */

	public void saveMapping(RequestSpecialistMapping requestSpecialistMapping) {

		requstSpecialistRepository.save(requestSpecialistMapping);
	}

}
