package com.project.entity;

import java.io.Serializable;

public abstract class Service implements Serializable {

	private static final long serialVersionUID=1l;
	protected int id;
	protected String type;
	protected double total_cost;
	protected String remark;
	public Service(String type) {
		super();
		this.type=type;
	}
	
	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Service(int id, String type, double total_cost, String remark) {
		super();
		this.id = id;
		this.type = type;
		this.total_cost = total_cost;
		this.remark = remark;
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
	
}
