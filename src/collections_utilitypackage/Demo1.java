package collections_utilitypackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Demo1 {

	public static void main(String[] args) {
		
     List<String> emp=new ArrayList<String>();
     
     emp.add("vasu");
     emp.add("Alakuntla");
     emp.add("varun");
     emp.add("naveen");
     
//     System.out.println(emp);
     

     Collections.sort(emp);
     System.out.println(emp);
     
     Collections.reverse(emp);// entair list is reverse
     System.out.println(emp);
     
     Collections.reverseOrder();// list elements is reverse order
     System.out.println(emp);
     
     Collections.shuffle(emp);// every time change the list objects 
     System.out.println(emp);
    
     
	}

}
