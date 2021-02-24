package com.coforge.bean;

public class Bill implements Comparable<Bill> {
	
	private int bill_Id ;
	private double labour_Charges;
	private double service_Charges;
	private String bill_date;
	private Insurance insurance;
	private Service service;
	private int service_id;
	private int insurance_no;


	public Bill(int insurance_no,int service_id,int bill_Id, double labour_Charges, double service_Charges, String bill_date, Insurance insurance,
			Service service) {
		this.insurance_no=insurance_no;
		this.service_id=service_id;
		this.bill_Id = bill_Id;
		this.labour_Charges = labour_Charges;
		this.service_Charges = service_Charges;
		this.bill_date = bill_date;
		this.insurance = insurance;
		this.service = service;
	}
	public Bill() {
		// TODO Auto-generated constructor stub
	}

	public int getBill_Id() {
		return bill_Id;
	}

	public void setBill_Id(int bill_Id) {
		this.bill_Id = bill_Id;
	}

	public double getLabour_Charges() {
		return labour_Charges;
	}

	public void setLabour_Charges(double labour_Charges) {
		this.labour_Charges = labour_Charges;
	}

	public double getService_Charges() {
		return service_Charges;
	}

	public void setService_Charges(double service_Charges) {
		this.service_Charges = service_Charges;
	}

	public String getBill_date() {
		return bill_date;
	}

	public void setBill_date(String bill_date) {
		this.bill_date = bill_date;
	}

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance_No(Insurance insurance) {
		this.insurance= insurance;
	}

	public Service getService_Id() {
		return service;
	}

	public void setService_Id(Service service) {
		this.service= service;
	}
	
	

	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
	public int getService_id() {
		return service_id;
	}
	public void setService_id(Service s) {
		this.service_id = s.getService_Id();
	}
	public int getInsurance_no() {
		return insurance_no;
	}
	public void setInsurance_no(Insurance i) {
		this.insurance_no = i.getInsurance_No();
	}
	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}
	
	@Override
	public String toString() {
		return "Bill [bill_Id=" + bill_Id + ", labour_Charges=" + labour_Charges + ", service_Charges="
				+ service_Charges + ", bill_date=" + bill_date + ", insurance=" + insurance + ", service=" + service
				+ ", service_id=" + service_id + ", insurance_no=" + insurance_no + "]";
	}
	public int compareTo(Bill o) {
		// TODO Auto-generated method stub
		return this.bill_Id-o.getBill_Id();
	}



}
