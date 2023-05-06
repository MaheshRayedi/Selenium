package icici.car.loans;

public class ICICI implements Rbi
{
	public static void main(String[] args) 
	{
		ICICI i = new ICICI();
		i.depoist();
		i.withdrawl();
	}

	@Override
	public void withdrawl() {
		System.out.println("i am overriden withdrawl ICICI");
		
	}

	@Override
	public void depoist() {
		System.out.println("i am overriden depoist in ICICI");
		
	}
	

	

	
}
