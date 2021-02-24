package com.coforge.Service;

import java.sql.SQLException;

import com.coforge.bean.Insurance;

public interface InsuranceService {
	/*public void addInsurance( VehicleServiceImpl vsi);
	public void dispInsurance();*/
	public void insertInsuranceDetails(VehicleServiceImpl vsi) throws SQLException;
	public void displayAllInsurance() throws SQLException;
	public void displayInsuranceByInsuranceNo() throws SQLException;
	public void updateInsuranceDetails() throws SQLException;
	public void deleteInsuranceDetails() throws SQLException;
	public Insurance getInsurance();

}
