package CollectionsFremework;

import java.util.*;
public class Vectorpractice {

	public static void main(String[] args) {
		// size - no of elements present in list
		//capacity- Array capacity
		
		Vector v1 =new Vector();//object creation
		v1.add("vasu");// add meaning one element add in array list
		v1.add("varun Taj");
		v1.add(0,"naveen");
		
		Vector v2 =new Vector();
		v2.add("Suhasini");
		v2.add("Alakuntla");
		
		System.out.println(v1);
		/*
		 * for(int i=0; i<v2.size(); i++) { v1.add(v2.get(i)); }
		 */
	v1.addAll(0,v2);
		
		System.out.println(v1);
		   

	}

}
