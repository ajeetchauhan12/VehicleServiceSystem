package com.coforge.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;


import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import com.coforge.Exception.MyException;
import com.coforge.bean.Customer;
import com.coforge.db.DbConnect;

public class CustomerDaoImpl implements CustomerDao{
	private Customer c;
	
	
	/*private Set<Customer> set=null; 
			Iterator<Customer> itr=null;*/
	static Scanner sc = new Scanner(System.in);
	static Connection con=null;
	static PreparedStatement pst=null;
	static Statement st=null;
	 static ResultSet rs=null; 
	
	
	
	 
	 //method to insert customer into database
	public void insert() throws SQLException  {
		
		try {
			
			
			
			con=DbConnect.dbConnectMethod();
	con.setAutoCommit(false);
			System.out.println("enter no. of customer to add");
		int num=sc.nextInt();
		
		while(num>0) {
	
		String str="insert into Customer values(?,?,?,?,?)";
		pst=con.prepareStatement(str);
		
		System.out.println("Customer Id:");
		
		pst.setInt(1,sc.nextInt());
		sc.nextLine();
	
		System.out.println("Customer Name :");
	
		pst.setString(2,sc.nextLine());
		System.out.println("Customer Address :");
		
		pst.setString(3,sc.nextLine());
		System.out.println("Costomer Mobile No. :");
	
		pst.setLong(4,sc.nextLong());
		sc.nextLine();
		System.out.println("Customer DOB :");
	
		pst.setString(5, sc.nextLine());
		
		pst.executeUpdate();
		System.out.println("data inserted");
	num--;
		
	}
		}catch(Exception e ) {
			e.printStackTrace();
			con.rollback();
		}finally {
			try {
			con.commit();	
				pst.close();
				con.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}
	
	
	//Display all Customer from database
	
	
	public void displayAllCustomer() throws SQLException {
		try {
con=DbConnect.dbConnectMethod();
st=con.createStatement();
con.setAutoCommit(false);
String query="select * from Customer";
System.out.println("reterieved data");
rs=st.executeQuery(query);
while(rs.next())
{
//System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getLong(4)+" : "+rs.getString(5));
	System.out.println("Customer Id: "+rs.getInt(1));
	System.out.println("Customer Name: "+rs.getString(2));
	System.out.println("Customer Address: "+rs.getString(3));
	System.out.println("Customer Mobile No.: "+rs.getLong(4));
	System.out.println("Customer DOB: "+rs.getString(5)+"\n\n");
	
}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			con.rollback();
		}
		finally {
			try {
				con.commit();
				rs.close();
				st.close();
				con.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	
	
	}
//display customer by customer id 
	
	public void displayByCustId() throws SQLException {
		try {
			System.out.println("enter the id to display the customer");
			int cust_Id=sc.nextInt();
con=DbConnect.dbConnectMethod();
st=con.createStatement();
con.setAutoCommit(false);
String query="select * from Customer where cust_Id="+cust_Id;

System.out.println("reterieved data");
rs=st.executeQuery(query);
while(rs.next())
{
//System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getLong(4)+" : "+rs.getString(5));
	System.out.println("Customer Id: "+rs.getInt(1));
	System.out.println("Customer Name: "+rs.getString(2));
	System.out.println("Customer Address: "+rs.getString(3));
	System.out.println("Customer Mobile No.: "+rs.getLong(4));
	System.out.println("Customer DOB: "+rs.getString(5)+"\n\n");
	
}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			con.rollback();
		}
		finally {
			try {
				con.commit();
				rs.close();
				st.close();
				con.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			}
		}
		
		
		
		
		//update customer in customer table in database
	
	
	
	public void updateCustomer() throws SQLException {
		try {
			
			con=DbConnect.dbConnectMethod();
			con.setAutoCommit(false);
			String update="update Customer set cust_Name=?,cust_Address=?,cust_Mob=?,cust_DOB=? where cust_Id=?";
			pst=con.prepareStatement(update);
	
			System.out.println("Customer Name: ");
			pst.setString(1,sc.nextLine());
			System.out.println("Customer Address: ");
			pst.setString(2,sc.nextLine());
			System.out.println("Customer Mobile No.: ");
			pst.setLong(3,sc.nextLong());
			sc.nextLine();
			System.out.println("Customer DOB: ");
			pst.setString(4, sc.nextLine());
			System.out.println("Customer Id: ");
			pst.setInt(5,sc.nextInt());
			pst.executeUpdate();
					System.out.println("row updated");
		}catch(Exception e) {
			e.printStackTrace();
			con.rollback();
	}
	finally {
		try {
			con.commit();
		
			pst.close();
			con.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	}
		

	//delete customer from customer table in database
	
	public void deleteCustomer() throws SQLException {
		try {
			
			con=DbConnect.dbConnectMethod();
			con.setAutoCommit(false);
			String delete="delete from Customer where cust_Id=?";
			pst=con.prepareStatement(delete);

			System.out.println("Customer Id: ");
			pst.setInt(1,sc.nextInt());
			pst.executeUpdate();
			
		System.out.println("row deleted");
		}catch(Exception e) {
			e.printStackTrace();
			con.rollback();
	}
	finally {
		try {
			con.commit();
			pst.close();
			con.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	}
	
	//return customer object
	
	
	public Customer getCust()
	{
		return c;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public void add() {
	boolean t;
	System.out.println("enter no. of customer to add");
	int num=sc.nextInt();
	set=new TreeSet<Customer>();
	while(num>0) {
	c=new Customer();
	System.out.println("Customer Id:");
	c.setCust_Id(sc.nextInt());
	sc.nextLine();
	do {
		 t=false;
	
	try {
		System.out.println("Customer Id:");
	if(String.valueOf(sc.nextInt()).length()>6)
		throw new MyException("id should be of 6 digits");
		//c.setCust_Id(sc.nextInt());
	else
		//c.setCust_Id(s);
	t=false;
	sc.nextLine();
	
	}
	catch(Exception e)
	{
		System.out.println("pls enter the id again");
		t=true;
//	sc.nextLine();
	}
	}while(t);
	
//	sc.nextLine();
	System.out.println("Customer Name :");
	c.setCust_Name(sc.nextLine());
	System.out.println("Customer Address :");
	c.setCust_Address(sc.nextLine());
	System.out.println("Costomer Mobile No. :");
	c.setCust_Mob(sc.nextLong());
	sc.nextLine();
	System.out.println("Customer DOB :");
	c.setCust_DOB(sc.nextLine());
	set.add(c);
	num--;
	}
	
}*/
	
	/*	System.out.println("Customer Id: "+c.getCust_Id());
		System.out.println("Customer Name: "+c.getCust_Name());
		System.out.println("Customer Address: "+c.getCust_Address());
		System.out.println("Customer Mobile No.: "+c.getCust_Mob());
		System.out.println("Customer DOB: "+c.getCust_DOB()+"\n\n");*/
//	}
	
	
	

}
