package icici.car.loans;

import java.io.FileInputStream;

public class First {
     //Data properties
	int a=10, b=20, result;
	//Behaviours
	public void add()
	{
		result = a+b;
		System.out.println("Add of A & B is :"+ result);
	}
	public void sub()
	{
		result = a-b;
		System.out.println("Sub of A & B is :"+ result);
	}

	
public static void main(String[] args) {
          System.out.println("Hello...");
        // First m = new First();
         // m.add();
        //  m.sub();
          new First().add();
          new First().sub();
          
         First m1 = new First();
         m1.add();
         m1.sub();
          
}
}
