package com.coforge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.coforge.Service.VehicleServiceImpl;
import com.coforge.bean.Insurance;
import com.coforge.bean.Vehicle;
import com.coforge.db.DbConnect;

public class InsuranceDaoImpl implements InsuranceDao{
	
	private Insurance i=null;
//	private Vehicle v;
	//Scanner sc = new Scanner(System.in);

	
	static Scanner sc = new Scanner(System.in);

	private Vehicle v=null;
	
	static Connection con=null;
	static PreparedStatement pst=null;
	static Statement st=null;
	 static ResultSet rs=null; 
	 
	 
	 
	 public void insertInsuranceDetails(VehicleServiceImpl vsi) throws SQLException {
			try {
				con=DbConnect.dbConnectMethod();
				con.setAutoCommit(false);
			
		
			
				
				String query="insert into Insurance values(?,?,?,?,?)";
				pst=con.prepareStatement(query);
		
				
		
				System.out.println("Insurance No : ");
				pst.setInt(1,sc.nextInt());
				
			sc.nextLine();
			System.out.println("Insurance Date :");
			pst.setString(2,sc.nextLine());
				
			System.out.println("Insurance Duration :");
				pst.setInt(3,sc.nextInt());
				
				System.out.println("Insurance Amount :");
				pst.setDouble(4,sc.nextDouble());

System.out.println("enter the Vehicle id");
				pst.setLong(5,sc.nextLong());
		pst.executeUpdate();
				
		
			
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
	 
	 public void displayAllInsurance() throws SQLException {
		 
		 try {
			 con=DbConnect.dbConnectMethod();
			 con.setAutoCommit(false);
			 st=con.createStatement();
			 String query="select * from Insurance";
			 System.out.println("reterived data");
			 ResultSet rs=st.executeQuery(query);
			 while(rs.next()) {
				
				  System.out.println("Insurance No. : "+rs.getInt(1));
					System.out.println("InsuranceDate :"+rs.getString(2));		
					System.out.println("Insurance duration :"+rs.getInt(3));		
					System.out.println("insurance amount :"+rs.getDouble(4));
			System.out.println("Vehicle Reg no.: "+ rs.getLong(5));
				 
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
	 public void displayInsuranceByInsuranceNo() throws SQLException {
try {
	con=DbConnect.dbConnectMethod();
	 con.setAutoCommit(false);
	 st=con.createStatement();
System.out.println("enter the insurance no  to display details");
	 int insurance_No=sc.nextInt();
	 String query="select * from Insurance where insurance_No="+insurance_No;
	ResultSet rs=st.executeQuery(query);
	while(rs.next())
	{
		System.out.println("Insurance No. : "+rs.getInt(1));
		System.out.println("InsuranceDate :"+rs.getString(2));		
		System.out.println("Insurance duration :"+rs.getInt(3));		
		System.out.println("insurance amount :"+rs.getDouble(4));
System.out.println("Vehicle Reg no.: "+ rs.getLong(5));
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
	 public void updateInsuranceDetails() throws SQLException {
		 try {
			 con=DbConnect.dbConnectMethod();
			 con.setAutoCommit(false);
			 
			 String query="update insurance set insurance_Date=?,insurance_Duration=?,insurance_Amount=? where insurance_No=?";
					 pst=con.prepareStatement(query);
					 
					 
						
					
						
					
					System.out.println("Insurance Date :");
					pst.setString(1,sc.nextLine());
						
					System.out.println("Insurance Duration :");
						pst.setInt(2,sc.nextInt());
						
						System.out.println("Insurance Amount :");
						pst.setDouble(3,sc.nextDouble());
						 System.out.println("Insurance No : ");
							pst.setInt(4,sc.nextInt());
		
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
	 public void deleteInsuranceDetails() throws SQLException {
		 try {
			 con=DbConnect.dbConnectMethod();
			 con.setAutoCommit(false);
			 
			 String query="delete from Insurance where insurance_No=?";
			 pst=con.prepareStatement(query);
			 System.out.println("enter the insurance no to delete insurance details");
			 pst.setInt(1,sc.nextInt());
			 pst.executeUpdate();
			 System.out.println("insurance   details deleted");
			 
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
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public void add( VehicleServiceImpl vsi) {
	i=new Insurance();
	i.setReg_no(vsi.getVehicle());	
	System.out.println("Insurance No :");
		i.setInsurance_No(sc.nextInt());
		
		sc.nextLine();
		System.out.println("Insurance Date :");
		i.setInsurance_Date(sc.nextLine());
		System.out.println("Insurance Duration :");
		i.setInsurance_Duration(sc.nextInt());
		System.out.println("Insurance Amount :");
		i.setInsurance_Amount(sc.nextInt());
		//v=vd.getVehicle();
		//i=new Insurance(s1,s2,s3,s4,v);
	}
	
	public void display(VehicleDao vd) {
	//	v=vd.getVehicle();
		System.out.println(i.toString());
		//System.out.println("Vehicle registration No. :"+v.getReg_No()+"\n\n");
	}*/
	
	public Insurance getInsurance() {
		return i;
	}
}
