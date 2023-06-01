package function_pre_defineinterface;

import java.util.function.Function;

/*
 *
 * Function chaining
 ----
 andThen()
 compose()
 */
public class Fun3 {

	public static void main(String[] args) {
		
	// Two functional  predefine interfaces	
		
    Function<Integer,Integer> f1=v->v*2;
//    Function<Integer,Integer> f2=v->v*v*v;
    Function<Integer,Integer> f3=v->v*5*v;
    
    //
//    System.out.println(f1.andThen(f2).apply(2));
    System.out.println(f1.andThen(f3).apply(2));
    
    System.out.println(f1.compose(f3).apply(2));
	}
	
	
    
}
// 1 what is Function Chaining ? 
//  * To combining in the Two functions that is called function chaining
//  * That is function chaining has Two methods 
//     *andTen()
//     *compose()
// 2 what is andThen() method ?
//  * when same passing value f1 and same value apply to the f2
// 3 what is compose() method ?
//  * when same passing value f2 and same value apply to the f1

