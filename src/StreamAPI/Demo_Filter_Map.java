package StreamAPI;

import java.util.Arrays;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

class Employe{
	int eid;
	String ename;
	int esalary;
	
	public Employe(int eid,String ename,int esalary) {
		
		this.eid=eid;
		this.ename=ename;
		this.esalary=esalary;
	}
	public String toString() {
		return ename;
	}
	
}

public class Demo_Filter_Map {
	

	public static void main(String[] args) {
		
		/*List<Employe> empList=new ArrayList<Employe>();
		
		empList.add(new Employe(101,"vasu",28000));
		empList.add(new Employe(102,"naveen",35000));
		empList.add(new Employe(103,"varun",45000));
		empList.add(new Employe(104,"jaggu",26000));
		empList.add(new Employe(104,"shafi",26000));*/
		
		List<Employe> emList=Arrays.asList(
				new Employe(101,"vasu",28000),
				new Employe(102,"naveen",35000),
				new Employe(103,"varun",45000),
				new Employe(104,"jaggu",26000),
				new Employe(105,"shafi",29000)
				);
		  // compare with filter and Map
            List<Integer>employeeSalList= emList.stream().filter(e->e.esalary>20000).map(e->e.esalary).collect(Collectors.toList());
            
            
          System.out.println(emList);
		
		
		
	}

}
