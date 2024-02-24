package interfaces1;

interface Vasu{
	public void m1(); 
	public void m2();	
	
}

class D implements Vasu{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("interface m1()");
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		 System.out.println("interface m2()");
	}
	
}
public class Demo {

	public static void main(String[] args) {
		D s=new D();
		s.m1();
		s.m2();
		

	}

}
