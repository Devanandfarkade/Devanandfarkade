package com.project.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;
import com.project.entity.Service;
import com.project.entity.ServiceRequest;
import com.project.util.DBUtil;

public class ServiceDao implements AutoCloseable{
	private Connection connection;
	public ServiceDao() throws SQLException {
		this.connection=DBUtil.getConnection();
	}

	public ServiceRequest addNewService(String vehicleNumber) throws SQLException {
		String sql="INSERT INTO service_requests (vehicle_number)VALUES (?)";
		PreparedStatement pst=this.connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
		pst.setString(1, vehicleNumber);
		pst.executeUpdate();
		ResultSet rs=pst.getGeneratedKeys();
		if (rs.next()) {
			ServiceRequest service=new ServiceRequest(rs.getInt(1), vehicleNumber, null, null);
			return service;
		}
		return null;
		
	}
	public List<ServiceRequest> fetchTodayService() throws SQLException {
		String sql="select id,vehicle_number,date(request_date),bill_amount from service_requests where date(request_date)=date(sysdate()); ";
		PreparedStatement pst=this.connection.prepareStatement(sql);
		
		ResultSet rs=pst.executeQuery();
		List<ServiceRequest>serviceList=new ArrayList<>();
		while(rs.next()) {
			
			ServiceRequest serviceRequest=new ServiceRequest();
			serviceList .add(serviceRequest);
		}
		
		return serviceList;
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
}
