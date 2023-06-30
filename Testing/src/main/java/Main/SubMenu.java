package Main;

import java.util.Scanner;

public class SubMenu {
	enum Eemployee{
		BACK ,ADD,UPDATE,ALL_EMP,SAL,DEFAULT
	}

	enum Edepartment{
		BACK ,ADD,UPDATE,ALL_EMP,SAL,DEFAULT
	}
	public static Edepartment departmentMain() {
		System.out.println("0. Back");
		System.out.println("1. Add department ");
		System.out.println("2. Display Alldepartment ");
		System.out.println("3. salary  ");
		System.out.println("Enter your choice =  ");
		int choice = new Scanner(System.in).nextInt();
		if (choice < 0 || choice > 4) 
			return Edepartment.values()[4];
		else
		return Edepartment.values()[choice];
	}

	
	public static Eemployee EmployeeMenu() {
		System.out.println("0. Back");
		System.out.println("1. Add Employee ");
		System.out.println("2. Display All Employee ");
		System.out.println("3. salary  ");
		System.out.println("Enter your choice =  ");
		int choice = new Scanner(System.in).nextInt();
		if (choice < 0 || choice > 4) 
			return Eemployee.values()[4];
		else
		return Eemployee.values()[choice];
	}

	

}
