package exception_Handaling;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("program start");
		int fnum=8;
		int snum=0;
		int result=0;
		try {
			result=fnum/snum;
		}
		catch(ArithmeticException e) {
			System.out.println(e.toString());
		}
		System.out.println("output is:"+result);
		System.out.println("good morning");
		System.out.println("Good afternoon");
		System.out.println("Good evining");
		System.out.println("Alakuntla Naveen");
		System.out.println("Alakuntla vasu");
		System.out.println("Alakuntla Naveen");
		System.out.println("Varun Taj");

	}

}
