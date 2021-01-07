package com.OrderManagement.DispatcherServices.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OrderManagement.DispatcherServices.Model.ReportData;
import com.OrderManagement.DispatcherServices.Model.RequestSpecialistMapping;
import com.OrderManagement.DispatcherServices.Service.MappingService;
import com.OrderManagement.DispatcherServices.Service.reportService;

@RestController
public class ReportController {
	
	@Autowired
	private MappingService mappingService;
	
	@Autowired
	private reportService reportService;
	
	
	
	@GetMapping("/reportdata")
	public List<ReportData> reportDatas(){
		List<RequestSpecialistMapping> requestSpecialistMappings= mappingService.getAllRequestSpecialistMappings();
		System.out.println(requestSpecialistMappings);
		for(RequestSpecialistMapping requestSpecialistMapping: requestSpecialistMappings) {
			ReportData reportData = new ReportData();
			reportData.setRequestId(requestSpecialistMapping.getRequestId().getRequestId());
			reportData.setSpecialistId(requestSpecialistMapping.getSpecialistId().getSpecialistId());
			reportData.setRequestStatus(requestSpecialistMapping.getRequestId().getStatus());
			reportData.setStartDate(requestSpecialistMapping.getStartDate());
			reportData.setEndDate(requestSpecialistMapping.getEndDate());
			reportData.setServiceType(requestSpecialistMapping.getSpecialistId().getSpecialistName());
			reportData.setPriority(requestSpecialistMapping.getRequestId().getPriority());
			reportService.SaveReport(reportData);
		}
		List<ReportData> reportDatas =reportService.getAll();
		return reportDatas;		
		
	}

}
