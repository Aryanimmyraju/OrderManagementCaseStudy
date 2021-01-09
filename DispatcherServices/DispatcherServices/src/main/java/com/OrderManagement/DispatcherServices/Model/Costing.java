package com.OrderManagement.DispatcherServices.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

public class Costing {
	
	private int CostId;

	private Request requestId;
	

	private Services serviceId;
	
	
	private double cost;
	
	private String CostStatus;
	
	
	public Costing() {
		this.CostStatus="Approved";
	}
	
	public int getCostId() {
		return CostId;
	}

	public void setCostId(int costId) {
		CostId = costId;
	}

	public String getCostStatus() {
		return CostStatus;
	}

	public void setCostStatus(String costStatus) {
		CostStatus = costStatus;
	}

	public Request getRequestId() {
		return requestId;
	}
	public void setRequestId(Request requestId) {
		this.requestId = requestId;
	}
	public Services getServiceId() {
		return serviceId;
	}
	public void setServiceId(Services serviceId) {
		this.serviceId = serviceId;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	

}
