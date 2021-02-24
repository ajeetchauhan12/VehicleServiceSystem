package com.coforge.Service;

import java.sql.SQLException;

import com.coforge.bean.Mechanic;

public interface MechanicService {
/*public void addMech() throws SQLException;
public void dispMech() throws SQLException;*/
	public  void InsertMecahnic() throws SQLException;
	public void displayAllMechanics() throws SQLException;
	public  void displayMechanicById() throws SQLException;
	public  void updateMechanic() throws SQLException;
	public  void deleteMechanic() throws SQLException;
public Mechanic getMechanic();
}
