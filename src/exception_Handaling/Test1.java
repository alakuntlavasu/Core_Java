package exception_Handaling;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("program start");
		int fnum=8;
		int snum=0;
		int result=0;
		try {
			result=fnum/snum;
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			throw e;
		}
		finally{
			System.out.println("program finally");//finally block always final
		}
		System.out.println("output is:"+result);
		System.out.println("program end");

	}

}
