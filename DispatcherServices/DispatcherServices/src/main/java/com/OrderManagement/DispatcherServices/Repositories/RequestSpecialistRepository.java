package com.OrderManagement.DispatcherServices.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OrderManagement.DispatcherServices.Model.RequestSpecialistMapping;
@Repository
public interface RequestSpecialistRepository extends JpaRepository <RequestSpecialistMapping,Integer>{

}
