package com.coforge.bean;

public class ServiceFault {
	
	private int service_FaultId ;
	private String service_Fault_Type;
	private String service_Fault_Date;
	private Service service;
	private int service_id;
	
	public ServiceFault(int service_id,int service_FaultId, String service_Fault_Type, String service_Fault_Date, Service service) {
		this.service_id=service_id;
		this.service_FaultId = service_FaultId;
		this.service_Fault_Type = service_Fault_Type;
		this.service_Fault_Date = service_Fault_Date;
		this.service = service;
	}
public ServiceFault() {
	// TODO Auto-generated constructor stub
}
	public int getService_FaultId() {
		return service_FaultId;
	}

	public void setService_FaultId(int service_FaultId) {
		this.service_FaultId = service_FaultId;
	}

	public String getService_Fault_Type() {
		return service_Fault_Type;
	}

	public void setService_Fault_Type(String service_Fault_Type) {
		this.service_Fault_Type = service_Fault_Type;
	}

	public String getService_Fault_Date() {
		return service_Fault_Date;
	}

	public void setService_Fault_Date(String service_Fault_Date) {
		this.service_Fault_Date = service_Fault_Date;
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
		this.service_id =s.getService_Id();
	}
	@Override
	public String toString() {
		return "service_FaultId :" + service_FaultId + "\n service_Fault_Type :" + service_Fault_Type
				+ "\n service_Fault_Date :" + service_Fault_Date;
	}


}
