package com.WorkflowService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.WorkflowService.Entities.RequestSpecialistMapping;


@Repository
public interface RequestSpecialistRepository extends JpaRepository <RequestSpecialistMapping,Integer>{

}
