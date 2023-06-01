package java1_8features_functionalinterfaces;

interface Cab2{
	void bookCab(String source, String destination);
}

class Ola1 implements Cab2{

	
	public void bookCab(String source, String destination) {
		System.out.println("Ola cab is booked from "+ source+ " To " +destination);
		
	}
	
}

public class Test2 {

	public static void main(String[] args) {
		
      Cab2 c3=new Ola1();
       c3.bookCab("Bangaloore","Madanapalli");
	}

}
