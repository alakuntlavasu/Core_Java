package exception_Handaling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedExceptionEx {

	public static void main(String[] args) throws FileNotFoundException {
	
		PrintWriter pw=new PrintWriter("abc.txt");
		
		System.out.println("Hello vasu");

	}

}
