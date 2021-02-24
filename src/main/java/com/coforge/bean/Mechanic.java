package com.coforge.bean;

public class Mechanic {
	
	private int mechanic_Id; 
	private String mechanic_Name;
	private String mechanic_Address;
	private long mechanic_Mob ;
	private String mechanic_DOB ;

	public Mechanic(int mechanic_Id, String mechanic_Name, String mechanic_Address, long mechanic_Mob,
			String mechanic_DOB) {
	
		this.mechanic_Id = mechanic_Id;
		this.mechanic_Name = mechanic_Name;
		this.mechanic_Address = mechanic_Address;
		this.mechanic_Mob = mechanic_Mob;
		this.mechanic_DOB = mechanic_DOB;
	}
	public Mechanic() {
		// TODO Auto-generated constructor stub
	}

	public int getMechanic_Id() {
		return mechanic_Id;
	}

	public void setMechanic_Id(int mechanic_Id) {
		this.mechanic_Id = mechanic_Id;
	}

	public String getMechanic_Name() {
		return mechanic_Name;
	}

	public void setMechanic_Name(String mechanic_Name) {
		this.mechanic_Name = mechanic_Name;
	}

	public String getMechanic_Address() {
		return mechanic_Address;
	}

	public void setMechanic_Address(String mechanic_Address) {
		this.mechanic_Address = mechanic_Address;
	}

	public long getMechanic_Mob() {
		return mechanic_Mob;
	}

	public void setMechanic_Mob(long mechanic_Mob) {
		this.mechanic_Mob = mechanic_Mob;
	}

	public String getMechanic_DOB() {
		return mechanic_DOB;
	}

	public void setMechanic_DOB(String mechanic_DOB) {
		this.mechanic_DOB = mechanic_DOB;
	}
	
	
}
