package OOPS;

public class Employe {
	int empid;
	String empname;
	int salary;
	int deptno;
	
	 public void display() 
	 {
		 System.out.println(empid);
		 System.out.println(empname);
		 System.out.println(salary);
		 System.out.println(deptno);
	 }

	public static void main(String[] args) {
		
		
	// Assigning values to class variables using object - first method	
		Employe e1=new Employe(); // employe 1
		        e1.deptno=101;
		        e1.empname="vasu";
		        e1.salary=25000;
		        e1.empid=5;
		        e1.display();
		

	    Employe e2=new Employe(); // employe2
	            e2.deptno=105;
	            e2.empname="varun Taj";
	            e2.salary=35000;
	            e2.empid=15;
	            e2.display();
	            
	            
	            
		 
	}

}
