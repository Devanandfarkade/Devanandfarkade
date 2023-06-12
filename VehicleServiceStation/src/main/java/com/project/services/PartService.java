package com.project.services;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.project.dao.PartDao;
import com.project.entity.Part;

public class PartService {

	public static void addParts() {
		Scanner choice=new Scanner(System.in);
		System.out.println("Enter Part ID = ");
		int id=choice.nextInt();
		
		System.out.println("Enter Name here = ");
		String name=choice.next();
		
		System.out.println("Enter description Here = ");
		String description=choice.next();
		
		System.out.println("Enert the price = ");
		double price=choice.nextDouble();
		
		System.out.println("DAta Inserted in Part Successfully...!!!");
		
		Part part=new Part(id,name,description, price);
		try (PartDao partDao = new PartDao()){
			partDao.addParts(part);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void getAllparts() {
		List<Part>partList=new ArrayList<>();
		try (PartDao partDao=new PartDao()){
			partDao.getAllParts(partList);
			for (Part part : partList) {
				System.out.println(part);
			}
		} catch (Exception e) {
			e.printStackTrace();		}
	}
}
