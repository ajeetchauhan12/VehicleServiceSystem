package com.coforge.db;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect  {
	static Connection con=null;
	static String  url="jdbc:mysql://localhost:3306/vehicle_database";
	static String user="root";
	 static String password="sdae56b1";
	 
	public static Connection dbConnectMethod() throws SQLException{
		try {
		System.out.println("connecting to database");
			Class.forName("com.mysql.cj.jdbc.Driver");
		
	
	 con=DriverManager.getConnection(url,user,password);
	 System.out.println("database connected");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}

}
