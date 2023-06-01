	package StreamAPI;
import java.util.*;
import java.util.stream.Collectors;
public class MapEx {

	public static void main(String[] args) {
		List<String> enames=new ArrayList<>();
		enames.add("vasu");
		enames.add("varun Taj");
		enames.add("naveen Kumar");
		enames.add("jaggu");
		
		List<String> new_Names = new ArrayList<>();
		for(String ename:enames) {
			new_Names.add(ename.toUpperCase());
		}
		System.out.println(new_Names);
		
	// creating Stream object and configure and process
		List<String> names = enames.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		System.out.println(enames);
		System.out.println(names);
		

		
	}

}
