package CollectionsFremework;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashsetExample {

	
		public static void main(String[] args) {

			// creating new LinkedHasSetHashSet using default constructor
			
			Set<String> names = new LinkedHashSet<>();
			
			names.add("vasu");
			names.add("varun");
			names.add("naveen");
			names.add("Rajesh");
			names.add("suhasini");
			
			System.out.println(names);
		}
	}



   // The important points about the Java LinkedHashSet class are:

   // Java LinkedHashSet class contains unique elements only like HashSet.
   // Java LinkedHashSet class provides all optional set operations and permits null elements.
   // Java LinkedHashSet class is non-synchronized.
   // Java LinkedHashSet class maintains insertion order.
