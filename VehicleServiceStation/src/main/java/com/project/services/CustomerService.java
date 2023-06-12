package com.project.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.project.dao.CustomerDao;
import com.project.entity.Customer;

public class CustomerService {

	public static void addCustomer() {
		Scanner choice=new Scanner(System.in);
		System.out.println("Enter Customer id here =");
		int id=	choice.nextInt();
		System.out.println("Enter Customer name here =");
		String name=choice.next();
		System.out.println("Enter Customer mobile here =");
		String mobile=choice.next();
		System.out.println("Enter Customer email here =");
		String email=choice.next();
		System.out.println("Enter Customer address here =");
		String address=choice.next();
		System.out.println("data inserted successfully....!!!");
		
		Customer customer=new Customer(id,name,mobile,email,address);
		try (CustomerDao customerDao = new CustomerDao()){
			customerDao.addCustomer(customer);
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}			//display all Customers
	public static void getAllCustomer() {
		List<Customer> customerList = new ArrayList<>();
		try (CustomerDao customerDao = new CustomerDao()){
			customerDao.getAllCustomer(customerList);
			for (Customer customer : customerList) {
				System.out.println(customer);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
	}
	public static void getSpecificCustomer() {
		System.out.println("Enter Customer mobile Number = ");
		String  mobile =new Scanner(System.in).next();
		try (CustomerDao customerDao = new CustomerDao()){
			Customer customer=customerDao.getSpecificCustomer(mobile);
			if (customer != null) 
				System.out.println(customer);
			else 
				System.out.println("Customer is not found ...!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
