package com.OrderManagement.DispatcherServices.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

	public Specialists(int specialistId, String specialistName, String status) {
		super();
		this.specialistId = specialistId;
		this.specialistName = specialistName;
		this.status = status;
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
