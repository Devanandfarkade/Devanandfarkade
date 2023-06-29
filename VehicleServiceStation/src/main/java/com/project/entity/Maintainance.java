package com.project.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Maintainance extends Service {

	private static final long serialVersionUID = 1L;
	private double labourCharges;
	private double parts_cost;
	private List<ServiceParts> partsList;

	public Maintainance() {
		super("Maintainance");
		this.labourCharges = 0;
		this.partsList = new ArrayList<ServiceParts>();

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

	public List<ServiceParts> getPartsList() {
		return partsList;
	}

	public void setPartsList(List<ServiceParts> partsList) {
		this.partsList = partsList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Maintainance(String type) {

	}

	public Maintainance(int id, String type, double labour_charges, double total_cost, String remark,int service_request_id) {
		super(id,type,labour_charges,total_cost,remark,service_request_id);
		this.labourCharges=labour_charges;
	}

	

	public Object setParts_cost(Maintainance service) {
		// TODO Auto-generated method stub
		return null;
	}

	public Maintainance(String type, double labourCharges, double parts_cost, List<ServiceParts> partList) {
		super(type);
		this.labourCharges = labourCharges;
		this.parts_cost = parts_cost;
		this.partsList = partsList;
	}

	public double getParts_cost() {
		return parts_cost;
	}

	public void setParts_cost(double parts_cost) {
		this.parts_cost = parts_cost;
	}
	@Override
	public void acceptService() {
		System.out.println("Enter Labour chager: ");
		labourCharges = new Scanner(System.in).nextDouble();
		System.out.println("Enter Remark : ");
		this.setRemark(new Scanner(System.in).next());
		calculateTotalCost();

	}

	@Override
	public void calculateTotalCost() {
		double total_cost = this.getTotal_cost() + this.labourCharges;
		this.setTotal_cost(total_cost);

	}

	@Override
	public String toString() {
		return super.toString() + "Maintainance [labourCharges=" + labourCharges + ", parts_cost=" + parts_cost
				+ ", partList=" + partsList + "]";
	}
}
