package com.project.services;

import java.sql.SQLException;
import java.util.List;

import com.project.dao.ServiceDao;
import com.project.entity.ServiceRequest;

public class ServiceSerivice {

	public static ServiceRequest newService(String vehicleNumber) throws SQLException {
		ServiceDao serviceDao=new ServiceDao();
		return serviceDao.addNewService(vehicleNumber);
	}

	public static List<ServiceRequest> fetchTodayService() throws SQLException {
		ServiceDao serviceDao=new ServiceDao();
		List<ServiceRequest> serviList=serviceDao.fetchTodayService();
		return serviList=serviceDao.fetchTodayService();
		
	}
}
