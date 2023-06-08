package com.project.main;

import java.util.Scanner;

public class SubMenu {

	enum EcustomerMenu {
		BACK,ADD_CUSTOMER,DISPLAY_ALL_CUSTOMER,DISPLAY_SPECIFIC,EDIT,DELETE,DEFAULT
	}
	
	public static EcustomerMenu customerMenu() {
		System.out.println("0. Back ");
		System.out.println("1. Add customer");
		System.out.println("2. Display All Customers");
		System.out.println("3. Display Specific Customer Details ");
		System.out.println("4. Edit Customer ");
		System.out.println("5. Delete Customer");
		System.out.println("Enter your choice ...!!!");
		int choice=new Scanner(System.in).nextInt();
		if (choice <0 || choice > 7)
			return EcustomerMenu.values()[7];
		else
			return EcustomerMenu.values()[choice];
				
	}
	public static void customerMain() {
		EcustomerMenu choice;
		while((choice =customerMenu())!=EcustomerMenu.BACK) {
			switch (choice) {
			case ADD_CUSTOMER:
				System.out.println("1. Add customer");

				break;
			case DISPLAY_ALL_CUSTOMER:
				System.out.println("2. Display All Customers");

				break;
			case DISPLAY_SPECIFIC:
				System.out.println("3. Display Specific Customer Details ");

				break;
			case EDIT:
				System.out.println("4. Edit Customer ");

				break;
			case DELETE:
				System.out.println("5. Delete Customer");

				break;

			default:
				System.out.println("Wrong choice ...:(");
				break;
			}
		}
	}
	
	enum EvehicleMenu{
		BACK,ADD_VEHICLE,DIPLAY_ALL_VEHICLES,DIPLAY_CUSTOMER_VEHICLES,EDIT,DELETE,DEFAULT
	}
	public static EvehicleMenu vehicleMenu() {
		System.out.println("0. Back");
		System.out.println("1. Add Vehicle ");
		System.out.println("2. Display All Vehicles ");
		System.out.println("3. Display Customer Vehicles ");
		System.out.println("4. Edit Vehicle ");
		System.out.println("5. Delete Vehicle ");
		System.out.println("Enter your Choice ....!!");
		
		int choice= new Scanner(System.in).nextInt();
		if(choice<0 ||choice >7)
			return EvehicleMenu.values()[7];
		else
			return EvehicleMenu.values()[choice];
	}
	public static void vehicleMain() {
		EvehicleMenu choice;
		while ((choice =vehicleMenu())!=EvehicleMenu.BACK) {
			switch (choice) {
			case ADD_VEHICLE:
				System.out.println("1. Add Vehicle ");
				break;
			case DIPLAY_ALL_VEHICLES:
				System.out.println("2. Display All Vehicles ");
				break;
			case DIPLAY_CUSTOMER_VEHICLES:
				System.out.println("3. Display Customer Vehicles ");
		
				break;
			case EDIT:
				System.out.println("4. Edit Vehicle ");

				break;
			case DELETE:
				System.out.println("5. Delete Vehicle ");

				break;
			default:
				System.out.println("Wrong choice ...:(");
				break;
			}
		}
	}
	
	
	public static int serviceMenu() {
		System.out.println("0 .back");
		System.out.println("1. Select Customer Vehicle");
		System.out.println("2. Process Request");
		System.out.println("3. Prepare and Display Bill");
		System.out.println("4. Get Payment Form Customer");
		System.out.println("Enter your Choice ....!!!");
		return new Scanner(System.in).nextInt();
	}
	public static void serviceMain() {
		int choice;
		while ((choice =serviceMenu())!=0) {
			switch (choice) {
			case 1:
				System.out.println("1. Select Customer Vehicle");

				break;
			case 2:
				System.out.println("2. Process Request");

				break;
			case 3:
				System.out.println("3. Prepare and Display Bill");

				break;
			case 4:
				System.out.println("4. Get Payment Form Customer");

				break;

			default:
				System.out.println("Wrong choice ...:(");
				break;
			}
		}
	}
	
	//service request submenus created from here
	
	public static int processRequest() {
		System.out.println("0. Back");
		System.out.println("1. New Service");
		System.out.println("2. Existing Service ");
		System.out.println("3. Maintenance");
		System.out.println("4. Repairing");
		System.out.println("5. Oil/Additive Change/Add");
		System.out.println("Enter Your Choice...!!! ");
		return new Scanner(System.in).nextInt();
	}
	public static void processMain() {
		int choice;
		while((choice=processRequest())!=0) {
			switch (choice) {
			case 1:
				newServiceMain();
				break;
			case 2:
				existingServiceMain();
				break;
			case 3:
				maintenanceMain();
				break;
			case 4:
				repairingMain();
				break;
			case 5:
				OilMain();
				break;
			default:
				System.out.println("Wrong choice ...:(");
				break;
			}
		}
	}
	public static int newServiceMenu() {
		System.out.println("0. back");
		System.out.println("1. Service center can create a new service for the selected customer vehicle");
		return new Scanner(System.in).nextInt();
	}
	
