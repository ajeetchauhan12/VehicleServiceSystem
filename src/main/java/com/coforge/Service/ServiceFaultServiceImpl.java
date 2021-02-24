package com.coforge.Service;

import java.sql.SQLException;

import com.coforge.bean.ServiceFault;
import com.coforge.dao.ServiceFaultDao;
import com.coforge.dao.ServiceFaultDaoImpl;

public class ServiceFaultServiceImpl implements ServiceFaultService {
private ServiceFaultDao sfd=null;
	public ServiceFaultServiceImpl() {
		sfd=new ServiceFaultDaoImpl();
	
}
	
	
	
	
	/*public void addServiceFault(ServiceServImpl ssi) {
		sfd.add(ssi);
		
	}

	public void dispSericeFault() {
		
		sfd.display();
	}*/
	public ServiceFault getServicefault() {
		return sfd.getServicefault();
	}




	public void insertServiceFaultDetails(ServiceServImpl ssi) throws SQLException {
		// TODO Auto-generated method stub
		sfd.insertServiceFaultDetails(ssi);
		
	}




	public void displayAllServiceFaultDetails() throws SQLException {
		// TODO Auto-generated method stub
		sfd.displayAllServiceFaultDetails();
	}




	public void displayServicefaultByServicefaultId() throws SQLException {
		// TODO Auto-generated method stub
	sfd.displayServicefaultByServicefaultId();	
	}




	public void updateServiceFaultDetails() throws SQLException {
		// TODO Auto-generated method stub
		sfd.updateServiceFaultDetails();
	}




	public void deleteServiceFaultDetails() throws SQLException {
		// TODO Auto-generated method stub
		sfd.deleteServiceFaultDetails();
	}

}
