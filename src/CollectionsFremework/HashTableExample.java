package CollectionsFremework;

import java.util.Hashtable;

public class HashTableExample {

	public static void main(String[] args) {
		
		
		//Hashtable t=new Hashtable<>();// Hash table internal capacity is 11 load factor is 0.75
		
		//Hashtable t=new Hashtable(intial capacity);// create hashtable object with some capacity
		
		//Hashtable t=new Hashtable(intial capacity, fill ratio/load factor);
		
		Hashtable<Integer, String> t=new Hashtable<>();
		t.put(1, "Rohith");
		t.put(2, "Kohli");
		t.put(3, "Rahul");
		t.put(4, "Dhoni");
//		t.put(null, "vasu");// null values aither key or values not allowed in the Hashtable it will throw the null pointeer Exception
		t.put(null, "varun");
		
		
		System.out.println(t);
		
		
//		System.out.println(t.get(3));
	}

}
