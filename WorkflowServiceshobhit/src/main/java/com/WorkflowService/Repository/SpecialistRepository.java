package com.WorkflowService.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.WorkflowService.Entities.Specialists;

@Repository
public interface SpecialistRepository extends JpaRepository <Specialists,Integer> {

	
	List<Specialists> getServiceByspecialistId(int no);
	
	

	List<Specialists> getSpecialistByspecialistName(String no);

}
