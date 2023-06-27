package com.project.services;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.project.dao.VehicleDao;
import com.project.entity.Customer;
import com.project.entity.CustomerVehicle;
import com.project.entity.SpecificCustomerVehicle;
import com.project.entity.Vehicle;
import com.project.main.SubMenu;

public class ServiceReqService {

	public static String selectCusomer() {
		List<SpecificCustomerVehicle>vehicles=VehicleService.getSpecificVehicle();;
		for (int i=0;i<vehicles.size();i++ ) {
			System.out.println((i+1)+" "+vehicles.get(i));
			
		}
		
		Scanner choice = new Scanner(System.in);
		System.out.print("Is it new vehicle...?---> if YES then press --> 0 <- Otherwise press -> 1 <- =");
		int id = choice.nextInt();
		if (id == 1) {
				System.out.println("choose vehicle Index from List  =");
				int vehicleSeq=choice.nextInt();
				return vehicles.get(vehicleSeq-1).getVehicle_number();
		}
		else{
		System.out.println("Please Enter --0-- to go back ans 1st you have to enter Customer_vehiles ");
		return null;
	}

	}
	

	public static void processRequest() {
		if (ServiceReqService.selectCusomer() == null) {
			System.out.println("first select customer");
		}
		SubMenu.processRequest();
	}
}
