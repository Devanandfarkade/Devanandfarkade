package com.project.entity;

import java.util.Scanner;

public class Oil extends Service {

	private double oil_cost;

	public Oil() {
		super("oil");
	}

	public Oil(double oil_cost) {
//		super(type);
		this.oil_cost = oil_cost;
	}

	public Oil(int id, String type, double oil_cost, double total_cost, String remark) {
		super("oil");

	}

	public double getOil_cost() {
		return oil_cost;
	}

	public void setOil_cost(double oil_cost) {
		this.oil_cost = oil_cost;
	}

	

	@Override
	public void acceptService() {
		System.out.println("Enter Oil cost = ");
		oil_cost = new Scanner(System.in).nextDouble();
		calculateTotalCost();
	}

	@Override
	public void calculateTotalCost() {

		double total_cost = this.getTotal_cost() + this.oil_cost;
		this.setTotal_cost(total_cost);
		System.out.println("Enter Remark: ");
		this.setRemark(new Scanner(System.in).next());
	}
	@Override
	public String toString() {
		return "Oil [oil_cost=" + oil_cost + "]";
	}
}
