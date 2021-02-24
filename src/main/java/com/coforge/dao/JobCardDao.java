package com.coforge.dao;



import java.sql.SQLException;

import com.coforge.Service.VehicleServiceImpl;
import com.coforge.bean.JobCard;
import com.coforge.bean.Vehicle;

public interface JobCardDao {
	/*public void add(VehicleServiceImpl vsi);
	public void display();*/
	public void insertJobCardDetails(VehicleServiceImpl vsi) throws SQLException;
	public void displayAllJobCard() throws SQLException;
	 public void displayJobByJobId() throws SQLException;
	 public void updateJobCardDetails() throws SQLException;
	 public void deleteJobCardDetails() throws SQLException;
	public JobCard getJobCard();
	
}
