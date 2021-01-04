package com.OrderManagement.DispatcherServices.Model;


public class Specialists {
	
	private int specialistId;
	
	private String specialistName;
	
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

	@Override
	public String toString() {
		return "Specialists [specialistId=" + specialistId + ", specialistName=" + specialistName + ", status=" + status
				+ "]";
	}
	
	
	

}
