package CollectionsFremework;

import java.util.HashSet;

public class HashSetDemo4 {

	public static void main(String[] args) {
	
		// Union intersection
		
		HashSet<Integer> set1=new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		;
		
		System.out.println("Haset 1:"+set1);//[1,2,3,4,5]
		
		
		HashSet<Integer> set2=new HashSet<>();
		
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
	
	System.out.println("Haset 2:"+set2);//[3,4,5]
		
		// Union
	    // it will find the uniqic values both two Hashsets
	
	   set1.addAll(set2);
	   
	   System.out.println("Union:"+set1);// [1, 2, 3, 4, 5]
	   
	   //  intersection
	   
	   set1.retainAll(set2);
	   
	   System.out.println("intersection:"+set1);
	}

}
