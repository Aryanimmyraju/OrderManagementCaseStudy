package com.OrderManagement.DispatcherServices.Model;

import java.time.LocalDate;
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
public class RequestSpecialistMapping implements Comparable<RequestSpecialistMapping>{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Request_Specialist_Id")
	private int RequestSpecialistId;
	

	
	  @OneToOne(cascade = CascadeType.ALL)
	  
	  @JoinColumn(name = "request_Id", referencedColumnName = "request_Id") 
	  private Request requestId;
	  
	  

	  @OneToOne(cascade = CascadeType.ALL)
	  @JoinColumn(name = "specialist_Id", referencedColumnName = "specialist_Id") 
	  private Specialists specialistId;
	 
	
	
	@Column(name="status")
	private String status;
	
	@Column(name="start_Date")
	private LocalDate startDate;
	
	@Column(name="end_Date")
	private Date endDate;

	public RequestSpecialistMapping(int requestSpecialistId, Request requestId, Specialists specialistId, String status,
			LocalDate startDate, Date endDate) {
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

	public Request getRequestId() {
		return requestId;
	}

	public void setRequestId(Request requestId) {
		this.requestId = requestId;
	}

	public Specialists getSpecialistId() {
		return specialistId;
	}

	public void setSpecialistId(Specialists specialistId) {
		this.specialistId = specialistId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate localDate) {
		this.startDate = localDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	@Override
	  public int compareTo(RequestSpecialistMapping o) {
	    if (getStartDate() == null || o.startDate == null)
	      return 0;
	    return getStartDate().compareTo(o.getStartDate());
	  }
	
	

	
	

}
