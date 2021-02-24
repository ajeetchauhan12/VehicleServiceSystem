package com.coforge.Service;

import java.sql.SQLException;

import com.coforge.bean.Insurance;
import com.coforge.dao.InsuranceDao;
import com.coforge.dao.InsuranceDaoImpl;

public class InsuranceServiceImpl implements InsuranceService{
private InsuranceDao id=null;
	public InsuranceServiceImpl() {
		id=new InsuranceDaoImpl();
		
	// TODO Auto-generated constructor stub
}
	
	
	
	/*public void addInsurance( VehicleServiceImpl vsi) {
		// TODO Auto-generated method stub
		id.add(vsi);
	}

	public void dispInsurance() {
		// TODO Auto-generated method stub
		id.display();
	}*/
	





	public void insertInsuranceDetails(VehicleServiceImpl vsi) throws SQLException {
		// TODO Auto-generated method stub
		id.insertInsuranceDetails(vsi);
	}



	public void displayAllInsurance() throws SQLException {
		// TODO Auto-generated method stub
		id.displayAllInsurance();
	}



	public void displayInsuranceByInsuranceNo() throws SQLException {
		// TODO Auto-generated method stub
		id.displayInsuranceByInsuranceNo();
	}



	public void updateInsuranceDetails() throws SQLException {
		// TODO Auto-generated method stub
		id.updateInsuranceDetails();
	}



	public void deleteInsuranceDetails() throws SQLException {
		// TODO Auto-generated method stub
		id.deleteInsuranceDetails();
	}



	public Insurance getInsurance() {
		// TODO Auto-generated method stub
		return null;
	}
}
