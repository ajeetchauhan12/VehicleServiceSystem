package com.coforge.Service;

import java.sql.SQLException;

import com.coforge.bean.Vehicle;

public interface VehicleService {
/*public void addVehicle(CustomerServiceImpl csi) throws SQLException;
public void dispVehicle();*/
	public void insertVehicleDetails(CustomerServiceImpl csi) throws SQLException;
public void displayAllVehicle() throws SQLException;
public void displayVehicleByRegNo() throws SQLException;
public void updateVehicleDetails() throws SQLException;
public void deleteVehicleDetails() throws SQLException;
public Vehicle getVehicle();
}
