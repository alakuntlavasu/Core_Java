package interfaces;
class B{
	int c;

	public B() {
		super();
		// TODO Auto-generated constructor stub
	}

	public B(int c) {
		super();
		this.c = c;
	}
	
	
}
public class Cons extends B {
	int a;
	int b;
	public Cons(int a, int b,int c) {
		super();
		this.a = a;
		this.b = b;
	}
	public static void main(String[] args) {
		Cons obj=new Cons(10,20,40);
	}

}
