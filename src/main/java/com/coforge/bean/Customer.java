package com.coforge.bean;



public class Customer implements Comparable<Customer> {
	private int cust_Id ;
	private String cust_Name ;
	private String cust_Address; 
	private long cust_Mob;
	private String cust_DOB;
	
	public Customer(int cust_Id, String cust_Name, String cust_Address, long cust_Mob, String cust_DOB) {
		super();
		this.cust_Id = cust_Id;
		this.cust_Name = cust_Name;
		this.cust_Address = cust_Address;
		this.cust_Mob = cust_Mob;
		this.cust_DOB = cust_DOB;
	}
	public Customer() {
	}
	public int getCust_Id() {
		return cust_Id;
	}
	
	@Override
	public String toString() {
		return "Customer [cust_Id=" + cust_Id + ", cust_Name=" + cust_Name + ", cust_Address=" + cust_Address
				+ ", cust_Mob=" + cust_Mob + ", cust_DOB=" + cust_DOB + "]";
	}
	
	public void setCust_Id(int cust_Id) {
		this.cust_Id = cust_Id;
		
	/*try {
		
		boolean t=false;
		do {
		if(String.valueOf(this.cust_Id).length()>6)
			throw new UserDefineException("user id must be less then 6");
	
		else 
			t=true;
		}while(t);
		}
	catch(Exception e)
	{
		System.out.println(e);
		
	}*/
	
		}
	public String getCust_Name() {
		return cust_Name;
	}
	public void setCust_Name(String cust_Name) {
		this.cust_Name = cust_Name;
	}
	public String getCust_Address() {
		return cust_Address;
	}
	public void setCust_Address(String cust_Address) {
		this.cust_Address = cust_Address;
	}
	public long getCust_Mob() {
		return cust_Mob;
	}
	public void setCust_Mob(long cust_Mob) {
		this.cust_Mob = cust_Mob;
	}
	public String getCust_DOB() {
		return cust_DOB;
	}
	public void setCust_DOB(String cust_DOB) {
		this.cust_DOB = cust_DOB;
	}
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return this.cust_Name.compareTo(o.getCust_Name());
	}
	
	
	
}
