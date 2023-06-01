package java1_8features_functionalinterfaces;

interface Cab4{
	public void bookedCab(String source,String destination);
}
		
public class Test3 {

	public static void main(String[] args) {
		
		// one way Lambda expression
		
 //		Cab4 c5=(String source,String destination)->System.out.println("Ola cab is booked from "+ source+ " To " +destination);
		
		// 2 way without datatype Lambda Expression
		
		Cab4 c5=( source, destination)->System.out.println("Ola cab is booked from "+ source+ " To " +destination);
         c5.bookedCab("chinnai", "madanapalli");
	}

}
