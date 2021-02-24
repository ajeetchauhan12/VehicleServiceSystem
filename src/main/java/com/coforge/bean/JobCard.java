package com.coforge.bean;

import com.coforge.Exception.MyException;

public class JobCard {

	private int job_Id;
	private String issues;
    private String remarks;
    private String date_Of_Service;
    private Vehicle vehicle;
    private long vehicle_id;
    

    public JobCard(long vehicle_id,int job_Id, String issues, String remarks, String date_Of_Service, Vehicle vehicle) {
		this.vehicle_id=vehicle_id;
		this.job_Id = job_Id;
		this.issues = issues;
		this.remarks = remarks;
		this.date_Of_Service = date_Of_Service;
		this.vehicle = vehicle;
	}
    public JobCard() {
		// TODO Auto-generated constructor stub
	}

	public int getJob_Id() {
		return job_Id;
	}

	public void setJob_Id(int job_Id) {
		this.job_Id = job_Id;
		try {
			if(String.valueOf(this.job_Id).length()>6)
				throw new MyException("Job id must be less then 6");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public String getIssues() {
		return issues;
	}

	public void setIssues(String issues) {
		this.issues = issues;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getDate_Of_Service() {
		return date_Of_Service;
	}

	public void setDate_Of_Service(String date_Of_Service) {
		this.date_Of_Service = date_Of_Service;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public long getVehicle_id() {
		return vehicle_id;
	}
	public void setVehicle_id(Vehicle v) {
		this.vehicle_id = v.getReg_No();
	}
    
    
    
}
