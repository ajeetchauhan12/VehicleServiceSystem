package com.coforge.Service;

import java.sql.SQLException;

import com.coforge.bean.Mechanic;
import com.coforge.dao.MechanicDao;
import com.coforge.dao.MechanicDaoImpl;

public class MechanicServiceImpl implements MechanicService {
	MechanicDao md=null;
	public MechanicServiceImpl() {
		// TODO Auto-generated constructor stub
	md=new MechanicDaoImpl();
	}
	
	public Mechanic getMechanic() {
		return md.getMechanic();
	}
	public void InsertMecahnic() throws SQLException {
		// TODO Auto-generated method stub
		md.InsertMecahnic();
		
	}
	public void displayAllMechanics() throws SQLException {
		// TODO Auto-generated method stub
		md.displayAllMechanics();
	}
	public void displayMechanicById() throws SQLException {
		// TODO Auto-generated method stub
		md.displayMechanicById();
	}
	public void updateMechanic() throws SQLException {
		// TODO Auto-generated method stub
		md.updateMechanic();
	}
	public void deleteMechanic() throws SQLException {
		// TODO Auto-generated method stub
		md.deleteMechanic();
	}

}
