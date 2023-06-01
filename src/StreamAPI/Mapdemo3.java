package StreamAPI;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class Mapdemo3 {

	public static void main(String[] args) {
		List<Integer> numberList=Arrays.asList(2,7,8,11,5);
         
		
		//without stream
		
		/*for(int num:numberList) {
			System.out.println(num*4);
			System.out.println(num+2);
		}*/
		
		// with stream
		
		List<Integer> num=numberList.stream().map(n->n*4).collect(Collectors.toList());
		
		System.out.println(num);
	}

}
