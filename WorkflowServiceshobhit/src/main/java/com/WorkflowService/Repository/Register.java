package com.WorkflowService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.WorkflowService.Entities.Request;

public interface Register extends JpaRepository<Request, Integer>{

}
