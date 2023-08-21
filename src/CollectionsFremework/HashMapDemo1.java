package CollectionsFremework;

import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) {
		
		HashMap emp=new HashMap();
		
		//HashMap<Integer, String> emp= new HashMap<>();
		
		emp.put(101, "vasu");
		emp.put(102, "varun");
		emp.put(105, "naveen");
		emp.put(108, "Rajesh");
		emp.put(107, "jaggu");
		emp.put(103, "suhasini");
		
		System.out.println(emp);
		
		System.out.println(emp.get(107));// get the the value with healp of key
		
		   emp.remove(108);    // remove from pair in hashmap
		System.out.println(emp);
		
		System.out.println(emp.containsKey(102)); // contains key means present in the set check the key or not 
	System.out.println(	emp.containsKey(109));
	
	System.out.println(emp.containsValue("varun"));
	System.out.println(emp.containsValue("madu"));
	
	System.out.println(emp.isEmpty()); //check the given set empty or not 
	
	System.out.println(emp.keySet());// it will return all keys as given set [101, 102, 103, 105, 107]
	
	
	
	System.out.println(emp.values());//it will return all values as given set [vasu, varun, suhasini, naveen, jaggu]
	
	System.out.println(emp.entrySet()); //it will return all values as given set [101=vasu, 102=varun, 103=suhasini, 105=naveen, 107=jaggu]

	}

}
