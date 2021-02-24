package com.coforge.Service;

import java.sql.SQLException;

import com.coforge.bean.JobCard;
import com.coforge.dao.JobCardDao;
import com.coforge.dao.JobCardDaoImpl;

public class JobCardServiceImpl implements JobCardService {
private JobCardDao jcd=null;
	public JobCardServiceImpl() {
	// TODO Auto-generated constructor stub
jcd=new JobCardDaoImpl();
	}
	/*public void addJobCard(VehicleServiceImpl vsi) {
		// TODO Auto-generated method stub
		jcd.add(vsi);
	}

	public void dispJobCard() {
		// TODO Auto-generated method stub
		jcd.display();
	}*/
	
	
	
	
	public JobCard getJobCard() {
		return jcd.getJobCard();
	}
	public void insertJobCardDetails(VehicleServiceImpl vsi) throws SQLException {
		// TODO Auto-generated method stub
		jcd.insertJobCardDetails(vsi);
		
	}
	public void displayAllJobCard() throws SQLException {
		// TODO Auto-generated method stub
		jcd.displayAllJobCard();
	}
	public void displayJobByJobId() throws SQLException {
		// TODO Auto-generated method stub
		jcd.displayJobByJobId();
	}
	public void updateJobCardDetails() throws SQLException {
		// TODO Auto-generated method stub
		jcd.updateJobCardDetails();
	}
	public void deleteJobCardDetails() throws SQLException {
		// TODO Auto-generated method stub
		jcd.deleteJobCardDetails();
	}

}
