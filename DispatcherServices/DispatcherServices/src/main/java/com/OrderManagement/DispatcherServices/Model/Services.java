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
@Table(name="Services")
public class Services {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="service_Id")
	private int serviceId;
	
	@Column(name="service_Name")
	private String serviceName;
	
	@Column(name="service_Amount")
	private double serviceAmount;
	
	@ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            })
    @JoinTable(name = "service_specialist",
            joinColumns = { @JoinColumn(name = "service_Id") },
            inverseJoinColumns = { @JoinColumn(name = "specialist_Id") })
    private List<Specialists> specialists = new ArrayList();

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
