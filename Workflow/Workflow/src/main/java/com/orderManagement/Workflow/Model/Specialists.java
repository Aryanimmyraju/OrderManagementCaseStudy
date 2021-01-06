package com.orderManagement.Workflow.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity	
@Table(name="Specialists")
public class Specialists {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="specialist_Id")
	private int specialistId;
	
	@Column(name="specialist_Name")
	private String specialistName;
	
	
	@Column(name="status")
	private String status;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "service_Id", referencedColumnName = "service_Id")
	private Services servicesid;

	

	public Specialists(int specialistId, String specialistName, String status, Services servicesid) {
		super();
		this.specialistId = specialistId;
		this.specialistName = specialistName;
		this.status = status;
		this.servicesid = servicesid;
	}

	public Services getServicesid() {
		return servicesid;
	}

	public void setServicesid(Services servicesid) {
		this.servicesid = servicesid;
	}

	public Specialists() {
		super();
	}

	public int getSpecialistId() {
		return specialistId;
	}

	public void setSpecialistId(int specialistId) {
		this.specialistId = specialistId;
	}

	public String getSpecialistName() {
		return specialistName;
	}

	public void setSpecialistName(String specialistName) {
		this.specialistName = specialistName;
	}

	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
