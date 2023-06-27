package com.project.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.project.dao.ServiceDao;
import com.project.entity.Maintainance;
import com.project.entity.Oil;
import com.project.entity.Parts;
import com.project.entity.Service;
import com.project.entity.ServiceParts;
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
	public static void doMaintainance(ServiceRequest serviceRequest) throws Exception {
		List<Service>serviceList=serviceRequest.getServiceList();
		Maintainance service=null;
		boolean serviceFound=false;
		
		if(serviceList.isEmpty()) {
			service= new Maintainance();
			service.acceptService();
			try (ServiceDao addServiceRequest=new ServiceDao()){
				System.out.println(serviceRequest.getId());
				service.setService_request_id (serviceRequest.getId());
				serviceList.add(service);
				addServiceRequest.addService(service);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			serviceList.add(service);
		}										
		else {
			for (int i=0;i<serviceList.size();i++) {
				Service s =serviceList.get(i);
				if(s instanceof Maintainance) {
					service=(Maintainance)s;
					service.acceptService();
					try(ServiceDao serv=new ServiceDao()){
						serv.updateSerices(service);		
					}
					catch (SQLException e) {
						e.printStackTrace();
					}
				}else
				{
					System.out.println("Add Service ..");
				}
				{
					if(s instanceof Maintainance) {
						service=(Maintainance)s;
					}
				}
				
			}
		}
	}
	
	public static void doOilChange(ServiceRequest serviceRequest) {
		List<Service>serviceList=serviceRequest.getServiceList();
		Oil service=null;
		boolean serviceFound=false;
		
		if (serviceRequest.getServiceList().isEmpty()) {
			service=new Oil();
			serviceList.add(service);
			service.acceptService();

				try (ServiceDao adddServiceRequest=new ServiceDao()){
					service.setService_request_id(serviceRequest.getId());
					serviceList.add(service);
					adddServiceRequest.addService(service);
				} catch (Exception e) {
					e.printStackTrace();
				}
				serviceList.add(service);
		}
		else {
			for(int i=0; i<serviceList.size();i++) {
				Service s=serviceList.get(i);
				if( s instanceof Oil) {
					service=(Oil)s;
					service.acceptService();
					try (ServiceDao serviceDao=new ServiceDao()){
						serviceDao.updateSerices(service);
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
			}
		}
	}
	
	
	public static void doRepairing(ServiceRequest serviceRequest) {
		List<Service>serviceList=serviceRequest.getServiceList();
		Maintainance service=null;
		boolean serviceFound=false;
		
//		if(serviceList.isEmpty()) {
//			service= new Maintainance();
//			service.acceptService();
//			
//		}
//		else {
//			for(Service s : serviceList) {
//				if(s instanceof Maintainance) {
//					service=(Maintainance) s;
//					serviceFound= true;
//					break;
//				}
//			}
//			if(serviceFound) {
//				System.out.println("List of all Parts ");
//				PartService.getAllParts();
//				Parts parts=PartService.getSpecific();
//				int sid=service.getId();
//				int pid =parts.getId();
//				System.out.println("Enter Quantities of parts ");
//				int qid=new Scanner(System.in).nextInt();
//			}
//		}
	if(serviceList.isEmpty()) {
		service=new Maintainance();
		service.acceptService();
		try (ServiceDao serviceParts=new ServiceDao()){
			service.setService_request_id(serviceRequest.getId());
			serviceList.add(service);
			serviceParts.addService(service);
		}  catch (Exception e) {
			e.printStackTrace();
		}
		serviceList.add(service);
	}
	else { 
		for(int i=0;i<serviceList.size();i++) {
			Service s=serviceList.get(i);
			if(s instanceof Maintainance) {
				service =(Maintainance)s;
				service.setPartList(new ArrayList<>());
				partCost(serviceRequest);
			}
		}
		
	}
	}


	private static void partCost(ServiceRequest serviceRequest) {
		List<Service>serviceList=serviceRequest.getServiceList();
		Service s= serviceList.get(0);
		Maintainance service=null;
		if(s instanceof Maintainance) {
			service =(Maintainance)s;
			service.setPartList(new ArrayList<>());
			int choice =0;
			while(choice ==0) {
				List<Parts>partList=PartService.getAllParts();
				System.out.println(partList);
				System.out.println("Enter Part ID = ");
				int part_id=new Scanner(System.in).nextInt();
				System.out.println("Enter Quantity = ");
				int quantity=new Scanner(System.in).nextInt();
				Parts part=partList.get(indexOf(new Parts(part_id)));
				System.out.println(" To add more Parts Enter 0 OtherWise 1 =");
				choice=new Scanner(System.in).nextInt();
				service.calculateTotalCost();
				ServiceParts sp=new ServiceParts(s.getId(),part_id,quantity);
				service.getPartList().add(sp);
				
				
			}
		}
		
	}


	private static int indexOf(Parts parts) {
		// TODO Auto-generated method stub
		return 0;
	}
}
