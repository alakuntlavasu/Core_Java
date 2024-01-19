package polymorpshim;

class Test{
	
	static  void m1() {
		System.out.println("super class method m1()");
	}
}

class Demo extends Test
{
	
	static void m1() 
	{
		System.out.println("child class method m1()");
	}
}

public class CompiletimepolymorpshimEx {

	public static void main(String[] args) 
	{
		
		Test t=new Demo();
		t.m1();

	}

}
