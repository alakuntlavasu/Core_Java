package exception_Handaling;

public class Test {

	public static void main(String[] args) {
		 System.out.println("program start");
		 int fnumber=8;
		 int snumber=0;
		 int result=0;
		 
		   try {
			   result=fnumber/snumber;
	        }
		   
		   catch(ArithmeticException e) {
		   System.out.println(e.toString());
			   
		   }
		 finally {
			 System.out.println("hello");
		 }
		  
		 System.out.println("output is:"+result);
		 System.out.println("Alakuntla Vasu");
		 
		 System.out.println("program excution end");

	}

}
