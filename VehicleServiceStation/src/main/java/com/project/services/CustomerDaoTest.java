package com.project.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.project.dao.CustomerDao;
import com.project.entity.Customer;

public class CustomerDaoTest {

	@Test
	public void testaddCustomer() {
		CustomerDao customerDao;
		try {
			customerDao =new CustomerDao();
			System.out.println(customerDao.addCustomer(new Customer( "akash","9898989898", "Akash@gmail.com", "Kolhapur")));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	@Test
	public void testGetAllCustomer() {
	CustomerDao customerDao;
	try {
		customerDao=new CustomerDao();
		List<Customer> customerList=new ArrayList<>();
		customerDao.getAllCustomer(customerList); 
		customerList.forEach(System.out::println);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}
	@Test
	public void testGetspecificCustomer() {
		CustomerDao customerDao;
		try {
			customerDao =new CustomerDao();
			customerDao.getSpecificCustomer("9518331190");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testUpdateCustomer() {
		CustomerDao customerDao;
		try {
			customerDao =new CustomerDao();
			customerDao.updateCustomer(17, "7020680295", "PIMPALGAON");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}
	

