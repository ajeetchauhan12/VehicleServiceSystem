package com.coforge.Service;

import java.sql.SQLException;

import com.coforge.dao.BillDao;
import com.coforge.dao.BilldaoImpl;

public class BillServiceImpl implements BillService {
private BillDao bd=null;
	public BillServiceImpl() {
		bd=new BilldaoImpl();
	// TODO Auto-generated constructor stub
}
	/*public void addBill( ServiceServImpl ssi,InsuranceServiceImpl isi) {
		// TODO Auto-generated method stub
		bd.add(ssi,isi);
	}

	public void dispBill() {
		// TODO Auto-generated method stub
		bd.display();
	}*/
	public void insertBillDetails(ServiceServImpl ssi, InsuranceServiceImpl isi) throws SQLException {
		// TODO Auto-generated method stub
		bd.insertBillDetails(ssi, isi);
		
	}
	public void displayAllBills() throws SQLException {
		// TODO Auto-generated method stub
		bd.displayAllBills();
	}
	public void displayBillByBillId() throws SQLException {
		// TODO Auto-generated method stub
		bd.displayBillByBillId();
	}
	public void updateBillDetails() throws SQLException {
		// TODO Auto-generated method stub
		bd.updateBillDetails();
	}
	public void deleteBillDetails() throws SQLException {
		// TODO Auto-generated method stub
		bd.deleteBillDetails();
	}

}
