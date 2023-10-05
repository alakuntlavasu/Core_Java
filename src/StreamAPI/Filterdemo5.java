package StreamAPI;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class Filterdemo5 {

	

	public static void main(String[] args) {
		
		/*ArrayList<Integer> numberList=new ArrayList<>();
		     numberList.add(10);
		     numberList.add(15);
		     numberList.add(20);
		     numberList.add(25);
		     numberList.add(30);
		     
		     System.out.println(numberList);*/
		
		//single line ArrayList creation
		
		List<Integer>numberList= Arrays.asList(10,15,20,25,30);
		List<Integer>evenNumberList=new ArrayList<Integer>();
		
		// without using streams
		
		/*for(int n:numberList) {
			if(n%2==0)
				evenNumberList.add(n);
		}
		
		System.out.println(evenNumberList);*/
		
		
		//with Streams
		
		  
		/*evenNumberList=numberList.stream().filter(n->n%2==0).collect(Collectors.toList());
		
		System.out.println(evenNumberList);*/
		
		numberList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
	}

}
