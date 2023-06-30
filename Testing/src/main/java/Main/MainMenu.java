package Main;

import java.util.Scanner;

public class MainMenu {
	enum EmainMenu{
		EXIT,EMPLOYEE,DEPARTMENT,DEFAULT
	}
public static EmainMenu menuOption() {
	System.out.println("0 . EXIT ");
	System.out.println("1 . EMPLOYEE");
	System.out.println("2 . DEPARTMENT");
	int choice =new Scanner(System.in).nextInt();
	if(choice <0 || choice >3) 
		{
		return EmainMenu.values()[3];
		}
	else
		{
		return EmainMenu.values()[choice];
		}
	}
	public static void main(String[] args) {
		EmainMenu choice;
		while((choice=menuOption())!=EmainMenu.EXIT) {
			switch (choice) {
			case EMPLOYEE:
				SubMenu.EmployeeMenu();
				break;
			case DEPARTMENT:
				SubMenu.departmentMain();
				break;
			default:
				System.out.println("Wrong choice....:(");
				break;
		}
	}
	}
}
