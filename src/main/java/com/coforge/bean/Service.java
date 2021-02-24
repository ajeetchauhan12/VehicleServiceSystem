package com.coforge.bean;

import com.coforge.Exception.MyException;

public class Service {
	
	private int service_Id;
	private String service_Type;
	private String parts;
	private Mechanic mechanic;
	private JobCard job;
	private int mechanic_id;
	private int JobCard_id;
	
	
	public Service(int service_Id, String service_Type, String parts, Mechanic mechanic, JobCard job, int mechanic_id,
			int jobCard_id) {
	
		this.service_Id = service_Id;
		this.service_Type = service_Type;
		this.parts = parts;
		this.mechanic = mechanic;
		this.job = job;
		this.mechanic_id = mechanic_id;
		JobCard_id = jobCard_id;
	}

	public Service() {
		// TODO Auto-generated constructor stub
	}

	public int getService_Id() {
		return service_Id;
	}

	public void setService_Id(int service_Id) {
		this.service_Id = service_Id;
		try {
			if(String.valueOf(this.service_Id).length()>6)
				throw new MyException("Service id must be less then 6");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public String getService_Type() {
		return service_Type;
	}

	public void setService_Type(String service_Type) {
		this.service_Type = service_Type;
	}

	public String getParts() {
		return parts;
	}

	public void setParts(String parts) {
		this.parts = parts;
	}

	public Mechanic getMechanic() {
		return mechanic;
	}

	public void setMechanic(Mechanic mechanic) {
		this.mechanic = mechanic;
	}

	public JobCard getJob() {
		return job;
	}

	public void setJob(JobCard job) {
		this.job = job;
	}

	public int getMechanic_id() {
		return mechanic_id;
	}

	public void setMechanic_id(Mechanic mechanic) {
		this.mechanic_id = mechanic.getMechanic_Id();
	}

	public int getJobCard_id() {
		return JobCard_id;
	}

	public void setJobCard_id(JobCard jc) {
		JobCard_id = jc.getJob_Id();
	}
	
	
	

}
