package com.OrderManagement.DispatcherServices.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OrderManagement.DispatcherServices.Model.ReportData;
import com.OrderManagement.DispatcherServices.Repositories.ReportRepository;

@Service
public class reportService {
	
	@Autowired
	private ReportRepository reportRepository;
	
	public List<ReportData> getAll()
	{
		List<ReportData> reportDatas = reportRepository.findAll();
		return reportDatas;
	}
	
	public void SaveReport(ReportData reportData)
	{
		reportRepository.save(reportData);
	}

}
