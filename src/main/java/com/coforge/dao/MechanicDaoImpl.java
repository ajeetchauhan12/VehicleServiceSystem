package com.coforge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.coforge.bean.Mechanic;
import com.coforge.db.DbConnect;

public class MechanicDaoImpl implements MechanicDao {
	private Mechanic mech=null;
	static Connection con=null;
	static Statement st=null;
	static PreparedStatement pst=null;
	static ResultSet rs=null;
	static Scanner sc = new Scanner(System.in);
	
	public void InsertMecahnic() throws SQLException {
	
		try {
			con=DbConnect.dbConnectMethod();
			con.setAutoCommit(false);
			String query="insert into Mechanic values(?,?,?,?,?)";
			pst=con.prepareStatement(query);
			System.out.println("Mechanic Id :");
			pst.setInt(1,sc.nextInt());
			sc.nextLine();
			System.out.println("Mechanic name :");
			pst.setString(2,sc.nextLine());
			System.out.println("Mechanic address :");
			pst.setString(3,sc.nextLine());
			System.out.println("Mechanic Mobile No. :");
			pst.setLong(4,sc.nextLong());
			sc.nextLine();
			System.out.println("Mechanic DOB");
			pst.setString(5,sc.nextLine());
			pst.executeUpdate();
		}catch(Exception e)
		{
			e.printStackTrace();
			con.rollback();
		}finally {
			try {
				con.commit();
				pst.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	
	}
	
	public void displayAllMechanics() throws SQLException {
		try {
	con=DbConnect.dbConnectMethod();
	con.setAutoCommit(false);
	st=con.createStatement();
	String query="select * from Mechanic";	
	ResultSet rs=st.executeQuery(query);
	while(rs.next())
	{	System.out.println("Mechanic Id :"+ rs.getInt(1));
		System.out.println("Mechanic name :"+rs.getString(2));
		System.out.println("Mechanic address :"+rs.getString(3));
		System.out.println("Mechanic Mobile No. :"+rs.getLong(4));
		System.out.println("Mechanic DOB  :"+rs.getString(5)+"\n\n");
	}
	}catch(Exception e)
	{
		e.printStackTrace();
	con.rollback();
	}
		finally {
			con.commit();
			st.close();
			con.close();
		}
}
	public  void displayMechanicById() throws SQLException {
		try {
			con=DbConnect.dbConnectMethod();
			con.setAutoCommit(false);
			st=con.createStatement();
			System.out.println("enter the mechanic id to diplay ");
			int mech_id=sc.nextInt();
			String query="select * from Mechanic where mech_Id="+mech_id;
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				System.out.println("Mechanic Id :"+ rs.getInt(1));
				System.out.println("Mechanic name :"+rs.getString(2));
				System.out.println("Mechanic address :"+rs.getString(3));
				System.out.println("Mechanic Mobile No. :"+rs.getLong(4));
				System.out.println("Mechanic DOB  :"+rs.getString(5)+"\n\n");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
			con.rollback();
		}finally {
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
	public  void updateMechanic() throws SQLException {
		try {
			con=DbConnect.dbConnectMethod();
					con.setAutoCommit(false);
					String update="update Mechanic set mechanic_Name=?,mechanic_Address=?,mechanic_Mob=?,mechanic_DOB=? where mechanic_Id=?";
					
					pst=con.prepareStatement(update);
					
					System.out.println("Mechanic name :");
					pst.setString(1,sc.nextLine());
					System.out.println("Mechanic address :");
					pst.setString(2,sc.nextLine());
					
					System.out.println("Mechanic Mobile No. :");
					pst.setLong(3,sc.nextLong());
					
					System.out.println("Mechanic DOB  :\n\n");
					pst.setString(4,sc.nextLine());
					System.out.println("Mechanic Id :");
					pst.setInt(5,sc.nextInt());
					pst.executeUpdate();
					System.out.println("row updated");
			
		}catch(Exception e)
		{
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
	public  void deleteMechanic() throws SQLException {
		try{con=DbConnect.dbConnectMethod();
		con.setAutoCommit(false);
		String deleted="delete from Mechanic where mech_Id=?";
		pst=con.prepareStatement(deleted);
		System.out.println("enter the mechanic id to delete mechanic details");
		pst.setInt(1,sc.nextInt());
		pst.executeUpdate();
		}catch(Exception e)
		{
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
		
		public Mechanic getMechanic() {
			return mech;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*public void display() {
		System.out.println("Mechanic Id :"+ mech.getMechanic_Id());
		System.out.println("Mechanic name :"+mech.getMechanic_Name());
		System.out.println("Mechanic address :"+mech.getMechanic_Address());
		System.out.println("Mechanic Mobile No. :"+mech.getMechanic_Mob());
		System.out.println("Mechanic DOB"+mech.getMechanic_DOB()+"\n\n");
	}*/
	/*public void add() {
		//	mech=new Mechanic();
			try {
				con=DbConnect.dbConnectMethod();
				String query="insert into Mechanic values(?,?,?,?,?)";
				pst=con.prepareStatement(query);
			pst.setInt(1,sc.nextInt());
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println("Mechanic Id :");
			mech.setMechanic_Id(sc.nextInt());
			
			sc.nextLine();
			System.out.println("Mechanic name :");
			
			mech.setMechanic_Name(sc.nextLine());
			System.out.println("Mechanic address :");
		mech.setMechanic_Address(sc.nextLine());
			System.out.println("Mechanic Mobile No. :");
		mech.setMechanic_Mob(sc.nextLong());
			
			System.out.println("Mechanic DOB");
			
			mech.setMechanic_DOB(sc.nextLine());
		
		}
		
		public void display() {
			System.out.println("Mechanic Id :"+ mech.getMechanic_Id());
			System.out.println("Mechanic name :"+mech.getMechanic_Name());
			System.out.println("Mechanic address :"+mech.getMechanic_Address());
			System.out.println("Mechanic Mobile No. :"+mech.getMechanic_Mob());
			System.out.println("Mechanic DOB"+mech.getMechanic_DOB()+"\n\n");
		}
		*/
	
}
