package com.WorkflowService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.WorkflowService.Entities.Services;
@Repository
public interface ServiceRepository extends JpaRepository <Services,Integer>{

}
