package StreamAPI;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class Mapdemo1 {

	public static void main(String[] args) {
		
		List<String> vehicles=Arrays.asList("car","bus","flight","tain");
		
		List<String> student=Arrays.asList("vasu","varun","taj","naveen");
		

		
		// without stream concept
		
		/*for(String name:vehicles) {
		
            v.add(name.toUpperCase());
            System.out.println(v);
            
	}*/
		
    // with stream-map
		List<String>name=vehicles.stream().map(m->m.toUpperCase()).collect(Collectors.toList());
			
		System.out.println(name);
		System.out.println(vehicles);
		System.out.println(student);
		System.out.println(name);
		System.out.println(vehicles);
		System.out.println(student);
}
}