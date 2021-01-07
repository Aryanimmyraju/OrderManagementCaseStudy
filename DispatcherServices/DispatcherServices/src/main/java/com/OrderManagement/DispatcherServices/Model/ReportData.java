package com.OrderManagement.DispatcherServices.Model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity	
@Table(name="ReportData")
public class ReportData {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Report_Data_Id")
	private int ReportDataId;
	
	@Column(name="Request_Id")
	private int RequestId;
	
	@Column(name="Specialist_Id")
	private int SpecialistId;
	
	@Column(name="request_Status")
	private String requestStatus;
	
	@Column(name="start_Date")
	private LocalDate startDate;
	
	@Column(name="end_Date")
	private Date endDate;
	
	@Column(name="service_Type")
	private String serviceType;
	
	@Column(name="priority")
	private String priority;

	public int getReportDataId() {
		return ReportDataId;
	}

	public void setReportDataId(int reportDataId) {
		ReportDataId = reportDataId;
	}

	public int getRequestId() {
		return RequestId;
	}

	public void setRequestId(int requestId) {
		RequestId = requestId;
	}

	public int getSpecialistId() {
		return SpecialistId;
	}

	public void setSpecialistId(int specialistId) {
		SpecialistId = specialistId;
	}

	public String getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public ReportData() {
		super();
	}

	public ReportData(int reportDataId, int requestId, int specialistId, String requestStatus, LocalDate startDate,
			Date endDate, String serviceType, String priority) {
		super();
		ReportDataId = reportDataId;
		RequestId = requestId;
		SpecialistId = specialistId;
		this.requestStatus = requestStatus;
		this.startDate = startDate;
		this.endDate = endDate;
		this.serviceType = serviceType;
		this.priority = priority;
	}
	
	
	
	
	

}
