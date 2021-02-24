package com.coforge.dao;

import java.sql.SQLException;
import java.util.Scanner;


import com.coforge.bean.Mechanic;

public interface MechanicDao {
	/*public void add() throws SQLException;
	public void display() throws SQLException;*/
	public  void InsertMecahnic() throws SQLException;
	public void displayAllMechanics() throws SQLException;
	public  void displayMechanicById() throws SQLException;
	public  void updateMechanic() throws SQLException;
	public  void deleteMechanic() throws SQLException;
	public Mechanic getMechanic();
}
