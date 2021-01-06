package com.OrderManagement.DispatcherServices.Model;

public class Costing {
	
	private Request requestId;
	private Services serviceId;
	private double cost;
	
	
	public Costing() {
		super();
	}
	public Costing(Request requestId, Services serviceId, double cost) {
		super();
		this.requestId = requestId;
		this.serviceId = serviceId;
		this.cost = cost;
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
