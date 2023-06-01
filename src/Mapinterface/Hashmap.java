package Mapinterface;
import java.util.*;
import java.util.Map.Entry;
public class Hashmap {

	public static void main(String[] args) {
		// 1 creation of a map
		Map<Integer,String> m=new Hashtable<>();
		// put (key,value) addding the element in the map
          m.put(500050, "Hyderabad");
          m.put(603103, "chennai");
          m.put(123456, "Delhi");
          m.put(517325, "madanapalli");
//          System.out.println(m);
          
          // 2 Retrival of keys from the map
         Set<Integer>keys= m.keySet();
         for(Integer key:keys) {
        	 System.out.println(key);
         }
         System.out.println();
         
         // 3 Retrival of values from the map
         Collection<String>values=m.values();
         for(String value:values) {
        	 System.out.println(value);
         }
         
         System.out.println();
         // 4 Retrieval of value from the map based on a key
           System.out.println(m.get(517325));
            System.out.println();
            
            //5 Retrival of objects based on the get(key) method
           for(Integer key:keys) {
        	   System.out.println(key+":"+m.get(key));
           }
           System.out.println();
           System.out.println(m);
           
           // 6 Deletion of the one key values in method remove(key) i.e one entre deletion in the map
           m.remove(517325);
           
           System.out.println();
           System.out.println(m);
           
           // 7 given map values present there or not using contains method 
           //* containskey()
           //* containsvalue()
           // contains meaning always boolean values
            
           System.out.println(m.containsKey(517325));
           System.out.println(m.containsValue("Delhi"));
           
           // 8 update of the value in the given map    put(key,value)
           //*put(key, value)
           //*put(key, value)
           m.put(502356, "chittoor");
           m.replace(500543, "Mumbai");
           
           System.out.println();
           
           // Retrive of entry values
           
           Set<Entry<Integer,String>> entries =m.entrySet();
           for(Entry<Integer,String> entry:entries) {
        	   Integer key =entry.getKey();
        	   String value =entry.getValue();
        	   System.out.println(key+":"+value);
           }
          
           
	}

}
