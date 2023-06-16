package com.project.services;

import java.util.Scanner;

import com.project.dao.VehicleDao;
import com.project.entity.Customer;
import com.project.entity.CustomerVehicle;
import com.project.entity.Vehicle;
import com.project.main.SubMenu;

public class ServiceReqService {

	public static String selectCusomer() {

		VehicleService.getSpecificVehicle();
		Scanner choice = new Scanner(System.in);
		System.out.print("Is it new vehicle...? if YES then press 0 Otherwise press 1 =");
		int id = choice.nextInt();
		if (id == 1) {
				System.out.println("choose vehicle number from list OR input detail of vehicle =");
				String vehicle_number=choice.next();
				return vehicle_number;
		}
		else{
		System.out.println("Please Enter 0 to go back ans 1st you have to enter Customer_vehiles ");
		return null;
	}
//		if (vehicleNo == null) {
//		
//			System.out.print("Enter Customer ID = ");
//			String customer_id = new Scanner(System.in).next();
//			System.out.println("Enter Vehicle ID =");
//			String vhicle_id = new Scanner(System.in).next();
//			
//			VehicleService.getAllVehicle();
//			System.out.println("Select The Vehicle --> ");
//			System.out.println("Enter The Vehicle id or Enter 0 for adding the company & Model ");
//			int id=new Scanner(System.in).nextInt();
//			
//			if(id == 0) {
//				System.out.println("Enter Company name =");
//				String company=new Scanner(System.in).next();
//				System.out.println("Enter Company name =");
//				String model=new Scanner(System.in).next();
//			}
//			VehicleDao vehicleDao = new VehicleDao();
//
//			vehicleDao.addVehicle(new Vehicle(company, model));
//			System.out.println("Vehicle Added ....!!!");
//
//		} else {
//			VehicleDao vehicleDao = new VehicleDao();
//			vehicleDao.customerVehicle(new CustomerVehicle(vehicleNo, vehicleNo,id));
//
//			System.out.println("Vehicle  Added.....!!!! ");
//
//		}
	}

	public static void processRequest() {
		if (ServiceReqService.selectCusomer() == null) {
			System.out.println("first select customer");
		}
		SubMenu.processRequest();
	}
}
