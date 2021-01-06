package com.OrderManagement.DispatcherServices.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OrderManagement.DispatcherServices.Model.Request;





@Repository
public interface RequestRepository extends JpaRepository <Request,Integer>{

}
