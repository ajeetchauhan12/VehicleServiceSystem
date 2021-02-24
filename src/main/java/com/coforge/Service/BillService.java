package com.coforge.Service;

import java.sql.SQLException;

public interface BillService {
/*public void addBill( ServiceServImpl ssi,InsuranceServiceImpl isi);
public void dispBill();*/
	public void insertBillDetails(ServiceServImpl ssi,InsuranceServiceImpl isi) throws SQLException;
	 public void displayAllBills() throws SQLException;
	 public void displayBillByBillId() throws SQLException;
	 public void updateBillDetails() throws SQLException;
	 public void deleteBillDetails() throws SQLException;
}
