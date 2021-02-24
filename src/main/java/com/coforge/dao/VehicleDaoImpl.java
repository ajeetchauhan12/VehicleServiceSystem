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

import com.coforge.Service.CustomerServiceImpl;
import com.coforge.bean.Vehicle;
import com.coforge.db.DbConnect;

public class VehicleDaoImpl implements VehicleDao {
	
	/*private Set<Vehicle> sv=null;
	Iterator<Vehicle> itr=null;*/
	
	private Vehicle v=null;
	static Scanner sc=new Scanner(System.in);
	static Connection con=null;
	static PreparedStatement pst=null;
	static Statement st=null;
	 static ResultSet rs=null; 
	 
	 
	 
	 public void insertVehicleDetails(CustomerServiceImpl csi) throws SQLException {
			try {
				con=DbConnect.dbConnectMethod();
				con.setAutoCommit(false);
			System.out.println("enter no. of vehicles ");
			int num=sc.nextInt();
		
			while(num>0) {
				
				String query="insert into Vehicle values(?,?,?,?,?)";
				pst=con.prepareStatement(query);
				System.out.println("Vehicle registration No. ");
				pst.setLong(1,sc.nextLong());
			sc.nextLine();
				System.out.println("Vehicle Model :");
				pst.setString(2,sc.nextLine());
				
				System.out.println("Vehicle Engine No. :");
				pst.setLong(3,sc.nextLong());
				sc.nextLine();
				System.out.println("Vehicle Chasis No. :");
				pst.setLong(4,sc.nextLong());
sc.nextLine();
				/*v=new Vehicle();
				
				v.setCust_id(csi.getCust());
				int id=v.getCust_id();*/
System.out.println("enter the customer id");
				pst.setInt(5,sc.nextInt());
		pst.executeUpdate();
				num--;
		
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
			pst.close();
			con.close();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
				}
	 
	 public void displayAllVehicle() throws SQLException {
		 
		 try {
			 con=DbConnect.dbConnectMethod();
			 con.setAutoCommit(false);
			 st=con.createStatement();
			 String query="select * from Vehicle";
			 System.out.println("reterived data");
			 ResultSet rs=st.executeQuery(query);
			 while(rs.next()) {
				 System.out.println("Vehicle registration No. "+rs.getLong(1));
					System.out.println("Vehicle Model :"+rs.getString(2));		
					System.out.println("Vehicle Engine No. :"+rs.getLong(3));		
					System.out.println("Vehicle Chasis No. :"+rs.getLong(4));
			System.out.println("Customer Id :"+ rs.getInt(5));
				 
			 }
		 }catch(Exception e)
		 {
			 e.printStackTrace();
			 con.rollback();
		 }
		 finally
		 {
			 try {
				 con.commit();
			//		rs.close();
					st.close();
					con.close();
			
			 }catch(Exception e)
			 {
				 e.printStackTrace();
			 }
			 
			 
		 }
	 }
	 public void displayVehicleByRegNo() throws SQLException {
try {
	con=DbConnect.dbConnectMethod();
	 con.setAutoCommit(false);
	 st=con.createStatement();
System.out.println("enter the vehicle reg no to display");
	 int reg_No=sc.nextInt();
	 String query="select * from Vehicle where reg_No="+reg_No;
	ResultSet rs=st.executeQuery(query);
	while(rs.next())
	{
		System.out.println("Vehicle registration No. "+rs.getLong(1));
		System.out.println("Vehicle Model :"+rs.getString(2));		
		System.out.println("Vehicle Engine No. :"+rs.getLong(3));		
		System.out.println("Vehicle Chasis No. :"+rs.getLong(4));
        System.out.println("Customer Id :"+ rs.getInt(5));
	}
	}catch(Exception e)
{
e.printStackTrace();
con.rollback();
}
finally
{
	 try {
		 con.commit();
			//rs.close();
			st.close();
			con.close();
	
	 }catch(Exception e)
	 {
		 e.printStackTrace();
	 }
}
	 }
	 public void updateVehicleDetails() throws SQLException {
		 try {
			 con=DbConnect.dbConnectMethod();
			 con.setAutoCommit(false);
			 
			 String query="update Vehicle set model=?,engine_No=?,chasis_No=? where reg_No=?";
					 pst=con.prepareStatement(query);
					 
					 System.out.println("Vehicle Model :");
					 pst.setString(1,sc.nextLine());
					 System.out.println("Vehicle Engine No. :");
					 pst.setLong(2,sc.nextLong());
					 System.out.println("Vehicle Chasis No. :");
					 pst.setLong(3,sc.nextLong());
					 System.out.println("Vehicle registration No. ");
					 pst.setLong(4,sc.nextLong());
			 
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
	 public void deleteVehicleDetails() throws SQLException {
		 try {
			 con=DbConnect.dbConnectMethod();
			 con.setAutoCommit(false);
			 
			 String query="delete from Vehicle where reg_No=?";
			 pst=con.prepareStatement(query);
			 System.out.println("enter the reg no to delete vehicle details");
			 pst.setLong(1,sc.nextLong());
			 pst.executeUpdate();
			 System.out.println("vehicle details deleted");
			 
		 }catch(Exception e) {
			 e.printStackTrace();
			 con.rollback();
		 }
		 finally
		 {
		 	 try {
		 		 con.commit();
		 			//rs.close();
		 			pst.close();
		 			con.close();
		 	
		 	 }catch(Exception e)
		 	 {
		 		 e.printStackTrace();
		 	 }
		 }
		 
	 }
	 

			public Vehicle getVehicle() {
				return v;
			}




			
	 
	 
	 
	 
	 
	 
	/*public void add(CustomerServiceImpl csi) {
		
	System.out.println("enter no. of vehicles ");
	int num=sc.nextInt();
	while(num>0) {
		v=new Vehicle();
		sv=new TreeSet<Vehicle>();
		//c=cd.getCust();
		System.out.println("Vehicle registration No. ");
		v.setReg_No(sc.nextLong());
		
		sc.nextLine();
		System.out.println("Vehicle Model :");
		v.setModel(sc.nextLine());
		
		System.out.println("Vehicle Engine No. :");
		v.setEngine_No(sc.nextLong());
		
		System.out.println("Vehicle Chasis No. :");
		v.setChasis_No(sc.nextLong());
	num--;
	sv.add(v);
	}
		}*/
	
	
/*	public void display(CustomerDao cd) {
		//c=cd.getCust();
		System.out.println("Vehicle registration No. "+v.getReg_No());
		System.out.println("Vehicle Model :"+v.getModel());		
		System.out.println("Vehicle Engine No. :"+v.getEngine_No());		
		System.out.println("Vehicle Chasis No. :"+v.getChasis_No());
	//	System.out.println("Customer Id :"+ c.getCust_Id()+"\n\n");
	
		itr=sv.iterator();
		while(itr.hasNext())
		{
			Vehicle v=itr.next();
			System.out.println(v);
		}
		
		}*/
	/*public Vehicle getVehicle() {
		return v;
	}*/
	


}
