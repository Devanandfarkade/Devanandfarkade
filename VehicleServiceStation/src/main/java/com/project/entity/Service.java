package com.project.entity;

import java.io.Serializable;

public abstract class Service implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String type;
	private double total_cost;
	private String remark;
	private int Service_request_id;

	public Service(String type) {
		super();
		this.type = type;
	}

	public Service() {

	}

	public Service(int id, String type, double total_cost, String remark) {
		super();
		this.id = id;
		this.type = type;
		this.total_cost = total_cost;
		this.remark = remark;
	}

	public void setService_request_id(int service_request_id) {
		this.Service_request_id = service_request_id;
	}

	public Service(int id, String type, double total_cost, String remark, int service_request_id) {
		super();
		this.id = id;
		this.type = type;
		this.total_cost = total_cost;
		this.remark = remark;
		Service_request_id = service_request_id;
	}

	public Service(int id, String type, double labour_charges, double total_cost, String remark,
			int service_request_id2) {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getTotal_cost() {
		return total_cost;
	}

	public void setTotal_cost(double total_cost) {
		this.total_cost = total_cost;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public abstract void acceptService();

	public abstract void calculateTotalCost();

	public int getService_request_id() {
		// TODO Auto-generated method stub
		return this.Service_request_id;
	}

	@Override
	public String toString() {
		return "Service [id=" + id + ", type=" + type + ", total_cost=" + total_cost + ", remark=" + remark
				+ ", Service_request_id=" + Service_request_id + "]";
	}

}
