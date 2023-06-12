package com.project.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

import com.project.dao.CustomerDao;
import com.project.entity.Customer;


class getcustomerTest {
	//test case 1 successful get all customer 
	@Test
	public void getAllCustomers() {
		CustomerService.getAllCustomer();
	}
	
	//test case 2 get specific cutomer 
	@Test
	public void getspecific() {
	
		CustomerService.getSpecificCustomer();
	}
	//test case 3 update Customer
	@Test
	public void updateCustomer() {
		CustomerService.updateCustomer();
	}
	
	//test case 4 delete Customer
	@Test
	public void deleteCustomer() {
		CustomerService.deleteCustomer();
	}
	
	//test case 5 successful addcustomer
	@Test
	public void addCustomer() {
	
	CustomerService.addCustomer();
	}
	
	

}
