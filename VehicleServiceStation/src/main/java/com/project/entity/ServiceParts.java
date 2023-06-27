package com.project.entity;

public class ServiceParts {

	private int service_id;
	private int partid;
	public int getService_id() {
		return service_id;
	}
	public void setService_id(int service_id) {
		this.service_id = service_id;
	}
	private int quantity;
	
	public ServiceParts() {
	
	}
	public ServiceParts(int partid, int quantity) {
		super();
		this.partid = partid;
		this.quantity = quantity;
	}
	public int getPartid() {
		return partid;
	}
	public void setPartid(int partid) {
		this.partid = partid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public ServiceParts(int service_id, int partid, int quantity) {
		super();
		this.service_id = service_id;
		this.partid = partid;
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "ServiceParts [service_id=" + service_id + ", partid=" + partid + ", quantity=" + quantity + "]";
	}
	
}
