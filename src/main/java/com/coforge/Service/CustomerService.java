package com.coforge.Service;

import java.sql.SQLException;

import com.coforge.bean.Customer;

public interface CustomerService {
/*	public void addCust() throws SQLException;
	public void displayCust();*/
	public void insert() throws SQLException;
	public void displayAllCustomer() throws SQLException;
	public void displayByCustId() throws SQLException;
	public void updateCustomer() throws SQLException;
	public void deleteCustomer() throws SQLException ;
	public Customer getCust();

}
