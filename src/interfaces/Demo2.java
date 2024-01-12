package interfaces;

	interface In1
	{
		final int a = 10;
		static void display()
		{
			System.out.println("hello");
			
		}
		void m1();
	}

	// A class that implements the interface.
	public class Demo2 implements In1
	{
		
		// Driver Code
		public static void main (String[] args)
		{
	    
			In1.display();
			
			Demo2 obj=new Demo2();
			obj.m1();
		}

		@Override
		public void m1() {
			// TODO Auto-generated method stub
			System.out.println(a+10);
		}
	}


