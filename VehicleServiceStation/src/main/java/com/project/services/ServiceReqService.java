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
		System.out.println("Choose Vehicle_number  from the list or input detail of new vehicle ");
		String  vehicleNo = new Scanner(System.in).next();
		return vehicleNo;
		
		
		if (vehicleNo == null) {
		
			System.out.print("Enter Customer ID = ");
			String customer_id = new Scanner(System.in).next();
			System.out.println("Enter Vehicle ID =");
			String vhicle_id = new Scanner(System.in).next();
			
			VehicleService.getAllVehicle();
			System.out.println("Select The Vehicle --> ");
			System.out.println("Enter The Vehicle id or Enter 0 for adding the company & Model ");
			int id=new Scanner(System.in).nextInt();
			
			if(id == 0) {
				System.out.println("Enter Company name =");
				String company=new Scanner(System.in).next();
				System.out.println("Enter Company name =");
				String model=new Scanner(System.in).next();
			}
			VehicleDao vehicleDao = new VehicleDao();

			vehicleDao.addVehicle(new Vehicle(company, model));
			System.out.println("Vehicle Added ....!!!");

		} else {
			VehicleDao vehicleDao = new VehicleDao();
			vehicleDao.customerVehicle(new CustomerVehicle(vehicleNo, vehicleNo, id	));

			System.out.println("Vehicle  Added.....!!!! ");

		}
	}
	public static void processRequest() {
		if(ServiceReqService.selectCusomer()==null ) {
			System.out.println("first select customer");
		}
		SubMenu.processRequest();
	}
}
