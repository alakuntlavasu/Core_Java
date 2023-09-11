package CollectionsFremework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo6 {

	public static void main(String[] args) {

    ArrayList<Integer> al2=new ArrayList<>(List.of(30,40,50,70,80,90));
    
    System.out.println(al2);
    
    
    // ietarator interface to read the data
    Iterator<Integer> it=al2.iterator();
    
    while(it.hasNext()) 
    {
       System.out.println(it.next());	
    }
    
    // List ietarator 
//    ListIterator<Integer>it1=al2.listIterator();
//    
//    while(it1.hasNext()) 
//    {
//    	System.out.println(it1.next());
//    }
    
    
    // List of for loop 
    for(ListIterator<Integer> it2=al2.listIterator();it2.hasNext();)  
    
    {
    	System.out.println(it2.next());
    }
    
    
	}

}
