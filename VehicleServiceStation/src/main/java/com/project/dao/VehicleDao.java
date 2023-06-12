package com.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.project.entity.Customer;
import com.project.entity.Vehicle;
import com.project.util.DBUtil;

public class VehicleDao implements AutoCloseable{
 
	private Connection connection;
	public VehicleDao() throws SQLException{
		 this.connection=DBUtil.getConnection();
	 } 
	public void addVehicle (Vehicle vehicle) throws SQLException {
		 String sql="INSERT INTO Vehicle (id,company,model) VALUES(?,?,?)";
		 try (PreparedStatement addVehicle=this.connection.prepareStatement(sql)){
			 addVehicle.setInt(1, vehicle.getId());
			 addVehicle.setString(2, vehicle.getCompany() );
			 addVehicle.setString(3, vehicle.getModel());
			 addVehicle.executeUpdate();
			
		} 
	 }
	public void getAllVehicle(List<Vehicle> vehicleList) throws SQLException {
		 	String sql="SELECT * FROM vehicle";
		 	try(PreparedStatement getAllVehicle=this.connection.prepareStatement(sql)){
		 		ResultSet rs=getAllVehicle.executeQuery();
		 		while (rs.next()) {
					Vehicle vehicle=new Vehicle(rs.getInt(1),rs.getString(2),rs.getString(3));
					vehicleList.add(vehicle);
					}
		 	}
	 }
	 public Vehicle getSpecificVehicle(String id) throws SQLException {
			String sql="SELECT * FROM  Vehicle WHERE id =? ";
			try(PreparedStatement getSpecificVehicle =this.connection.prepareStatement(sql)) {
				getSpecificVehicle.setString(1 ,id);
				ResultSet  rs =getSpecificVehicle.executeQuery();
				if (rs.next()) 
					return new Vehicle(rs.getInt(1),rs.getString(2),rs.getString(3));
					return null;
			}}
	
	@Override
	public void close() throws Exception {
		this.connection.close();
		
	}
	
	 
	
}
