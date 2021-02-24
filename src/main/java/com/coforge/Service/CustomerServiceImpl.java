package com.coforge.Service;

import java.sql.SQLException;

import com.coforge.bean.Customer;
import com.coforge.dao.CustomerDao;
import com.coforge.dao.CustomerDaoImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDao cd=null;
	public CustomerServiceImpl() {
		// TODO Auto-generated constructor stub
	cd=new CustomerDaoImpl();
	}
	/*public void addCust() throws SQLException {
		// TODO Auto-generated method stub
		cd.add();
		
	}

	public void displayCust() {
		// TODO Auto-generated method stub
		cd.display();
	}*/
	public void insert() throws SQLException{
		cd.insert();
	}
	public void displayAllCustomer() throws SQLException{
		cd.displayAllCustomer();
	}
	public void displayByCustId() throws SQLException{
		cd.displayByCustId();
	}
	public void updateCustomer() throws SQLException{
		cd.updateCustomer();
	}
	public void deleteCustomer() throws SQLException{
		cd.deleteCustomer();
	}
	public Customer getCust()
	{
		return cd.getCust();
	}

}
