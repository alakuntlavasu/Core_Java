package CollectionsFremework;

import java.util.HashSet;

public class HashsetDemo3 {

	public static void main(String[] args) {
	
		HashSet<Integer> evennum=new HashSet<>();
		
		evennum.add(2);
		evennum.add(4);
		evennum.add(6);
		evennum.add(8);
		
		System.out.println(evennum);// [2,4,6,8]
		
		
		// addAll 
		HashSet<Integer> numbers=new HashSet<>();
		
		numbers.addAll(evennum);
		numbers.add(10);
		
		System.out.println(numbers);
		
		// scaning All objects
		for(Integer h:numbers) 
		{
			System.out.println(h);
		}
		
		
	}

}
