package icici.car.loans;

public class Typecastingdemo {

	public static void main(String[] args) 
	{
		//byte, short, int, long,float, double, boolean, char
		// 1-Liter Bottle  --->500 ml  --->there is no risk  --->widenning
		// 1-Litre Bottle  --->1.5 Liter  --->There is a risk (overflow)--->Narrowing
		double x = 10.7;
		System.out.println(x);
		int y = (int) x;
		System.out.println(y);
		
		int a = 65;
		System.out.println(a);
		char b = (char) a;
		System.out.println(b);
		
		
		

	}

}
