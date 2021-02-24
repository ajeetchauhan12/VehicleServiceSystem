package com.coforge.Service;

import java.sql.SQLException;

import com.coforge.bean.Service;
import com.coforge.dao.ServiceDao;
import com.coforge.dao.ServiceDaoImpl;

public class ServiceServImpl implements ServiceServ {
	private ServiceDao sd=null;
public ServiceServImpl() {
	// TODO Auto-generated constructor stub
	sd=new ServiceDaoImpl(); 
}	
	
public void insertServiceDetails(MechanicServiceImpl mci,JobCardServiceImpl jcsi) throws SQLException{
	sd.insertServiceDetails(mci, jcsi);
}
public void displayAllServiceDetails() throws SQLException{
	sd.displayAllServiceDetails();
}
public void displayServiceByServiceId() throws SQLException{
	sd.displayServiceByServiceId();
}
public void updateServiceDetails() throws SQLException
{
	sd.updateServiceDetails();
	}
 public void deleteServiceDetails() throws SQLException{
	 sd.deleteServiceDetails();
 }











/*public void addService(MechanicServiceImpl mci,JobCardServiceImpl jcsi) {
		// TODO Auto-generated method stub
		sd.add(mci,jcsi);
		
	}

	public void dispService() {
		// TODO Auto-generated method stub
		sd.display();
	}*/

	public Service getService() {
		return sd.getService();
	}


}
