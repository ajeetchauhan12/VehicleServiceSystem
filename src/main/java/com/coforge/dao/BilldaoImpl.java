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

import com.coforge.Service.InsuranceServiceImpl;
import com.coforge.Service.ServiceServImpl;
import com.coforge.Service.VehicleServiceImpl;
import com.coforge.bean.Bill;
import com.coforge.bean.Insurance;
import com.coforge.bean.Service;
import com.coforge.bean.Vehicle;
import com.coforge.db.DbConnect;

public class BilldaoImpl implements BillDao {
	private Bill b;
	/*Set<Bill> sb=null;
	Iterator<Bill> itr=null;
	Scanner sc = new Scanner(System.in);*/
	static Scanner sc = new Scanner(System.in);

	private Vehicle v=null;
	
	static Connection con=null;
	static PreparedStatement pst=null;
	static Statement st=null;
	 static ResultSet rs=null; 
	 
	 
	 
	 public void insertBillDetails(ServiceServImpl ssi,InsuranceServiceImpl isi) throws SQLException {
			try {
				con=DbConnect.dbConnectMethod();
				con.setAutoCommit(false);
			
				
			
				
				String query="insert into Bill values(?,?,?,?,?,?)";
				pst=con.prepareStatement(query);
		
				
		
				System.out.println("Bill Id :");
				pst.setInt(1,sc.nextInt());
				System.out.println("Labour charges");
				pst.setDouble(2,sc.nextDouble());
				System.out.println("Service charges :");
				pst.setDouble(3,sc.nextDouble());
			sc.nextLine();
			System.out.println("Bill date :");
			pst.setString(4,sc.nextLine());
				
			System.out.println("Service id :");
				pst.setInt(5,sc.nextInt());
				
				System.out.println("Insurance No:");
				pst.setInt(6,sc.nextInt());

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
	 
	 public void displayAllBills() throws SQLException {
		 
		 try {
			 con=DbConnect.dbConnectMethod();
			 con.setAutoCommit(false);
			 st=con.createStatement();
			 String query="select * from Bill";
			 System.out.println("reterived data");
			 ResultSet rs=st.executeQuery(query);
			 while(rs.next()) {
				
				  System.out.println("Bill No. : "+rs.getInt(1));
					System.out.println("labour charges :"+rs.getDouble(2));		
					System.out.println("Service charges :"+rs.getDouble(3));		
					System.out.println("bill date :"+rs.getString(4));
			System.out.println("Service id: "+ rs.getInt(5));
			System.out.println("Insurance no: "+ rs.getInt(6));
				 
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
	 public void displayBillByBillId() throws SQLException {
try {
	con=DbConnect.dbConnectMethod();
	 con.setAutoCommit(false);
	 st=con.createStatement();
System.out.println("enter the bill id to display details");
	 int bill_Id=sc.nextInt();
	 String query="select * from Bill where bill_Id="+bill_Id;
	ResultSet rs=st.executeQuery(query);
	while(rs.next())
	{
		System.out.println("Bill No. : "+rs.getInt(1));
		System.out.println("labour charges :"+rs.getDouble(2));		
		System.out.println("Service charges :"+rs.getDouble(3));		
		System.out.println("bill date :"+rs.getString(4));
System.out.println("Service id: "+ rs.getInt(5));
System.out.println("Insurance no: "+ rs.getInt(6));
		
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
	 public void updateBillDetails() throws SQLException {
		 try {
			 con=DbConnect.dbConnectMethod();
			 con.setAutoCommit(false);
			 
			 String query="update Bill set labour_Charges=?,service_Charges=?,bill_Date=? where bill_Id=?";
					 pst=con.prepareStatement(query);
					 
					 
						
					
					
						System.out.println("Labour charges");
						pst.setDouble(1,sc.nextDouble());
						System.out.println("Service charges :");
						pst.setDouble(2,sc.nextDouble());
					sc.nextLine();
					System.out.println("Bill date :");
					pst.setString(3,sc.nextLine());
						
					
						
						 System.out.println("Bill Id :");
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
	 public void deleteBillDetails() throws SQLException {
		 try {
			 con=DbConnect.dbConnectMethod();
			 con.setAutoCommit(false);
			 
			 String query="delete from Bill where bill_Id=?";
			 pst=con.prepareStatement(query);
			 System.out.println("enter the bill id to delete bill details");
			 pst.setInt(1,sc.nextInt());
			 pst.executeUpdate();
			 System.out.println("bill  details deleted");
			 
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
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public void add( ServiceServImpl ssi,InsuranceServiceImpl isi) {
	System.out.println("enter the no of bills to imput");
	int num=sc.nextInt();
	sb=new TreeSet<Bill>();
	while(num>0) {
		b=new Bill();
		b.setService_Id(ssi.getService());
	b.setInsurance_no(isi.getInsurance());
	
	System.out.println("Bill Id :");
		b.setBill_Id(sc.nextInt());
	
		System.out.println("Labour charges");
		b.setLabour_Charges(sc.nextDouble());
		
		System.out.println("Service charges :");
		b.setService_Charges(sc.nextDouble());
		sc.nextLine();
		System.out.println("Bill date :");
		b.setBill_date(sc.nextLine());
		num--;
		sb.add(b);
	
	}
	}
	
	public void display(InsuranceDao id,ServiceDao sd) {
		i=id.getInsurance();
		s=sd.getService();
		System.out.println(b.toString());
		//System.out.println("Insurance No :"+i.getInsurance_No());
	//	System.out.println("Service Id :"+s.getService_Id()+"\n\n");
		itr=sb.iterator();
		while(itr.hasNext()) {
			Bill b=itr.next();
			System.out.println(b);
		}
	}*/
}
