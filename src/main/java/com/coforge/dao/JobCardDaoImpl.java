package com.coforge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.coforge.Service.CustomerServiceImpl;
import com.coforge.Service.VehicleServiceImpl;
import com.coforge.bean.JobCard;
import com.coforge.bean.Vehicle;
import com.coforge.db.DbConnect;

public class JobCardDaoImpl implements JobCardDao {
	JobCard job=null;
	static Scanner sc = new Scanner(System.in);

	private Vehicle v=null;
	
	static Connection con=null;
	static PreparedStatement pst=null;
	static Statement st=null;
	 static ResultSet rs=null; 
	 
	 
	 
	 public void insertJobCardDetails(VehicleServiceImpl vsi) throws SQLException {
			try {
				con=DbConnect.dbConnectMethod();
				con.setAutoCommit(false);
			
		
			
				
				String query="insert into JobCard values(?,?,?,?,?)";
				pst=con.prepareStatement(query);
		
			
		
				System.out.println("JobCard Id : ");
				pst.setInt(1,sc.nextInt());
				
			sc.nextLine();
			System.out.println("Issues :");
			pst.setString(2,sc.nextLine());
				
				System.out.println("Remarks :");
				pst.setString(3,sc.nextLine());
				
				System.out.println("Date Of Service :");
				pst.setString(4,sc.nextLine());

System.out.println("enter the Vehicle id");
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
	 
	 public void displayAllJobCard() throws SQLException {
		 
		 try {
			 con=DbConnect.dbConnectMethod();
			 con.setAutoCommit(false);
			 st=con.createStatement();
			 String query="select * from JobCard";
			 System.out.println("reterived data");
			 ResultSet rs=st.executeQuery(query);
			 while(rs.next()) {
				
				  System.out.println("JobCard Id : "+rs.getLong(1));
					System.out.println("Issues :"+rs.getString(2));		
					System.out.println("Remarks :"+rs.getLong(3));		
					System.out.println("Date Of Service :"+rs.getLong(4));
			System.out.println("Vehicle Reg no.: "+ rs.getInt(5));
				 
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
	 public void displayJobByJobId() throws SQLException {
try {
	con=DbConnect.dbConnectMethod();
	 con.setAutoCommit(false);
	 st=con.createStatement();
System.out.println("enter the job id  to display details");
	 int reg_No=sc.nextInt();
	 String query="select * from JobCard where reg_No="+reg_No;
	ResultSet rs=st.executeQuery(query);
	while(rs.next())
	{
		System.out.println("JobCard Id : "+rs.getLong(1));
		System.out.println("Issues :"+rs.getString(2));		
		System.out.println("Remarks :"+rs.getLong(3));		
		System.out.println("Date Of Service :"+rs.getLong(4));
System.out.println("Vehicle Reg no.: "+ rs.getInt(5));
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
	 public void updateJobCardDetails() throws SQLException {
		 try {
			 con=DbConnect.dbConnectMethod();
			 con.setAutoCommit(false);
			 
			 String query="update JobCard set issues=?,remarks=?,date_of_service=? where job_Id=?";
					 pst=con.prepareStatement(query);
					 
					 
						
					
					System.out.println("Issues :");
					pst.setString(1,sc.nextLine());
						
						System.out.println("Remarks :");
						pst.setString(2,sc.nextLine());
						
						System.out.println("Date Of Service :");
						pst.setString(3,sc.nextLine());
						System.out.println("JobCard Id : ");
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
	 public void deleteJobCardDetails() throws SQLException {
		 try {
			 con=DbConnect.dbConnectMethod();
			 con.setAutoCommit(false);
			 
			 String query="delete from JobCard where job_Id=?";
			 pst=con.prepareStatement(query);
			 System.out.println("enter the job_Id no to delete job card details");
			 pst.setLong(1,sc.nextLong());
			 pst.executeUpdate();
			 System.out.println("job card  details deleted");
			 
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
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//	Vehicle v ;
	
	/*public void add(VehicleServiceImpl vsi) {
	job=new JobCard();
	//	job.setVehicle(vehicle);
		job.setVehicle_id(vsi.getVehicle());
		System.out.println("JobCard Id : ");
		job.setJob_Id(sc.nextInt());
		
		sc.nextLine();
		System.out.println("Issues :");
		job.setIssues(sc.nextLine());
		
		System.out.println("Remarks :");
		job.setRemarks(sc.nextLine());
		
		System.out.println("Date Of Service");
	job.setDate_Of_Service(sc.nextLine());
		
//		job=new JobCard(i,is,r,d,v);
		
	}
	
	public void display(VehicleDao vd) {
		//v=vd.getVehicle();
		System.out.println("JobCard Id : "+job.getJob_Id());
		System.out.println("Issues :"+job.getIssues());
		System.out.println("Remarks :"+job.getRemarks());
		System.out.println("Date Of Service :"+job.getDate_Of_Service());
	//	System.out.println("Vehicle registration no."+v.getReg_No()+"\n\n");
	}*/
	
	public JobCard getJobCard() {
		return job;
	}
	
}
