package icici.car.loans;

public class Wrapperclassdemo {

	public static void main(String[] args) {
		/*
		  byte     --->Byte
		  short    --->Short
		  int      --->Integer
		  long     --->Long
		  float    --->Float
		  double   --->Double
		  boolean  --->Boolean
		  char     --->Character  
		 */
		int x = 10;
		System.out.println(x);
		Integer y = Integer.valueOf(x);
		//Integer y = x; //auto boxing
		System.out.println(y);
		

	}

}
