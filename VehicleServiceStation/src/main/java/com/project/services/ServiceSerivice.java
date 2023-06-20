package com.project.services;

import java.sql.SQLException;

import com.project.dao.ServiceDao;
import com.project.entity.Service;

public class ServiceSerivice {

	public static Service newService(String vehicleNumber) throws SQLException {
		ServiceDao serviceDao=new ServiceDao();
		return serviceDao.addNewService(vehicleNumber);
	}

}
