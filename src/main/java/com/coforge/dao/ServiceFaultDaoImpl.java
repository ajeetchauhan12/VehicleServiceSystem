package com.coforge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.coforge.Service.JobCardServiceImpl;
import com.coforge.Service.MechanicServiceImpl;
import com.coforge.Service.ServiceServImpl;
import com.coforge.bean.Service;
import com.coforge.bean.ServiceFault;
import com.coforge.bean.Vehicle;
import com.coforge.db.DbConnect;

public class ServiceFaultDaoImpl implements ServiceFaultDao{
	//private Service s;
	private ServiceFault sf=null;
	
	
private Service ser=null;

	
	static Scanner sc = new Scanner(System.in);

	
	static Connection con=null;
	static PreparedStatement pst=null;
	static Statement st=null;
	 static ResultSet rs=null; 
	 
	 
	 
	 public void insertServiceFaultDetails(ServiceServImpl ssi) throws SQLException {
			try {
				con=DbConnect.dbConnectMethod();
				con.setAutoCommit(false);
			
				
				
			
			
				
				String query="insert into ServiceFault values(?,?,?,?)";
				pst=con.prepareStatement(query);
		
				
				
		
				System.out.println("Service Fault Id :");
				pst.setInt(1,sc.nextInt());
				
			sc.nextLine();
			System.out.println("Service Fault type :");
			pst.setString(2,sc.nextLine());
				
			System.out.println("Service Fault date :");
				pst.setString(3,sc.nextLine());
				
				System.out.println("Service id");
				pst.setInt(4,sc.nextInt());


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
	 
	 public void displayAllServiceFaultDetails() throws SQLException {
		 
		 try {
			 con=DbConnect.dbConnectMethod();
			 con.setAutoCommit(false);
			 st=con.createStatement();
			 String query="select * from ServiceFault";
			 System.out.println("reterived data");
			 ResultSet rs=st.executeQuery(query);
			 while(rs.next()) {
				
				 
				 
				  System.out.println("Service Fault id : "+rs.getInt(1));
					System.out.println("Service fault Type :"+rs.getString(2));		
					System.out.println("service fault date :"+rs.getString(3));		
					
			System.out.println("Service Id :"+ rs.getInt(4));
				 
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
	 public void displayServicefaultByServicefaultId() throws SQLException {
try {
	con=DbConnect.dbConnectMethod();
	 con.setAutoCommit(false);
	 st=con.createStatement();
System.out.println("enter the service fault id  to display details");
	 int service_FaultId=sc.nextInt();
	 String query="select * from ServiceFault where service_FaultId="+service_FaultId;
	ResultSet rs=st.executeQuery(query);
	while(rs.next())
	{
		 System.out.println("Service Fault id : "+rs.getInt(1));
			System.out.println("Service fault Type :"+rs.getString(2));		
			System.out.println("service fault date :"+rs.getString(3));		
			
	System.out.println("Service Id :"+ rs.getInt(4));	
		
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
	 public void updateServiceFaultDetails() throws SQLException {
		 try {
			 con=DbConnect.dbConnectMethod();
			 con.setAutoCommit(false);
			 
			 String query="update Service set service_Fault_Type=?,service_Fault_Date=? where service_FaultId=?";
					 pst=con.prepareStatement(query);
					
						
					
					System.out.println("Service Fault type :");
					pst.setString(1,sc.nextLine());
						
					System.out.println("Service Fault date :");
						pst.setString(2,sc.nextLine());
						
						
						 
						 System.out.println("Service Fault Id :");
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
	 public void deleteServiceFaultDetails() throws SQLException {
		 try {
			 con=DbConnect.dbConnectMethod();
			 con.setAutoCommit(false);
			 
			 String query="delete from Service_Fault where service_FaultId=?";
			 pst=con.prepareStatement(query);
			 System.out.println("enter the service fault id  to delete service fault details");
			 pst.setInt(1,sc.nextInt());
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
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public void add(ServiceServImpl ssi) {
		sf=new ServiceFault();
		sf.setService_id(ssi.getService());
		System.out.println("Service Fault Id :");
		sf.setService_FaultId(sc.nextInt());
		sc.nextLine();
		System.out.println("Service Fault type :");
	sf.setService_Fault_Type(sc.nextLine());
		System.out.println("Service Fault date :");
		sf.setService_Fault_Date(sc.nextLine());
	//	s=sd.getService();
		//sf = new ServiceFault(id,s1,s2,s);
	}
	
	public void display(ServiceDao sd) {
		//s=sd.getService();
		System.out.println(sf.toString());
		//System.out.println("Service Id :"+s.getService_Id()+"\n\n");
	}*/
	
	public ServiceFault getServicefault() {
		return sf;
	}
}
