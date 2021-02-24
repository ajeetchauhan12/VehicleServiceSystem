package com.coforge.Service;

import java.sql.SQLException;

import com.coforge.bean.Service;

public interface ServiceServ {
/*public void addService(MechanicServiceImpl mci,JobCardServiceImpl Impl);
public void dispService();*/
	public void insertServiceDetails(MechanicServiceImpl mci,JobCardServiceImpl jcsi) throws SQLException ;
	public void displayAllServiceDetails() throws SQLException;
	public void displayServiceByServiceId() throws SQLException;
	public void updateServiceDetails() throws SQLException;
	 public void deleteServiceDetails() throws SQLException;

public Service getService();
}
