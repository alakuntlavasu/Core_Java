package java1_8features_functionalinterfaces;
  
interface Cab5{
	public String bookedCab(String source,String destination);
}


 
/*class Ola5 implements Cab5{

	
	public String bookedCab(String source, String destination) {
		
		System.out.println("Ola cab is booked from "+ source+ " To " +destination);
		
		return ("price:5000 Rs");
	}
	
}*/


public class Test4 {

	public static void main(String[] args) {
		
		// Lambda expression
		Cab5 c6=(String source,String destination)->{System.out.println("Ola cab is booked from "+ source+ " To " +destination);
		
		return ("price:5000 Rs");};
	
		System.out.println(c6.bookedCab("Hyd", "Mumbai"));

	}

}
