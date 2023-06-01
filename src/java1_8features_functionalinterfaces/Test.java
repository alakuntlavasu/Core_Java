package java1_8features_functionalinterfaces;

@FunctionalInterface
interface Cab{
	public void bookCab();
	
	default void m3() {
		System.out.println("ola cab is booked..... ");
	}
}

class Ola implements Cab{

	
	public void bookCab() {
		System.out.println("ola cab book must and shoud OTP submited");
		
	}
	
}
public class Test {

	public static void main(String[] args) {
		Ola cab=new Ola();
           cab.bookCab();
           cab.m3();
	}

}
