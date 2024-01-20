package Method_overriding;

class Parent
{
	public void Wish() {
	
	}
}

class Child extends Parent
{
 
	public void Wish() 
	{
		System.out.println("Good morning");
	}
}

public class OverridingEx2 {

	public static void main(String[] args) {
		
		Child object=new Child();
		
		object.Wish();
		System.out.println("overriding");
	
       
	}

}
