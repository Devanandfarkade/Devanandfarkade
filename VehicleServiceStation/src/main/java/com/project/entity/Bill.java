package com.project.entity;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.project.dao.PartsDao;
import com.project.services.CustomerService;
import com.project.services.ServiceReqService;
import com.project.services.ServiceSerivice;
import com.project.services.VehicleService;
import com.project.entity.ServiceRequest;

public class Bill {
	private Customer customer;
	private CustomerVehicle customerVehicle;
	private ServiceRequest serviceRequest;
	private Map<PartsDao, Integer>partsList;
	
	public void preparedBill() {
		try {
			Scanner sc=new Scanner(System.in);
			List<ServiceRequest>serviceRequestsList=ServiceSerivice.fetchTodayServiceList();
			System.out.println("Enter Service Request ID =");
			int id=new Scanner(System.in).nextInt();
			this.serviceRequest=serviceRequestsList.get(serviceRequestsList.indexOf(new ServiceRequest(id)));
			if (this.serviceRequest !=  null) {
				ServiceSerivice.serviceProvided(serviceRequest);
				
				double bill=0;
				for(Service service: serviceRequest.getServiceList()) {
					 bill = bill +service.getTotal_cost();
				}
				this.serviceRequest.setBill_amount(bill);
				ServiceReqService.addBill(bill,this.serviceRequest.getId(),serviceRequest);
			}
			else {
				System.out.println("Service does not Exists...");
			}
		} catch (Exception e) {
			e.printStackTrace();		}
	}
//	private void fetchAllData() {
//		this.customerVehicle=VehicleService.getSpecificVehicles(this.serviceRequest.getVehicle_number());
//		this.customer=CustomerService.getSpecificCustomer(this.serviceRequest.getVehicle_number());
//		List<Service> serviceList=this.serviceRequest.getServiceList();
//		Maintainance maintainance=null;
//		for(Service service:serviceList) {
//			if(service instanceof Maintainance)
//			maintainance =(Maintainance)service;
//		}
//		

//	}
}
