package com.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.project.entity.Customer;
import com.project.util.DBUtil;

public class CustomerDao implements AutoCloseable{
	
	private Connection connection;
	 public CustomerDao() throws SQLException {
		 this.connection=DBUtil.getConnection();
	 } 	 
	 public void getAllCustomer(List<Customer>customerList) throws SQLException {
		 	String sql="SELECT * FROM customer";
		 	try(PreparedStatement getAllCustomer=this.connection.prepareStatement(sql)){
		 		ResultSet rs=getAllCustomer.executeQuery();
		 		while (rs.next()) {
					Customer customer=new Customer(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
					customerList.add(customer);
					}
		 	}
	 }
	 public void addCustomer (Customer customer) throws SQLException {
		 String sql="INSERT INTO customer (id,name,mobile,email,address) VALUES(?,?,?,?,?)";
		 try (PreparedStatement addCustomer=this.connection.prepareStatement(sql)){
			 addCustomer.setInt(1, customer.getId());
			 addCustomer.setString(2, customer.getName());
			 addCustomer.setString(3, customer.getMobile());
			 addCustomer.setString(4, customer.getEmail());
			 addCustomer.setString(5, customer.getAddress());
			 addCustomer.executeUpdate();
			
		} 
	 }

	public Customer getSpecificCustomer(String mobile) throws SQLException {
		String sql="SELECT * FROM  customer WHERE mobile =? ";
		try(PreparedStatement getSpecificCustomer =this.connection.prepareStatement(sql)) {
			getSpecificCustomer.setString(1 ,mobile);
			ResultSet  rs =getSpecificCustomer.executeQuery();
			if (rs.next()) 
				return new Customer(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
				return null;
			}
	}	
	
	@Override
	public void close() throws SQLException {
			this.connection.close();
	}
}
