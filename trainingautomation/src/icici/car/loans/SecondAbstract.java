package icici.car.loans;

public abstract class SecondAbstract {
	
	public abstract void m1();
	public abstract void m2();
	public abstract void m3();
	
	public void m4()
	{
		System.out.println("i am void m4");
	}
	class Test extends SecondAbstract
	{
		public void m1() {
			System.out.println("i am void m1");
			}

		@Override
		public void m2() {
			System.out.println("i am void m2");
			
		}

		@Override
		public void m3() {
			System.out.println("i am void m3");
			
		}
	}
	

	public static void main(String[] args) {
		
         Test t = new Test();
         t.m1();
         
        
	}

}
