package com.OrderManagement.DispatcherServices.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.OrderManagement.DispatcherServices.Model.Specialists;


@Repository
public interface SpecialistRepository extends JpaRepository <Specialists,Integer> {

	
	List<Specialists> getServiceByspecialistId(int no);
	
	
	@Query("select s from Specialists s where s.specialistName=:no")
	List<Specialists> getSpecialistbyName(String no);

}
