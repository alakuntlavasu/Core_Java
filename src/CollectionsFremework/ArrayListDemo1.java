package CollectionsFremework;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList<String> Lap=new ArrayList<String>();
		Lap.add("Hp");
		Lap.add("Dell");
		Lap.add("Lenovo");
		Lap.add("Apple");
		System.out.println(Lap);
		
	//	To ietarate the the data using for loop
   
		for(int i=0; i<Lap.size()-1;i++) {
			 System.out.println(Lap.get(i));
		}
		
	}

}
