package com.coforge.Service;

import java.sql.SQLException;

import com.coforge.bean.Vehicle;
import com.coforge.dao.VehicleDao;
import com.coforge.dao.VehicleDaoImpl;

public class VehicleServiceImpl implements VehicleService {
	VehicleDao vd=null;
public VehicleServiceImpl() {
	// TODO Auto-generated constructor stub
	vd=new VehicleDaoImpl();
}
public void insertVehicleDetails(CustomerServiceImpl csi) throws SQLException {
		// TODO Auto-generated method stub
	vd.insertVehicleDetails(csi);	
	}

	/*public void dispVehicle() {
		// TODO Auto-generated method stub
		vd.display();
	}*/
	public Vehicle getVehicle() {
		return vd.getVehicle();
	}
	public void displayAllVehicle() throws SQLException {
		// TODO Auto-generated method stub
		vd.displayAllVehicle();
		
	}
	public void displayVehicleByRegNo() throws SQLException {
		// TODO Auto-generated method stub
		vd.displayVehicleByRegNo();
		
	}
	public void updateVehicleDetails() throws SQLException {
		// TODO Auto-generated method stub
		vd.updateVehicleDetails();
		
	}
	public void deleteVehicleDetails() throws SQLException {
		// TODO Auto-generated method stub
		vd.deleteVehicleDetails();
	}
	

}
