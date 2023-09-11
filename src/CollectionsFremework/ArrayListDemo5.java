package CollectionsFremework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo5 {

	public static void main(String[] args) {
	
		ArrayList<Integer> al1=new ArrayList<>(List.of(10,20,30,40,50,60));
		
		System.out.println(al1);
		
		
		// using for loop reading the data
		for(int i=0;i<al1.size();i++) 
		{
			System.out.println(al1.get(i));
		}
		
		// using forEach loop the reading the data
		for(var v:al1) 
		{
			System.out.println(v);
		}
		
		// using forEach loop the reading the data
				for(Integer v:al1) 
				{
					System.out.println(v);
				}


	}

}
