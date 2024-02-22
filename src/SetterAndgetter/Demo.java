package SetterAndgetter;


class Student
{
	private String name;
	private int roll;
	
	public void setName(String n)
	{
		this.name=n;
	
		}	
	public String getName() 
	{
		return name;
		
	}
	public void setRoll(int x) 
	{
		this.roll=x;
	}
	public int getRoll() {
		return roll;
		
	}
		
	}

public class Demo {

	public static void main(String[] args) {
		
       Student t1=new Student();
       
       t1.setName("Alakuntla");
       t1.setRoll(12);
       
       t1.setName("varun");
       t1.setRoll(11);
       
      
       
       System.out.println(t1.getName());
       System.out.println(t1.getRoll());
       
     
	}

}
