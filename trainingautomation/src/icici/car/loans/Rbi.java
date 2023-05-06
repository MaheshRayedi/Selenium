package icici.car.loans;

import org.checkerframework.checker.units.qual.h;

public interface Rbi {
//interface contains properties and behaviours.hiding the implemantation details just by explosing the service
	//names is called interface
	//we can create object in interface.
	int x=100;
	public void withdrawl();
	public void depoist();
	
	
	public static void main(String[] args) {
		//Rbi i = new Rbi();
		
		Rbi i ;
		i = new ICICI();
		 i.withdrawl();
		 i.depoist();
		i = new HDFC();
		  i.withdrawl();
		  i.depoist();
		
		
		
	}
}