	//newService
	
	public static void newServiceMain() {
		int choice;
		while((choice=newServiceMenu())!=0) {
			switch (choice) {
			case 1:
				System.out.println("1. Service center can create a new service for the selected customer vehicle");
				break;

			default:
				System.out.println("Wrong choice ...:(");
				break;
			}
		}
	}
	
	//existingService
	
	public static int existingServiceMenu() {
		System.out.println("0. Back");
		System.out.println("1. If service is already created select the existing service");
		return new Scanner(System.in).nextInt();
	}
	public static void existingServiceMain() {
		int choice ;
		while ((choice =existingServiceMenu())!=0) {
			switch (choice) {
			case 1:
				System.out.println("1. If service is already created select the existing service");

				break;

			default:
				System.out.println("Wrong choice ...:(");

				break;
			}
			
		}
	}
	
	// maintenance 
	
	public static int maintenanceMenu() {
		System.out.println("0. Back");
		System.out.println("1. As per the requirements mentioned in above description.");
		return new Scanner(System.in).nextInt();
	}
	public static void maintenanceMain() {
		int choice ;
		while ((choice =maintenanceMenu())!=0) {
			switch (choice) {
			case 1:
				System.out.println(" As per the requirements mentioned in above description.");

				break;

			default:
				System.out.println("Wrong choice ...:(");

				break;
			}
			
		}
	}
	
	//Repairing
	
	public static int repairingMenu() {
		System.out.println("0. Back");
		System.out.println("1. As per the requirements mentioned in above description.");
		return new Scanner(System.in).nextInt();
	}
	public static void repairingMain() {
		int choice ;
		while ((choice =repairingMenu())!=0) {
			switch (choice) {
			case 1:
				System.out.println(" As per the requirements mentioned in above description.");

				break;

			default:
				System.out.println("Wrong choice ...:(");

				break;
			}
			
		}
	}
	
	//oil/addictive//add
	public static int OilMenu() {
		System.out.println("0. Back");
		System.out.println("1. As per the requirements mentioned in above description.");
		return new Scanner(System.in).nextInt();
	}
	public static void OilMain() {
		int choice ;
		while ((choice =repairingMenu())!=0) {
			switch (choice) {
			case 1:
				System.out.println(" As per the requirements mentioned in above description.");

				break;

			default:
				System.out.println("Wrong choice ...:(");

				break;
			}
			
		}
	}
	public static int partMenu() {
		System.out.println("0. Back");
		System.out.println("1. Add Part ");
		System.out.println("2. Display All Parts");
		System.out.println("3. Edit Part Price");
		System.out.println("4. Delete Part");
		System.out.println("Enter Your Choice.....!!!");
		return new Scanner(System.in).nextInt();
	}
	public static void partMain() {
		int choice;
		while((choice=partMenu())!=0) {
			switch (choice) {
			case 1:
				System.out.println("1. Add Part ");

				break;
			case 2:
				System.out.println("2. Display All Parts");

				break;
				
			case 3:
				System.out.println("3. Edit Part Price");

					break;
					
			case 4:
				System.out.println("4. Delete Part");

						break;

			default:
				System.out.println("Wrong choice ...:(");
				break;
			}
		}
	}
	public static int todayBusinessMenu() {
		System.out.println("0. Back");
		System.out.println("list of all bills ");
		return new Scanner(System.in).nextInt();
	}
	public static void todayBusinessMain() {
		int choice;
		while ((choice=todayBusinessMenu())!=0) {
			switch (choice) {
			case 1:
				System.out.println("(paid amount) of today and display it.");
				break;

			default:
				System.out.println("Wrong choice ...:(");
				break;
			}
			
		}
	}
	public static int givenBusinessMenu() {
		System.out.println("0. Back");
		System.out.println("list of all bills ");
		return new Scanner(System.in).nextInt();
	}
	public static void givenBusinessMain() {
		int choice;
		while ((choice= givenBusinessMenu())!=0) {
			switch (choice) {
			case 1:
				System.out.println(" (paid amount) of user given date and display it.");
				break;

			default:
				System.out.println("Wrong choice ...:(");
				break;
			}
			
		}
	}
	
}
