package com.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.mysql.cj.protocol.Resultset;
import com.project.entity.Part;

public class PartDao implements AutoCloseable{

	private Connection connection;
	public void addParts(Part part) throws SQLException {
		String sql="INSERT INTO PASRTS(id,name,description,price)VALUES(?,?,?,?)";
		try (PreparedStatement addParts=this.connection.prepareStatement(sql)){
		addParts.setInt(1, part.getId());
		addParts.setString(2, part.getName());
		addParts.setString(3, part.getDescription());
		addParts.setDouble(4, part.getPrice());
		addParts.executeUpdate();
		}
	}
	public void getAllParts(List<Part> partList) throws SQLException {
	 	String sql="SELECT * FROM parts ";
		try(PreparedStatement getAllParts = this.connection.prepareStatement(sql)) {
	 		ResultSet rs=getAllParts.executeQuery();
			while(rs.next()) {
				Part part=new Part(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4));
				partList.add(part);
			}
		}		
	}

	@Override
	public void close() throws Exception {
		this.connection.close();

	}




	
}
