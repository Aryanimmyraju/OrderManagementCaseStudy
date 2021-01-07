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
@Table(name="Request")
public class Request {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="request_Id")
	private int requestId;
	
	@Column(name="request_Name")
	private String requestName;
	
	@Column(name="user_Id")
	private int userId;
	
	@Column(name="start_Date")
	@Temporal(TemporalType.DATE)
	private Date startDate;
	
	@Column(name="end_Date")
	private Date endDate;
	
	@Column(name="priority")
	private String priority;
	
	@Column(name="complexity")
	private String complexity;
	
	@Column(name="Status")
	private String Status;
	
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "service_Id", referencedColumnName = "service_Id")
	private Services serviceId;

	public Request(int requestId, String requestName, int userId, Date startDate, Date endDate, String priority,
			String complexity, Services serviceId) {
		super();
		this.requestId = requestId;
		this.requestName = requestName;
		this.userId = userId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.priority = priority;
		this.complexity = complexity;
		this.serviceId = serviceId;
	}
	

	public Request(int requestId, String requestName, int userId, Date startDate, Date endDate, String priority,
			String complexity, String status, Services serviceId) {
		super();
		this.requestId = requestId;
		this.requestName = requestName;
		this.userId = userId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.priority = priority;
		this.complexity = complexity;
		this.Status = status;
		this.serviceId = serviceId;
	}


	public String getStatus() {
		return Status;
	}


	public void setStatus(String status) {
		Status = status;
	}


	public Request() {
		super();
	}

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public String getRequestName() {
		return requestName;
	}

	public void setRequestName(String requestName) {
		this.requestName = requestName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getComplexity() {
		return complexity;
	}

	public void setComplexity(String complexity) {
		this.complexity = complexity;
	}

	public Services getServiceId() {
		return serviceId;
	}

	public void setServiceId(Services serviceId) {
		this.serviceId = serviceId;
	}
	
	

}
