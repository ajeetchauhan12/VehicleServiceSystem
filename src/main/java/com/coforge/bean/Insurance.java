package com.coforge.bean;

public class Insurance {
	
	private int insurance_No ;
    private String insurance_Date;
    private int insurance_Duration ;
    private double insurance_Amount;
    private Vehicle vehicle;
    private long reg_no;
	
    public Insurance(long reg_no,int insurance_No, String insurance_Date, int insurance_Duration, double insurance_Amount,
			Vehicle vehicle) {
		this.reg_no=reg_no;
		this.insurance_No = insurance_No;
		this.insurance_Date = insurance_Date;
		this.insurance_Duration = insurance_Duration;
		this.insurance_Amount = insurance_Amount;
		this.vehicle = vehicle;
	}
    public Insurance() {
		// TODO Auto-generated constructor stub
	}
	
    public int getInsurance_No() {
		return insurance_No;
	}
	public void setInsurance_No(int insurance_No) {
		this.insurance_No = insurance_No;
	}
	public String getInsurance_Date() {
		return insurance_Date;
	}
	public void setInsurance_Date(String insurance_Date) {
		this.insurance_Date = insurance_Date;
	}
	public int getInsurance_Duration() {
		return insurance_Duration;
	}
	public void setInsurance_Duration(int insurance_Duration) {
		this.insurance_Duration = insurance_Duration;
	}
	public double getInsurance_Amount() {
		return insurance_Amount;
	}
	public void setInsurance_Amount(double insurance_Amount) {
		this.insurance_Amount = insurance_Amount;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	

	public long getReg_no() {
		return reg_no;
	}
	public void setReg_no(Vehicle v) {
		this.reg_no = v.getReg_No();
	}
	@Override
	public String toString() {
		return "insurance_No :" + insurance_No + "\n insurance_Date :" + insurance_Date
				+ "\n insurance_Duration :" + insurance_Duration + "\n insurance_Amount :" + insurance_Amount ;
	}
	
    
}
