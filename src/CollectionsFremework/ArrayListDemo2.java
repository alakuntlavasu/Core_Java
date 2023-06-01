package CollectionsFremework;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<String> p=new ArrayList();
		p.add("Blue pen");
		p.add("green pen");
		p.add("pink pen");
		p.add(" red pen");
		
		System.out.println(p);
		
		// To ietarate the data using for-each
		
		for(String i:p) {
			System.out.println(i);
		}

	}

}
