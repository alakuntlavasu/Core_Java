package CollectionsFremework;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList li=new LinkedList<>();
		li.add("vasu");
		li.add(23.5);
		li.add(true);
		li.add(null);
		li.add(20);
		li.add("vasu");
		
		System.out.println(li);
		
		System.out.println(li.size());// size 6
		
		// remove the object
		
		li.remove(4);// indexing
		System.out.println(li);
		
		li.remove(23.5); // directly object
		System.out.println(li);

	}

}
