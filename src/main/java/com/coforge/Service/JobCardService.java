package com.coforge.Service;

import java.sql.SQLException;

import com.coforge.bean.JobCard;

public interface JobCardService {
/*	public void addJobCard(VehicleServiceImpl vsi);
	public void dispJobCard();*/
	public void insertJobCardDetails(VehicleServiceImpl vsi) throws SQLException;
	public void displayAllJobCard() throws SQLException;
	 public void displayJobByJobId() throws SQLException;
	 public void updateJobCardDetails() throws SQLException;
	 public void deleteJobCardDetails() throws SQLException;
	public JobCard getJobCard();
}
