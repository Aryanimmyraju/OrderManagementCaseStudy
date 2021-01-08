package com.cts.OrderRegistrationService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.cts.OrderRegistrationService.Entities.RequestInfo;

public interface Orders extends JpaRepository<RequestInfo, Integer>{

}
