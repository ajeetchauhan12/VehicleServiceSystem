package com.coforge.dao;

import java.sql.SQLException;
import java.util.Scanner;

import com.coforge.Service.ServiceServImpl;
import com.coforge.bean.Service;
import com.coforge.bean.ServiceFault;

public interface ServiceFaultDao {
	/*public void add(ServiceServImpl ssi);
	public void display();*/
	public void insertServiceFaultDetails(ServiceServImpl ssi) throws SQLException;
	 public void displayAllServiceFaultDetails() throws SQLException;
	 public void displayServicefaultByServicefaultId() throws SQLException;
	 public void updateServiceFaultDetails() throws SQLException;
	 public void deleteServiceFaultDetails() throws SQLException;
	public ServiceFault getServicefault();
	
}
