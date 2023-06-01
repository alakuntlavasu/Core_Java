package StreamAPI;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;
public class Filterdemo2 {

	public static void main(String[] args ) {
		
   List<String> names = Arrays.asList("vasu","varun taj","naveenkumar","jaggud","shafirt");
   
   List<String> name=new ArrayList<String>();
   
   
   // create stream object configure and process 
//     name= names.stream().filter(s->s.length()>6 && s.length()<8).collect(Collectors.toList());
// System.out.println(name);
   
   
   // using forEach method 
      names.stream().filter(s->s.length()>6 && s.length()<8).forEach(s->System.out.println(s));
      

		

	}

}
