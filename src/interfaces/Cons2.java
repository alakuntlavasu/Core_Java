package interfaces;
class A{
	int c =56;

	public A(int c) {
		super();
		this.c = c;
	}

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
public class Cons2 extends A {
	
	

	public Cons2(int c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	

	public Cons2() {
		super();
		// TODO Auto-generated constructor stub
	}



	public static void main(String[] args) {
		Cons2 obj=new Cons2();
		
		System.out.println(obj.c);
	}

}
