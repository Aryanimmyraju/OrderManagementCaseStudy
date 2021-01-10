package com.OrderManagement.DispatcherServices.Model;

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


/*
@Entity
@Table(name="requestinfo")*/
public class RequestInfo {
	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy = GenerationType.IDENTITY)
	 * 
	 * @Column(name = "request_Id")
	 */
	private int requestId;
	
	/* @Column(name="userId") */
	private int userId;
	
	//@Column(name = "firstname")
	private String firstName;
	
	//@Column(name = "lastname")
	private String lastName;
	
	//@Column(name = "startdate")
	private LocalDate startDate;
	
	//@Column(name = "enddate")
	private LocalDate endDate;
	
	//@Column(name = "priority")
	private String priority;
	
	//@Column(name = "complexity")
	private String complexity;
	
	//@Column(name="servicetype")
	private String ServiceType;
	
	//@Column(name = "emailid")
	private String emailId;
	
	//@Column(name="Description")
	private String Description;
	
	//@Column(name="registration_Status")
	private String RequesterStatus;

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getComplexity() {
		return complexity;
	}

	public void setComplexity(String complexity) {
		this.complexity = complexity;
	}

	public String getServiceType() {
		return ServiceType;
	}

	public void setServiceType(String serviceType) {
		ServiceType = serviceType;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getRequesterStatus() {
		return RequesterStatus;
	}

	public void setRequesterStatus(String requesterStatus) {
		RequesterStatus = requesterStatus;
	}

	public RequestInfo(int requestId, int userId, String firstName, String lastName, LocalDate startDate,
			LocalDate endDate, String priority, String complexity, String serviceType, String emailId,
			String description, String requesterStatus) {
		super();
		this.requestId = requestId;
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.priority = priority;
		this.complexity = complexity;
		ServiceType = serviceType;
		this.emailId = emailId;
		Description = description;
		RequesterStatus = requesterStatus;
	}
	
	
}