package com.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.project.entity.CustomerVehicle;
import com.project.util.DBUtil;

public class ServiceReqDao implements AutoCloseable{

private Connection connection;
	
	public ServiceReqDao() throws SQLException{
		 this.connection=DBUtil.getConnection();
	 } 
	public void vehicleRequest(String vehicle_number,int cutsomer_id,int vehicle_id) throws SQLException {
		String sql="INSERT INTO customer_vehicles (vehicle_number,cutsomer_id,vehicle_id) values(?,?,?)";
		PreparedStatement pst=this.connection.prepareStatement(sql);
		pst.setString(1, vehicle_number);
		pst.setInt(2, cutsomer_id);
		pst.setInt(3, cutsomer_id);
	}
	
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
}
