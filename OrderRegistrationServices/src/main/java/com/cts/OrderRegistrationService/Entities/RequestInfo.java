package com.cts.OrderRegistrationService.Entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="requestinfo")
public class RequestInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "request_Id")
	private int requestId;
	
	@Column(name = "firstname")
	private String firstName;
	
	@Column(name = "lastname")
	private String lastName;
	
	@Column(name = "startdate")
	private LocalDate startDate;
	
	@Column(name = "enddate")
	private LocalDate endDate;
	
	@Column(name = "priority")
	private String priority;
	
	@Column(name = "complexity")
	private String complexity;
	
	
	@Column(name = "emailid")
	private String emailId;
	
	@Column(name="registration_Status")
	private String registrationStatus;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "service_Id", referencedColumnName = "service_Id")
	private Services serviceId;
	
	public String getRegistrationStatus() {
		return registrationStatus;
	}
	public void setRegistrationStatus(String registrationStatus) {
		this.registrationStatus = registrationStatus;
	}
	
	
	
	public RequestInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getComplexity() {
		return complexity;
	}
	public void setComplexity(String complexity) {
		complexity = complexity;
	}
	public Services getServiceId() {
		return serviceId;
	}
	public void setServiceId(Services serviceId) {
		this.serviceId = serviceId;
	}
	
	

}
