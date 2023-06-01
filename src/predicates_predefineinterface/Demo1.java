package predicates_predefineinterface;

import java.util.function.Predicate;

public class Demo1 {

	public static void main(String[] args) {
		
		// predicate interface and Lambda Expression
		Predicate<Integer> p=i->(i>10);// which is single argument passing that is i and condition p is reference of predicate interface 
      System.out.println(p.test(25));
      System.out.println(p.test(5));
	}

}
// i am invoking the Lambda Expresssion by using test() method

// predicate interface its always passing one argument or one parameter and returen boolen value
// predicate interface use only if you have conditional checks in your program...
