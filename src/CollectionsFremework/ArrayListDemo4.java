package CollectionsFremework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		List<String>names=new ArrayList<String>();
		
		names.add("vasu");
		names.add("naveen");
		names.add("varun Taj");
	    names.add("kohli");
	    names.add("Rohith");
		
		System.out.println(names);
		
		System.out.println(names.subList(2, 4));
		
//		System.out.println(names.get(2));
		
//		for(String e:names) 
//		{
//			System.out.println(e);
//		}

	}

}
