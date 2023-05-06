package icici.car.loans;

public class Datatypes1 
{
	//integer types
	byte b; //1 byte
	short s; //2 bytes
	int i;  //4 bytes
	long l;  //8 bytes
	//Non integer data types
	float f; //4 bytes
	double d;  //8 bytes
	
	boolean bb;
	char ch; //2 bytes
	
	String name;
	static String cname;
	static float roi;
	
	
	
	
	
	

	public static void main(String[] args) 
	{
		Datatypes1 m = new Datatypes1();
		System.out.println("Byte :"+m.b);
		System.out.println("Short :"+m.s);
		System.out.println("Int :"+m.i);
		System.out.println("Long :"+m.l);
		System.out.println("Float :"+m.f);
		System.out.println("Double :"+m.d);
		System.out.println("Boolean :"+m.bb);
		System.out.println("Char :"+m.ch);
		System.out.println("String :"+m.name);
		System.out.println("Cname :"+Datatypes1.cname);
		System.out.println("ROI :"+Datatypes1.roi);
		int x=100;
		int y=200;
		System.out.println(x+y);
	}

}
