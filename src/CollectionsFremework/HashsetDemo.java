package CollectionsFremework;

import java.util.HashSet;

public class HashsetDemo {

	public static void main(String[] args) {
		HashSet<Integer> lh=new HashSet<>();
		lh.add(56);
		lh.add(45);
		lh.add(36);
		lh.add(45);
		lh.add(25);
		lh.add(null);
		lh.add(98);
		lh.add(78);
		
		//  Adding duplicate elements will be ignored
		System.out.println(lh.add(98));// false
	
		System.out.println(lh);// [null, 98, 36, 56, 25, 45, 78]
		
		
		

	}

}
