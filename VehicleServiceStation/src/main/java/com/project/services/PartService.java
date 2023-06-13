package com.project.services;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.project.dao.PartsDao;
import com.project.entity.Parts;

public class PartService {

	public static void addParts() {
		System.out.println("Enter id to add Parts: ");
		int id=new Scanner(System.in).nextInt();
		System.out.println("Enter name to add : ");
		String name=new Scanner(System.in).next();
		System.out.println("Enter description to add : ");
		String description=new Scanner(System.in).next();
		System.out.println("Enter price to add : ");
		Double price=new Scanner(System.in).nextDouble();
		Parts parts=new Parts(id,name,description,price);
		
		try(PartsDao partsDao = new PartsDao()){
			if(partsDao.addParts(parts)>0)
				System.out.println("Parts Details Inserted Successfully");
			else
			 System.out.println("Parts details not Inserted");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void getAllParts() {
		List<Parts>partsList=new ArrayList<>();
		try (PartsDao partsDao = new PartsDao()) {
			partsDao.getAllParts(partsList);
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	public static void updateParts() {
		System.out.println("Enter Parts id to edit price: ");
		int id =new Scanner (System.in).nextInt();
		System.out.println("Enter parts price : ");
		Double price =new Scanner (System.in).nextDouble();
		try(PartsDao partsDao=new PartsDao()){
			if(partsDao.updateParts(id,price)>0)
				System.out.println("Parts Data Updated Successfully");
			else
				System.out.println("Parts Not Found");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void deleteParts() {
		System.out.println("Enter the id for delete details = ");
		int id=new Scanner(System.in).nextInt();
		try {
			PartsDao partsDao=new PartsDao();
			if(partsDao.deleteParts(id)>0) {
				System.out.println("parts deleted successfully.....!!!!");
			}else {
				System.out.println("parts data not found ..:(");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
