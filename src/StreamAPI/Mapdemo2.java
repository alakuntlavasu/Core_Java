package StreamAPI;

import java.util.stream.Collectors;
import java.util.*;

public class Mapdemo2 {

	public static void main(String[] args) {
		List<String> enames=Arrays.asList("vasu","naveen kumar","varun taj");
           
		// without using Stream
		
		/*for(String name:enames) {
			System.out.println(name.length());
		}*/
		
		
		
		
		// i want print length each element?
		
		// using stream
		List<Integer>name=enames.stream().map(e->e.length()).collect(Collectors.toList());
		
		System.out.println(name);
		
		enames.stream().map(v->v.length()).forEach(n->System.out.println(n));
	}

}
