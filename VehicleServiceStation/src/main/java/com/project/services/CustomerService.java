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
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer id here =");
		int id=	sc.nextInt();
		System.out.println("Enter Customer name here =");
		String name=sc.next();
		System.out.println("Enter Customer mobile here =");
		String mobile=sc.next();
		System.out.println("Enter Customer email here =");
		String email=sc.next();
		System.out.println("Enter Customer address here =");
		String address=sc.next();
		System.out.println("data inserted successfully....!!!");
		
		
		Customer customer=new Customer(id,name,mobile,email,address);
		try (CustomerDao customerDao = new CustomerDao()){
			customerDao.addCustomer(customer);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	//display all Customers
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
}
