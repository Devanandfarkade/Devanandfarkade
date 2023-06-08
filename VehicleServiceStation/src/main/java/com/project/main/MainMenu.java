package com.project.main;

import java.util.Scanner;

public class MainMenu {
	public static int mainMenuOption() {
		System.out.println("0. Exit");
		System.out.println("1. Customer");
		System.out.println("2. Vehicle");
		System.out.println("3. Service Request");
		System.out.println("4. Parts");
		System.out.println("5. Today's Business");
		System.out.println("6. Given Date's Business");
		System.out.println("Enter your choice ...!!!");
		return new Scanner(System.in).nextInt();
	}
	public static void main(String[] args) {
		int choice ;
		while ((choice =mainMenuOption())!=0) {
			switch (choice) {
			case 1:
				SubMenu.customerMain();
				break;
			case 2:
				SubMenu.vehicleMain();
				break;
			case 3:
				SubMenu.serviceMain();
				break;
			case 4:
				SubMenu.partMain();
				break;
			case 5:
				SubMenu.todayBusinessMain();
				break;
			case 6:
				SubMenu.givenBusinessMain();
				break;
			
			default:
				System.out.println("Wrong choice....:(");
				break;
			}
		}
	}
}
