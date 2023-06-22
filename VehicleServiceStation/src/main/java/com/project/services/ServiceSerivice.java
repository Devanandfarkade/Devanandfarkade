package com.project.services;

import java.sql.SQLException;
import java.util.List;

import com.project.dao.ServiceDao;
import com.project.entity.Maintainance;
import com.project.entity.Service;
import com.project.entity.ServiceRequest;

public class ServiceSerivice {

	public static ServiceRequest newService(String vehicleNumber) throws SQLException {
		ServiceDao serviceDao;
		serviceDao=new ServiceDao();
		return serviceDao.addNewService(vehicleNumber);
	}

	public static List<ServiceRequest> fetchTodayServiceList() throws SQLException {
		ServiceDao serviceDao=new ServiceDao();
		List<ServiceRequest> serviceList=serviceDao.fetchTodayServiceList();
		for (ServiceRequest sList : serviceList) {
			System.out.println(sList);
		}
		return serviceList;
	}
	public static List<Service> serviceProvided( ServiceRequest serviceRequest) throws SQLException{
		ServiceDao serviceDao=new ServiceDao();
		List<Service> serviceList=serviceDao.serviceProvided(serviceRequest);
		for(Service serProvided:serviceList) {
			System.out.println(serProvided);
		}
		return serviceList;
	}
	public static void doMaintainance(ServiceRequest serviceRequest) {
		List<Service>serviceList=serviceRequest.getServiceList();
		Maintainance Service=null;
	}
	
}
