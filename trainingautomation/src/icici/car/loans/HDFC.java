package icici.car.loans;

public class HDFC implements Rbi {

	public static void main(String[] args) 
	{
	   HDFC h = new HDFC();
	   h.withdrawl();
	   h.depoist();

	}

	@Override
	public void withdrawl() {
		System.out.println("i am overriden the Withdrawl");
		
	}

	@Override
	public void depoist() {
		System.out.println("i am overriden the Depoist");
		
	}

}
