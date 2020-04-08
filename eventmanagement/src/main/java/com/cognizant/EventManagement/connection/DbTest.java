package com.cognizant.EventManagement.connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbTest {
	public static void main(String[] args) 
	{
		Connection con=null;
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/event_mgmt_db?useSSL=false","root","root");
			if(con!=null) 
			{
				System.out.println("db connection success");
			}
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		} 	
	}
}