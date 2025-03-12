package com.jsp.spring.vms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehicle {
	@Id
	private int vehicleId;
	private String vehicleModel;
	private String vehicleBrand;
	private String vehicleType;
	private int vehiclePrice;
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public String getVehicleBrand() {
		return vehicleBrand;
	}
	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public int getVehiclePrice() {
		return vehiclePrice;
	}
	public void setVehiclePrice(int vehiclePrice) {
		this.vehiclePrice = vehiclePrice;
	}
	
	
}
