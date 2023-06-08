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
		System.out.print("Enter your choice =  ");
		int choice=new Scanner(System.in).nextInt();
		if (choice <0 || choice > 6)
			return EcustomerMenu.values()[6];
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
		System.out.print("Enter your Choice = ");
		
		int choice= new Scanner(System.in).nextInt();
		if(choice<0 ||choice >6)
			return EvehicleMenu.values()[6];
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
	
	enum EserviceMenu{
		BACK,SELECT_CUSTOMER_VEHICLE,PROCESS_REQ,PREPARED_DISPLAY_BILL,PAYMENT,DEFAULT
	}
	
	public static EserviceMenu serviceMenu() {
		System.out.println("0 .back");
		System.out.println("1. Select Customer Vehicle");
		System.out.println("2. Process Request");
		System.out.println("3. Prepare and Display Bill");
		System.out.println("4. Get Payment Form Customer");
		System.out.print("Enter your Choice =  ");
		int choice= new Scanner(System.in).nextInt();
		if(choice<0 ||choice >5)
			return EserviceMenu.values()[5];
		else
			return EserviceMenu.values()[choice];
	}
	public static void serviceMain() {
		EserviceMenu choice;
		while ((choice =serviceMenu())!=EserviceMenu.BACK) {
			switch (choice) {
			case SELECT_CUSTOMER_VEHICLE:
				System.out.println("1. Select Customer Vehicle");

				break;
			case PROCESS_REQ:
				System.out.println("2. Process Request");

				break;
			case PREPARED_DISPLAY_BILL:
				System.out.println("3. Prepare and Display Bill");

				break;
			case PAYMENT:
				System.out.println("4. Get Payment Form Customer");

				break;

			default:
				System.out.println("Wrong choice ...:(");
				break;
			}
		}
	}
	
	//service request submenus created from here
	
	enum EprocessRequest{
		BACK,NEW_SERVICE,EXISTING_SERVICE,MAINTENANCE,REPAIRING,OIL_DD,DEFAULT
	}
	public static EprocessRequest processRequest() {
		System.out.println("0. Back");
		System.out.println("1. New Service");
		System.out.println("2. Existing Service ");
		System.out.println("3. Maintenance");
		System.out.println("4. Repairing");
		System.out.println("5. Oil/Additive Change/Add");
		System.out.print("Enter Your Choice = ");
		int choice= new Scanner(System.in).nextInt();
		if(choice<0 ||choice>6)
			return EprocessRequest.values()[6];
		else
			return EprocessRequest.values()[choice];
					
	}
	public static void processMain() {
		EprocessRequest choice;
		while((choice=processRequest())!=EprocessRequest.BACK) {
			switch (choice) {
			case NEW_SERVICE:
				newServiceMain();
				break;
			case EXISTING_SERVICE:
				existingServiceMain();
				break;
			case MAINTENANCE:
				maintenanceMain();
				break;
			case REPAIRING:
				repairingMain();
				break;
			case OIL_DD:
				OilMain();
				break;
			default:
				System.out.println("Wrong choice ...:(");
				break;
			}
		}
	}
	
	enum EnewServiceMenu{
		BACK,CAN_CREATE_NEW,DEFAULT
	}
	
	public static EnewServiceMenu newServiceMenu() {
		System.out.println("0. Back");
		System.out.println("1. Service center can create a new service for the selected customer vehicle");
		int choice = new Scanner(System.in).nextInt();
		if(choice<0 || choice >2)
			return EnewServiceMenu.values()[2];
		else 
			return EnewServiceMenu.values()[choice];
					
	}
	
	//newService
	
	public static void newServiceMain() {
		EnewServiceMenu choice;
		while((choice=newServiceMenu())!=EnewServiceMenu.BACK) {
			switch (choice) {
			case CAN_CREATE_NEW :
				System.out.println("1. Service center can create a new service for the selected customer vehicle");
				break;

			default:
				System.out.println("Wrong choice ...:(");
				break;
			}
		}
	}
	
	//existingService
	
	enum EexistingServiceMenu{
		BACK,SELECT_EXISTING_SERVICE,DEFAULT
	}
	public static EexistingServiceMenu existingServiceMenu() {
		System.out.println("0. Back");
		System.out.println("1. If service is already created select the existing service");
		int choice= new Scanner(System.in).nextInt();
		if(choice <0 ||  choice >2 )
			return EexistingServiceMenu.values()[2];
		else 
			return EexistingServiceMenu.values()[choice];
		
		
	}
	public static void existingServiceMain() {
		EexistingServiceMenu choice ;
		while ((choice =existingServiceMenu())!=EexistingServiceMenu.BACK) {
			switch (choice) {
			case SELECT_EXISTING_SERVICE:
				System.out.println("1. If service is already created select the existing service");

				break;

			default:
				System.out.println("Wrong choice ...:(");

				break;
			}
			
		}
	}
	
	// maintenance 
	enum  EmaintenanceMenu{
		BACK,MENTIONED_IN_DESCRP,DEFAULT
	}
	
	public static EmaintenanceMenu maintenanceMenu() {
		System.out.println("0. Back");
		System.out.println("1. As per the requirements mentioned in above description.");
		int choice= new Scanner(System.in).nextInt();
		if(choice<0 || choice >2)
			return EmaintenanceMenu.values()[2];
		else
			return EmaintenanceMenu.values()[choice];
	}
	public static void maintenanceMain() {
		EmaintenanceMenu choice ;
		while ((choice =maintenanceMenu())!=EmaintenanceMenu.BACK) {
			switch (choice) {
			case MENTIONED_IN_DESCRP:
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
	enum EoilMenu{
		BACK,MENTIONED_IN_DESCRP,DEFAULT
	}
	public static EoilMenu OilMenu() {
		System.out.println("0. Back");
		System.out.println("1. As per the requirements mentioned in above description.");
		it choice =new Scanner(System.in).nextInt();
		if(choice<0 || choice >2)
			return EoilMenu.values()[2];
		else
			return EoilMenu.values()[choice];
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
	
	enum EpartMenu{
		BACK,ADD_PART,DISPLAY_ALL_PARTS,EDIT_PARTS_PRICE,DELETE_PART,DEFAULT
	}
	public static EpartMenu partMenu() {
		System.out.println("0. Back");
		System.out.println("1. Add Part ");
		System.out.println("2. Display All Parts");
		System.out.println("3. Edit Part Price");
		System.out.println("4. Delete Part");
		System.out.println("Enter Your Choice.....!!!");
		int choice= new Scanner(System.in).nextInt();
		if(choice<0 || choice>5)
			return EpartMenu.values()[5];
		else
			return EpartMenu.values()[choice];
	}
	public static void partMain() {
		EpartMenu choice;
		while((choice=partMenu())!=EpartMenu.BACK) {
			switch (choice) {
			case ADD_PART:
				System.out.println("1. Add Part ");

				break;
			case DISPLAY_ALL_PARTS:
				System.out.println("2. Display All Parts");

				break;
				
			case EDIT_PARTS_PRICE:
				System.out.println("3. Edit Part Price");

					break;
					
			case DELETE_PART:
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
