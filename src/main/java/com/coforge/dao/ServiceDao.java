package com.coforge.dao;

import java.sql.SQLException;
import java.util.Scanner;

import com.coforge.Service.JobCardServiceImpl;
import com.coforge.Service.MechanicServiceImpl;
import com.coforge.bean.JobCard;
import com.coforge.bean.Mechanic;
import com.coforge.bean.Service;

public interface ServiceDao {
/*	public void add(MechanicServiceImpl mci,JobCardServiceImpl jcsi);
	public void display();*/
	public void insertServiceDetails(MechanicServiceImpl mci,JobCardServiceImpl jcsi) throws SQLException ;
	public void displayAllServiceDetails() throws SQLException;
	public void displayServiceByServiceId() throws SQLException;
	public void updateServiceDetails() throws SQLException;
	 public void deleteServiceDetails() throws SQLException;
	public Service getService();	
}
