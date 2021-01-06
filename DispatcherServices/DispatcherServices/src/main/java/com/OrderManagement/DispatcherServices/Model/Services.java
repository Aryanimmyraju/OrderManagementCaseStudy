package com.OrderManagement.DispatcherServices.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


public class Services {
	
	
	private int serviceId;
	
	
	private String serviceName;
	
	
	private double serviceAmount;
	
	

	public Services(int serviceId, String serviceName, double serviceAmount) {
		super();
		this.serviceId = serviceId;
		this.serviceName = serviceName;
		this.serviceAmount = serviceAmount;
	}

	public Services() {
		super();
	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public double getServiceAmount() {
		return serviceAmount;
	}

	public void setServiceAmount(double serviceAmount) {
		this.serviceAmount = serviceAmount;
	}
	
	
	

}
