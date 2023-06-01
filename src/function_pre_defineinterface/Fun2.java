package function_pre_defineinterface;

import java.util.function.Function;

public class Fun2 {

	public static void main(String[] args) {
		
		Function<String,Integer> fn=s->s.length();
		System.out.println(fn.apply("vasu"));
		System.out.println(fn.apply("varun Taj"));
		System.out.println(fn.apply("Naveen Kumar"));

	}

}
// 1 passing the String value and findout the length and returen the integer value 