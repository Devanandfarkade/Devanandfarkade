package com.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.project.entity.CustomerVehicle;
import com.project.entity.SpecificCustomerVehicle;
import com.project.entity.Vehicle;
import com.project.util.DBUtil;

public class VehicleDao implements AutoCloseable{
 
	private Connection connection;
	
	public VehicleDao() throws SQLException{
		 this.connection=DBUtil.getConnection();
	 } 
	public int addVehicle (Vehicle vehicle) throws SQLException {
		 String sql="INSERT INTO Vehicle (id,company,model) VALUES(?,?,?)";
		 try (PreparedStatement addVehicle=this.connection.prepareStatement(sql)){
			 addVehicle.setInt(1, vehicle.getId());
			 addVehicle.setString(2, vehicle.getCompany() );
			 addVehicle.setString(3, vehicle.getModel());
			int cnt= addVehicle.executeUpdate();
			return cnt;
		} 
	 }
	
	public int customerVehicle(CustomerVehicle customerVehicle) throws SQLException {
		String sql="INSERT INTO customer_vehicles (vehicle_number,customer_id,vehicle_id)VALUES(?,?,?)";
		PreparedStatement pst=this.connection.prepareStatement(sql);
		pst.setString(1, customerVehicle.getVehicle_number());
		pst.setInt(2, customerVehicle.getCustomer_id());
		pst.setInt(3, customerVehicle.getVehicle_id());
		int cnt=pst.executeUpdate();
		return cnt;
		
	}
	public List<SpecificCustomerVehicle> specificCustomerVehicles(int cust_id) throws SQLException {
		String sql="select * from customer_vehicles cv inner join vehicle v on cv.vehicle_id=v.id where customer_id =?";
		PreparedStatement pst=this.connection.prepareStatement(sql);
		pst.setInt(1, cust_id);
		ResultSet rs=pst.executeQuery();
		List<SpecificCustomerVehicle> specificVehicles=new ArrayList<>();
		
		while(rs.next()) {
			SpecificCustomerVehicle scv =new SpecificCustomerVehicle(rs.getString("vehicle_number"),
					rs.getInt("customer_id"),rs.getInt("vehicle_id"),
					rs.getString("company"),rs.getString("model")); 
//			SpecificCustomerVehicle rcv =new SpecificCustomerVehicle(rs.getString("model"),rs.getString("company"),rs.getString("vehicle_number"),rs.getInt("customer_id"),rs.getInt("vehicle_id")); 
			
			
			specificVehicles.add(scv);
		}
		return specificVehicles;
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
	 public Vehicle getSpecificVehicle(int id) throws SQLException {
			String sql="SELECT * FROM  Vehicle WHERE id =? ";
			try(PreparedStatement getSpecificVehicle =this.connection.prepareStatement(sql)) {
				getSpecificVehicle.setInt(1 ,id);
				ResultSet  rs =getSpecificVehicle.executeQuery();
				if (rs.next()) 
					return new Vehicle(rs.getInt("id"),rs.getString("company"),rs.getString("model"));
					
			}return null;
		}
	 public int updateVehicle(String old_vehicle_number,String new_vehhicle_number) throws SQLException {
			String sql="UPDATE customer_vehicles SET vehicle_number  =?  WHERE vehicle_number=? ";
			try (PreparedStatement updateVehicle =this.connection.prepareStatement(sql)){
				updateVehicle.setString(1, new_vehhicle_number);
				updateVehicle.setString(2, old_vehicle_number);
				return updateVehicle.executeUpdate();
			}
		}
	
	 public int deleteVehicle(String vehicle_number) throws SQLException {
		 String sql="delete from customer_vehicles where vehicle_number=?;";
		 try (PreparedStatement deleteVehicle=this.connection.prepareStatement(sql)){
			 deleteVehicle.setString(1, vehicle_number);
			 return deleteVehicle.executeUpdate();
		} 
	 }
	
	@Override
	public void close() throws Exception {
		this.connection.close();
		
	}
	
	
	
	 
	
}
