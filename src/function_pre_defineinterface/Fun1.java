package function_pre_defineinterface;

import java.util.function.Function;

public class Fun1 {

	public static void main(String[] args) {
		
		Function<Integer,Integer> f=v->v*v;
		
		System.out.println(f.apply(5));
		System.out.println(f.apply(10));
		System.out.println(f.apply(6));

	}

}
