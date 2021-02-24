package com.coforge.VehicleServiceCentre;


import java.sql.SQLException;
import java.util.Scanner;

import com.coforge.Service.BillServiceImpl;

import com.coforge.Service.CustomerServiceImpl;
import com.coforge.Service.InsuranceServiceImpl;
import com.coforge.Service.JobCardServiceImpl;
import com.coforge.Service.MechanicServiceImpl;
import com.coforge.Service.ServiceFaultServiceImpl;
import com.coforge.Service.ServiceServImpl;
import com.coforge.Service.VehicleServiceImpl;
import com.coforge.dao.BillDao;

import com.coforge.dao.CustomerDao;
import com.coforge.dao.InsuranceDao;
import com.coforge.dao.JobCardDao;
import com.coforge.dao.MechanicDao;
import com.coforge.dao.ServiceDao;
import com.coforge.dao.ServiceFaultDao;
import com.coforge.dao.VehicleDao;

public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	Scanner sc=new Scanner(System.in);
    	/*CustomerDao cd = new CustomerDao();
    	VehicleDao vd= new VehicleDao();
    	MechanicDao md = new MechanicDao();
    	JobCardDao jd = new JobCardDao();
    	ServiceDao sd = new ServiceDao();
    	ServiceFaultDao sfd = new ServiceFaultDao();
    	InsuranceDao id = new InsuranceDao();
    	BillDao bd = new BillDao();*/
    	
    	/*cd.add();
    	vd.add(cd);
    	md.add();
    	jd.add(vd);
 		sd.add(md,jd);
    	sfd.add(sd);
    	id.add(vd);
    	bd.add(id,sd);
 	
    	cd.display();
    	vd.display(cd);
    	md.display();
    	jd.display(vd);
    	sd.display(md,jd);
    	sfd.display(sd);
    	id.display(vd);
    	bd.display(id,sd);*/
    
    CustomerServiceImpl csi=new CustomerServiceImpl();
   VehicleServiceImpl vsi=new VehicleServiceImpl();
    
    MechanicServiceImpl msi=new MechanicServiceImpl();
    ServiceServImpl ssi=new ServiceServImpl();
    
    ServiceFaultServiceImpl sfsi=new ServiceFaultServiceImpl();
    JobCardServiceImpl jcsi=new JobCardServiceImpl();
    
    InsuranceServiceImpl isi=new InsuranceServiceImpl();
    BillServiceImpl bsi=new BillServiceImpl();
   //6 csi.addCust();
  //  
   /* bsi.addBill(ssi, isi);
    */;
   /* vsi.addVehicle(csi);
    msi.addMech();
    jcsi.addJobCard(vsi);
    ssi.addService(msi,jcsi);
    sfsi.addServiceFault(ssi);
    isi.addInsurance(vsi);
  bsi.addBill(ssi,isi); 
  csi.displayCust();
  
    
    vsi.dispVehicle();
    msi.dispMech();
    sfsi.dispSericeFault();
    jcsi.dispJobCard();
    isi.dispInsurance();
    bsi.dispBill();
    */
   /* csi.insert();
    csi.displayAllCustomer();
    csi.displayByCustId();
    csi.updateCustomer();
    csi.deleteCustomer();*/
  //  msi.addMech();
 // vsi.addVehicle(csi);
  // vsi.displayAllVehicle();
  // vsi.displayVehicleByRegNo();
    //vsi.updateVehicleDetails();
   /* vsi.deleteVehicleDetails();*/
    
    boolean flag= true;
   	while(flag) {
   		System.out.println("Enter\n1-->Add Customer"
       			+ "\n2-->Add Mechanic"
       			+ "\n3-->Add Vehicle"
       			+ "\n4-->Add JobCard"
       			+ "\n5-->Add Service"
       			+ "\n6-->Add Service faault "
       			+ "\n7-->Add Insurance"
       			+ "\n8-->Add Bill"
       			+ "\n--> Any other number to exit !!");
       	
   		switch (sc.nextInt()) {
   		case 1:
   			csi.insert();
   			break;
   		case 2:
   			msi.InsertMecahnic();
   			break;
   		case 3:
   			vsi.insertVehicleDetails(csi);
   			break;
   		case 4:
   			jcsi.insertJobCardDetails(vsi);
   			break;
   		case 5:
   			ssi.insertServiceDetails(msi, jcsi);
   			break;
   		case 6:
   			sfsi.insertServiceFaultDetails(ssi);
   			break;
   		case 7:
   		isi.insertInsuranceDetails(vsi);
   			break;
   		case 8:
   			bsi.insertBillDetails(ssi, isi);
   			break;
   		default:
   			flag=false;
   			break;
   		}
   	}
   		boolean flag1= true;
   	   	while(flag1) {
   	   		System.out.println("Enter\n1-->Retreive Customer"
   	       			+ "\n2-->Retreive Mechanic"
   	       			+ "\n3-->Retreive Vehicle"
   	       			+ "\n4-->Retreive JobCard"
   	       			+ "\n5-->Retreive Service"
   	       			+ "\n6-->Retreive Service faault "
   	       			+ "\n7-->Retreive Insurance"
   	       			+ "\n8-->Retreive Bill"
   	       			+ "\n--> Retreive other number to exit !!");
   	       	
   	   		switch (sc.nextInt()) {
   	   		case 1:
   	   			csi.displayAllCustomer();
   	   			break;
   	   		case 2:
   	   			msi.displayAllMechanics();
   	   			break;
   	   		case 3:
   	   			vsi.displayAllVehicle();
   	   			break;
   	   		case 4:
   	   			jcsi.displayAllJobCard();
   	   			break;
   	   		case 5:
   	   			ssi.displayAllServiceDetails();
   	   			break;
   	   		case 6:
   	   			sfsi.displayAllServiceFaultDetails();
   	   			break;
   	   		case 7:
   	   		isi.displayAllInsurance();
   	   			break;
   	   		case 8:
   	   			bsi.displayAllBills();
   	   			break;
   	   		default:
   	   			flag1=false;
   	   			break;
   	   		}
   	   	}
   	   	boolean flag2= true;
   	   	while(flag2) {
   	   		System.out.println("Enter\n1-->Reterive by id Customer"
   	       			+ "\n2-->Reterive by id Mechanic"
   	       			+ "\n3-->Reterive by id Vehicle"
   	       			+ "\n4-->Reterive by id JobCard"
   	       			+ "\n5-->Reterive by id Service"
   	       			+ "\n6-->Reterive by id Service faault "
   	       			+ "\n7-->Reterive by id Insurance"
   	       			+ "\n8-->Reterive by id Bill"
   	       			+ "\n--> Any other number to exit !!");
   	       	
   	   		switch (sc.nextInt()) {
   	   		case 1:
   	   			csi.displayByCustId();
   	   			break;
   	   		case 2:
   	   			msi.displayMechanicById();
   	   			break;
   	   		case 3:
   	   			vsi.displayVehicleByRegNo();
   	   			break;
   	   		case 4:
   	   			jcsi.displayJobByJobId();
   	   			break;
   	   		case 5:
   	   			ssi.displayServiceByServiceId();
   	   			break;
   	   		case 6:
   	   			sfsi.displayServicefaultByServicefaultId();
   	   			break;
   	   		case 7:
   	   		isi.displayInsuranceByInsuranceNo();
   	   			break;
   	   		case 8:
   	   			bsi.displayBillByBillId();
   	   			break;
   	   		default:
   	   			flag2=false;
   	   			break;
   	   		}
   	   	}
   	   	boolean flag3= true;
   	   	while(flag3) {
   	   		System.out.println("Enter\n1-->Update Customer"
   	       			+ "\n2-->Update Mechanic"
   	       			+ "\n3-->Update Vehicle"
   	       			+ "\n4-->Update  JobCard"
   	       			+ "\n5-->Update  Service"
   	       			+ "\n6-->Update  Service faault "
   	       			+ "\n7-->Update  Insurance"
   	       			+ "\n8-->Update  Bill"
   	       			+ "\n--> Any other number to exit !!");
   	       	
   	   		switch (sc.nextInt()) {
   	   		case 1:
   	   			csi.updateCustomer();
   	   			break;
   	   		case 2:
   	   			msi.updateMechanic();
   	   			break;
   	   		case 3:
   	   			vsi.updateVehicleDetails();
   	   			break;
   	   		case 4:
   	   			jcsi.updateJobCardDetails();
   	   			break;
   	   		case 5:
   	   			ssi.updateServiceDetails();
   	   			break;
   	   		case 6:
   	   			sfsi.updateServiceFaultDetails();
   	   			break;
   	   		case 7:
   	   		isi.updateInsuranceDetails();
   	   			break;
   	   		case 8:
   	   			bsi.updateBillDetails();
   	   			break;
   	   		default:
   	   			flag3=false;
   	   			break;
   	   		}
   	   	}
   	 	boolean flag4= true;
   	   	while(flag4) {
   	   		System.out.println("Enter\n1-->Delete Customer"
   	       			+ "\n2-->Delete  Mechanic"
   	       			+ "\n3-->Delete  Vehicle"
   	       			+ "\n4-->Delete   JobCard"
   	       			+ "\n5-->Delete   Service"
   	       			+ "\n6-->Delete   Service faault "
   	       			+ "\n7-->Delete   Insurance"
   	       			+ "\n8-->Delete   Bill"
   	       			+ "\n--> Any other number to exit !!");
   	       	
   	   		switch (sc.nextInt()) {
   	   		case 1:
   	   			csi.deleteCustomer();
   	   			break;
   	   		case 2:
   	   			msi.deleteMechanic();
   	   			break;
   	   		case 3:
   	   			vsi.deleteVehicleDetails();
   	   			break;
   	   		case 4:
   	   			jcsi.deleteJobCardDetails();
   	   			break;
   	   		case 5:
   	   			ssi.deleteServiceDetails();
   	   			break;
   	   		case 6:
   	   			sfsi.deleteServiceFaultDetails();
   	   			break;
   	   		case 7:
   	   		isi.deleteInsuranceDetails();
   	   			break;
   	   		case 8:
   	   			bsi.deleteBillDetails();
   	   			break;
   	   		default:
   	   			flag4=false;
   	   			break;
   	   		}
   	   	}
    }
    }
       