package OOPS;

public class Student 
{
	
	int sid;
	String sname;
	int sroll;
	
	// parameterised constructor
	public Student(int sid,String sname,int sroll) 
	{
		
		this.sid=sid;
		this.sname=sname;
		this.sroll=sroll;
		
	}
	
	    void display() 
	    {
	    	System.out.println(sid);
	    	System.out.println(sname);
	    	System.out.println(sroll);
	    }

	public static void main(String[] args) {
		
		// Assinging the values to class variables using constructor
		  Student s1=new Student(101, "vasu", 4);
		          s1.display();
		  
		  Student s2=new Student(105, "varun Taj", 7);
		          s2.display();
	}

}
