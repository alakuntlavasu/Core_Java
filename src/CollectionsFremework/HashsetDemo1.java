package CollectionsFremework;

import java.util.*;

public class HashsetDemo1 {

	public static void main(String[] args) {
		
		List<Integer>numberDevisible5=new ArrayList<Integer>();
		
		numberDevisible5.add(5);
		numberDevisible5.add(10);
		numberDevisible5.add(15);
		numberDevisible5.add(20);
		numberDevisible5.add(25);
		
		List<Integer>numberDevisible3=new ArrayList<>();
		
		
		numberDevisible3.add(3);
		numberDevisible3.add(6);
		numberDevisible3.add(9);
		numberDevisible3.add(12);
		numberDevisible3.add(15);
		
		
		// Creating a HashSet from another collection (ArrayList)
		Set<Integer>numberDevisible5and3=new HashSet<>(numberDevisible5);
		
		//Adding all the elements from an existing collection to a HashSet
		numberDevisible5and3.addAll(numberDevisible3);
		
		System.out.println(numberDevisible5and3);
		

	}

}
