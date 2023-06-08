package com.project.main;

import java.util.Scanner;

public class MainMenu {
	enum EmainMenu{
		EXIT,CUSTOMER,VEHICLE,SERVICE,PART,TODAY_BUSINESS,GIVEN_BUSINESS,DEFAULT
	}
	public static EmainMenu mainMenuOption() {
		
		System.out.println("0. Exit");
		System.out.println("1. Customer");
		System.out.println("2. Vehicle");
		System.out.println("3. Service Request");
		System.out.println("4. Parts");
		System.out.println("5. Today's Business");
		System.out.println("6. Given Date's Business");
		System.out.print("Enter your choice = ");
		int choice=new Scanner(System.in).nextInt();
		if (choice <0 || choice >7) 
			return EmainMenu.values()[7];	
		else
		return EmainMenu.values()[choice];
		
	}
	public static void main(String[] args) {
		EmainMenu choice ;
		while ((choice =mainMenuOption())!=EmainMenu.EXIT) {
			switch (choice) {
			case CUSTOMER:
				SubMenu.customerMain();
				break;
			case VEHICLE:
				SubMenu.vehicleMain();
				break;
			case SERVICE:
				SubMenu.serviceMain();
				break;
			case PART:
				SubMenu.partMain();
				break;
			case TODAY_BUSINESS:
				SubMenu.todayBusinessMain();
				break;
			case GIVEN_BUSINESS:
				SubMenu.givenBusinessMain();
				break;
			
			default:
				System.out.println("Wrong choice....:(");
				break;
			}
		}
	}
}
