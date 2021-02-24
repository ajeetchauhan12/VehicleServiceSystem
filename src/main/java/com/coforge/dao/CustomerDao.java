package com.coforge.dao;


import java.sql.SQLException;
import java.util.Scanner;


import com.coforge.bean.Customer;

public interface CustomerDao {

public void insert() throws SQLException;
public void displayAllCustomer() throws SQLException;
public void displayByCustId() throws SQLException;
public void updateCustomer() throws SQLException;
public void deleteCustomer() throws SQLException ;
//public void display();
	
public Customer getCust();
}
