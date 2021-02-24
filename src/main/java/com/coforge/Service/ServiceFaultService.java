package com.coforge.Service;

import java.sql.SQLException;

import com.coforge.bean.ServiceFault;

public interface ServiceFaultService {
/*public void addServiceFault(ServiceServImpl ssi);
public void dispSericeFault();*/
	public void insertServiceFaultDetails(ServiceServImpl ssi) throws SQLException;
	 public void displayAllServiceFaultDetails() throws SQLException;
	 public void displayServicefaultByServicefaultId() throws SQLException;
	 public void updateServiceFaultDetails() throws SQLException;
	 public void deleteServiceFaultDetails() throws SQLException;
	
public ServiceFault getServicefault();
}
