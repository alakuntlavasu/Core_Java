package CollectionsFremework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo7 {

	public static void main(String[] args) {
     ArrayList<Integer> v1=new ArrayList<>(List.of(10,20,30,40,50,60,70,80,90,100));
     
     System.out.println(v1);
     
     
    // forEach it will be Automatically scaning the data  
//     v1.forEach(n->System.out.println(n));
     
     
     
//     v1.forEach(System.out::println);
     
     
     v1.forEach(n->show(n));

	}
	
	
	
	static void show (int n) 
	{
		if(n>50)
			System.out.println(n);
	}

}
