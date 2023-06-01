package java1_8features_functionalinterfaces;

@FunctionalInterface
interface Cab1{
	public void bookCab();
	
	default void m3() {
		System.out.println("vasu");
	}
}
public class Test1 {

	public static void main(String[] args) {
		// Lambda expression
      Cab1 v1=  ()-> System.out.println("ola cab is booked...");
      v1.bookCab();
      v1.m3();
	}

}
