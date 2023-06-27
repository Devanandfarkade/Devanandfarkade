package com.project.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Maintainance extends Service{

	
	private static final long serialVersionUID=1L;
	private double labourCharges;
	private double parts_cost;
	private List<ServiceParts>partList;
	public Maintainance() {
		super("Maintainance");
		this.labourCharges=0;
		this.partList=new  ArrayList<ServiceParts>();
		
	}

	
	public Maintainance(int id, String type, double total_cost, String remark) {
		super(id, type, total_cost, remark);
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
		
	}

	public Maintainance(int id, String type, double labour_charges, double total_cost, String remark, int service_request_id) {
		
		
	}

	@Override
	public void acceptService() {
		System.out.println("Enter Labour chager: ");
		labourCharges =new Scanner(System.in).nextDouble();
		System.out.println("Enter Remark : ");
		this.setRemark(new Scanner(System.in).next());
		calculateTotalCost();
		
	}
	@Override
	public void calculateTotalCost() {
		double total_cost=this.getTotal_cost()+this.labourCharges;
		this.setTotal_cost(total_cost);
		
	}
	@Override
	public String toString() {
		return super.toString()+"Maintainance [labourCharges=" + labourCharges + ", parts_cost=" + parts_cost + ", partList=" + partList
				+ "]";
	}
}
