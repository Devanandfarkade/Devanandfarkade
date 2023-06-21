package com.project.entity;

import java.util.ArrayList;
import java.util.List;

public class Maintainance extends Service{

	private static final long serialVersionUID=1L;
	private double labourCharges;
	private List<ServiceParts>partList;
	public Maintainance() {
		super("Maintainance");
		this.labourCharges=0;
		this.partList=new  ArrayList<ServiceParts>();
		
	}
	
	public Maintainance(int id, String type, double total_cost, String remark) {
		super(id, type, total_cost, remark);
		// TODO Auto-generated constructor stub
	}
	
	
	public double getLabourCharges() {
		return labourCharges;
	}

	public void setLabourCharges(double labourCharges) {
		this.labourCharges = labourCharges;
	}

	public List<ServiceParts> getPartList() {
		return partList;
	}

	public void setPartList(List<ServiceParts> partList) {
		this.partList = partList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Maintainance(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acceptService() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void calculateTotalCost() {
		// TODO Auto-generated method stub
		
	}
}
