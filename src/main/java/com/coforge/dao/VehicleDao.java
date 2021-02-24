package com.coforge.dao;

import java.sql.SQLException;
import java.util.Scanner;

import com.coforge.Service.CustomerServiceImpl;
import com.coforge.bean.Customer;
import com.coforge.bean.Vehicle;

public interface VehicleDao {

	Customer c =new Customer();
	/*
	Scanner sc = new Scanner(System.in);
	private Vehicle v;*/
/*	public void add(CustomerServiceImpl csi) throws SQLException;*/
	public void insertVehicleDetails(CustomerServiceImpl csi) throws SQLException;
	public void displayAllVehicle() throws SQLException;
	 public void displayVehicleByRegNo() throws SQLException;
	 public void updateVehicleDetails() throws SQLException;
	 public void deleteVehicleDetails() throws SQLException;
	public Vehicle getVehicle();
}
