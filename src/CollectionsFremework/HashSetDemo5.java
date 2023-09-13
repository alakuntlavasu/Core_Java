package CollectionsFremework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo5 {

	public static void main(String[] args) {
	
		HashSet hs=new HashSet<>();
		
		hs.add('A');
		hs.add(6);
		hs.add("Welcome");
		hs.add(null);
		hs.add(20.5);
		hs.add(true);
		
		System.out.println(hs);
		
	// remove	
	hs.remove(20.5);
	System.out.println(hs);
	
	// contains
	System.out.println(hs.contains("Welcome"));
	System.out.println(hs.contains('A'));
	
//	System.out.println(hs.isEmpty());
	
	// Reading objects / elements Hashset using forEach loop
	
	for(Object v:hs) 
	{
		System.out.println(v);
	}
		
//	
//	// Reading Elements /objects Hashset using Iterator
	
	  Iterator it=hs.iterator();
	  
	  while(it.hasNext()) 
	  {
		  System.out.println(it.next());
	  }

	}

}
