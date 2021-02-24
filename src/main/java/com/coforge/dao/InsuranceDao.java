package com.coforge.dao;

import java.sql.SQLException;

import com.coforge.Service.VehicleServiceImpl;
import com.coforge.bean.Insurance;

public interface InsuranceDao {
	/*public void add( VehicleServiceImpl vsi);
	public void display();*/
	public void insertInsuranceDetails(VehicleServiceImpl vsi) throws SQLException;
	public void displayAllInsurance() throws SQLException;
	public void displayInsuranceByInsuranceNo() throws SQLException;
	public void updateInsuranceDetails() throws SQLException;
	public void deleteInsuranceDetails() throws SQLException;
	public Insurance getInsurance();
	
}
