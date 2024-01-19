package polymorpshim;

class A{
	static void m1(){
		System.out.println("super class m1()");
	}
}

class B extends A{
	
	static void m1() {
		System.out.println("sub class m1() ");
	}
}
public class RuntimepolymorpshimEx {

	public static void main(String[] args) {
		
       A a=new B();
       a.m1();
	}

}
