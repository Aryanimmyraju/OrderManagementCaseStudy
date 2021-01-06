package com.OrderManagement.DispatcherServices.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OrderManagement.DispatcherServices.Model.Services;

@Repository
public interface ServiceRepository extends JpaRepository <Services,Integer>{

}
