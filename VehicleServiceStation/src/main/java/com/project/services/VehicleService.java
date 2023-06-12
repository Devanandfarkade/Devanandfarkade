package com.project.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
	//display all Vehicles
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
	//display Specific Vehicle
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
	public static void updateVehicle() {
		Scanner choice=new Scanner(System.in);
			System.out.print("Enter Vehicle id for update = ");
			int id=choice.nextInt();
			System.out.print("Enter Vehicle number for update = ");
			String company=choice.next();
			
			try (VehicleDao vehicleDao =new VehicleDao()){
				if (vehicleDao.updateVehicle(id,company)>0) {
					System.out.println("Vehicle data updated successfully...");
				}else
				{
					System.out.println("Vehicle Not  found .....");
				}
				
			} catch (Exception e) {// SQLException needed
				e.printStackTrace();
			}
	}
	public static void deleteVehicle() {
		System.out.print("enter Vehicle id to delete details of Vehicle = ");
		int id =new Scanner(System.in).nextInt();
		try {
			VehicleDao vehicleDao=new VehicleDao();
			if(vehicleDao.deleteVehicle(id)>0) {
				System.out.println("Vehicle data successfully deleted....!!!");
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
