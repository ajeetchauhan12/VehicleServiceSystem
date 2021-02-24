package com.coforge.bean;

public class Vehicle implements Comparable<Vehicle>{

	private long reg_No; 
    private String model; 
    private long engine_No; 
    private long chasis_No; 
    private Customer cust;
    private int cust_id;
	
    public Vehicle(int cust_id,long reg_No, String model, long engine_No, long chasis_No, Customer cust) {
		this.cust_id=cust_id;
		this.reg_No = reg_No;
		this.model = model;
		this.engine_No = engine_No;
		this.chasis_No = chasis_No;
		this.cust = cust;
	}

	public Vehicle() {
	
	}

	public long getReg_No() {
		return reg_No;
	}

	public void setReg_No(long reg_No) {
		this.reg_No = reg_No;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public long getEngine_No() {
		return engine_No;
	}

	public void setEngine_No(long engine_No) {
		this.engine_No = engine_No;
	}

	public long getChasis_No() {
		return chasis_No;
	}

	public void setChasis_No(long chasis_No) {
		this.chasis_No = chasis_No;
	}

	public Customer getCusttomer() {
		return cust;
	}

	public void setCustomer(Customer cust) {
		this.cust = cust;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(Customer c) {
		this.cust_id = c.getCust_Id();
	}

	public int compareTo(Vehicle o) {
		// TODO Auto-generated method stub
		return (int) (this.reg_No-o.getReg_No());
	}
    
    
}
