package collections_utilitypackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		
		List<String> li= new ArrayList<String>();
		List<String> al=new ArrayList<String>();
		List<String> dl=new ArrayList<String>();
		
		li.add("vasu");
		li.add("naveen bro");
		li.add("varun");
		li.add("Rajesh");
		System.out.println(li);
		
		
		al.add("book");
		al.add("pen");
		al.add("bus");
		al.add("car");
		System.out.println(al);
		
		Collections.copy(li, al);
		System.out.println(dl);

	}

}
