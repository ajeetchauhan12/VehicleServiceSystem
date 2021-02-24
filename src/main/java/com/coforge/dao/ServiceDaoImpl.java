package com.coforge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.coforge.Service.JobCardService;
import com.coforge.Service.JobCardServiceImpl;
import com.coforge.Service.MechanicServiceImpl;
import com.coforge.Service.VehicleServiceImpl;
import com.coforge.bean.JobCard;
import com.coforge.bean.Mechanic;
import com.coforge.bean.Service;
import com.coforge.bean.Vehicle;
import com.coforge.db.DbConnect;

public class ServiceDaoImpl implements ServiceDao{
	private Service ser=null;

	
	static Scanner sc = new Scanner(System.in);

	private Vehicle v=null;
	
	static Connection con=null;
	static PreparedStatement pst=null;
	static Statement st=null;
	 static ResultSet rs=null; 
	 
	 
	 
	 public void insertServiceDetails(MechanicServiceImpl mci,JobCardServiceImpl jcsi) throws SQLException {
			try {
				con=DbConnect.dbConnectMethod();
				con.setAutoCommit(false);
			
		
			
				
				String query="insert into Service values(?,?,?,?,?)";
				pst=con.prepareStatement(query);
		
				
				
		
				System.out.println("Service Id :");
				pst.setInt(1,sc.nextInt());
				
			sc.nextLine();
			System.out.println("Service Type :");
			pst.setString(2,sc.nextLine());
				
			System.out.println("Parts :");
				pst.setString(3,sc.nextLine());
				
				System.out.println("Mechanic id");
				pst.setInt(4,sc.nextInt());

System.out.println("enter the JobCard id");
	pst.setInt(5,sc.nextInt());
	
	
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
	 
	 public void displayAllServiceDetails() throws SQLException {
		 
		 try {
			 con=DbConnect.dbConnectMethod();
			 con.setAutoCommit(false);
			 st=con.createStatement();
			 String query="select * from Service";
			 System.out.println("reterived data");
			 ResultSet rs=st.executeQuery(query);
			 while(rs.next()) {
				
				 
				 
				  System.out.println("Service Id : "+rs.getInt(1));
					System.out.println("Service Type :"+rs.getString(2));		
					System.out.println("Parts :"+rs.getString(3));		
					System.out.println("Mechanic Id :"+rs.getInt(4));
			System.out.println("Job Id :"+ rs.getInt(5));
				 
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
	 public void displayServiceByServiceId() throws SQLException {
try {
	con=DbConnect.dbConnectMethod();
	 con.setAutoCommit(false);
	 st=con.createStatement();
System.out.println("enter the service id  to display details");
	 int service_id=sc.nextInt();
	 String query="select * from Service where service_id="+service_id;
	ResultSet rs=st.executeQuery(query);
	while(rs.next())
	{
		System.out.println("Service Id : "+rs.getInt(1));
		System.out.println("Service Type :"+rs.getString(2));		
		System.out.println("Parts :"+rs.getString(3));		
		System.out.println("Mechanic Id :"+rs.getInt(4));
System.out.println("Job Id :"+ rs.getInt(5));
		
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
	 public void updateServiceDetails() throws SQLException {
		 try {
			 con=DbConnect.dbConnectMethod();
			 con.setAutoCommit(false);
			 
			 String query="update Service set service_Type=?,parts=? where service_Id=?";
					 pst=con.prepareStatement(query);
					 
					 
						

						
						
				
					System.out.println("Service Type :");
					pst.setString(1,sc.nextLine());
						
					System.out.println("Parts :");
						pst.setString(2,sc.nextLine());
						System.out.println("Service Id :");
						pst.setInt(3,sc.nextInt());
						
					
		
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
	 public void deleteServiceDetails() throws SQLException {
		 try {
			 con=DbConnect.dbConnectMethod();
			 con.setAutoCommit(false);
			 
			 String query="delete from Service where service_Id=?";
			 pst=con.prepareStatement(query);
			 System.out.println("enter the service id  to delete service details");
			 pst.setLong(1,sc.nextInt());
			 pst.executeUpdate();
			 System.out.println("Service  details deleted");
			 
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
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*Scanner sc = new Scanner(System.in);
	private Mechanic mech;
	private JobCard job;

	public void add(MechanicServiceImpl mci,JobCardServiceImpl jcsi) {

		mech=md.getMechanic();
		job=jd.getJobCard();
		ser=new Service();
		ser.setMechanic_id(mci.getMechanic());
		ser.setJobCard_id(jcsi.getJobCard());
		
		
		System.out.println("Service Id :");
		ser.setService_Id(sc.nextInt());
		
		sc.nextLine();
		System.out.println("Service Type :");
		ser.setService_Type(sc.nextLine());
		
		System.out.println("Parts :");
		ser.setParts(sc.nextLine());

	}
	
	public void display(MechanicDao md,JobCardDao jd) {
		mech=md.getMechanic();
		job=jd.getJobCard();
		System.out.println("Service Id :"+ser.getService_Id());
		System.out.println("Service Type :"+ser.getService_Type());
		System.out.println("Parts :"+ser.getParts());
		System.out.println("Mechanic Id :"+mech.getMechanic_Id());
		System.out.println("Job Id :"+job.getJob_Id()+"\n\n");
	}*/
	
	public Service getService() {
		return ser;
	}


}
