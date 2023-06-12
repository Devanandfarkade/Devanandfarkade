package com.project.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.project.dao.CustomerDao;
import com.project.dao.VehicleDao;
import com.project.entity.Customer;
import com.project.entity.Vehicle;

public class VehicleService {
	
	public static void addVehicle() {
		Scanner choice =new Scanner(System.in);
		System.out.println("Enter Vehicle id here =");
		int id=	choice.nextInt();
		System.out.println("Enter Vehicle Company here =");
		String company=choice.next();
		System.out.println("Enter Vehicle Model here =");
		String model=choice.next();
		System.out.println("Data inserted successfully....!!");
		
		Vehicle vehicle=new Vehicle(id,company,model);
		try (VehicleDao vehicleDao = new VehicleDao()){
			vehicleDao.addVehicle(vehicle);
		}  catch (Exception e) {	
			e.printStackTrace();
		}
	}
	public static void getAllVehicle() {
		List<Vehicle> vehicleList = new ArrayList<>();
		try (VehicleDao vehicleDao = new VehicleDao()){
			vehicleDao.getAllVehicle(vehicleList);
			for (Vehicle Vehicle : vehicleList) {
				System.out.println(Vehicle);
			}
		} catch (Exception e) {	
			e.printStackTrace();
			
		}
	}
	public static void getSpecificVehicle() {
		System.out.println("Enter Vehicle mobile Number = ");
		String  id =new Scanner(System.in).next();
		try (VehicleDao vehicleDao = new VehicleDao()){
			Vehicle vehicle=vehicleDao.getSpecificVehicle(id);
			if (vehicle != null) 
				System.out.println(vehicle);
			else 
				System.out.println("Vehicle is not found ...!");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
