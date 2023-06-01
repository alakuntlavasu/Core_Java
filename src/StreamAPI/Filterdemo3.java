package StreamAPI;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;
public class Filterdemo3 {

	public static void main(String[] args) {
		
		List<String>words=Arrays.asList("vasu",null,"naveen","varun",null,"taj");
		
		List<String>result=words.stream().filter(w->w!=null).collect(Collectors.toList());
		
		System.out.println(result);

	}

}
