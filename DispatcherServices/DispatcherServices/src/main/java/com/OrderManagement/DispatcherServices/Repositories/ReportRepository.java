package com.OrderManagement.DispatcherServices.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OrderManagement.DispatcherServices.Model.ReportData;

@Repository
public interface ReportRepository extends JpaRepository <ReportData,Integer>{

}
