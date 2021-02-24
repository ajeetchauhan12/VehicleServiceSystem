package com.coforge.dao;

import java.sql.SQLException;
import java.util.Scanner;

import com.coforge.Service.InsuranceServiceImpl;
import com.coforge.Service.ServiceServImpl;
import com.coforge.Service.VehicleServiceImpl;
import com.coforge.bean.Bill;
import com.coforge.bean.Insurance;
import com.coforge.bean.Service;

public interface BillDao {
	/*public void add( ServiceServImpl ssi,InsuranceServiceImpl isi);
	public void display();*/
	public void insertBillDetails(ServiceServImpl ssi,InsuranceServiceImpl isi) throws SQLException;
	 public void displayAllBills() throws SQLException;
	 public void displayBillByBillId() throws SQLException;
	 public void updateBillDetails() throws SQLException;
	 public void deleteBillDetails() throws SQLException;
	 
}
