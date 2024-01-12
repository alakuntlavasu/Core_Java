package Variables;

class Student
{
	// instance variables
	String Fname;
	String lname;
	int roll;
	
}

public class Demo 
{

	public static void main(String[] args) 
	{
		
		 Student d=new Student();
		 
		 System.out.println(d.Fname);
		 System.out.println(d.lname);
		 System.out.println(d.roll);
		 
	 d.Fname="vasi";
	 d.lname="Alakuntla";
	 d.roll=03;
	 
	 
	 System.out.println(d.Fname);
	 System.out.println(d.lname);
	 System.out.println(d.roll);
		 
	

	}

}
