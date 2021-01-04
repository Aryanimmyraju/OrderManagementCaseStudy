package com.OrderManagement.DispatcherServices.Model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity	
@Table(name="RequestSpecialistMapping")
public class RequestSpecialistMapping {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Request_Specialist_Id")
	private int RequestSpecialistId;
	
	@Column(name="request_Id")
	private int requestId;
	
	@Column(name="specialist_Id")
	private int specialistId;
	
	@Column(name="status")
	private String status;
	
	@Column(name="start_Date")
	@Temporal(TemporalType.DATE)
	private Date startDate;
	
	@Column(name="end_Date")
	private Date endDate;

	public RequestSpecialistMapping(int requestSpecialistId, int requestId, int specialistId, String status,
			Date startDate, Date endDate) {
		super();
		RequestSpecialistId = requestSpecialistId;
		this.requestId = requestId;
		this.specialistId = specialistId;
		this.status = status;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public RequestSpecialistMapping() {
		super();
	}

	public int getRequestSpecialistId() {
		return RequestSpecialistId;
	}

	public void setRequestSpecialistId(int requestSpecialistId) {
		RequestSpecialistId = requestSpecialistId;
	}

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public int getSpecialistId() {
		return specialistId;
	}

	public void setSpecialistId(int specialistId) {
		this.specialistId = specialistId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	

	
	

}
