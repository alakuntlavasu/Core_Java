package OOPS;



class Test1{
	
	int a;
	int b;
   public void vasu() {
	   
	   System.out.println(a+b);
   }
   
   
}

class Test2 extends Test1{
	int c;
	int d;
	
	public void vamsi() {
		System.out.println(c+d);
	}
}



public class Test {
	
	public static void main(String[] args) {
		Test1 t1=new Test1();
		t1.a=100;
		t1.b=200;
		t1.vasu();
		
		Test2 t2=new Test2();
		t2.a=100;
		t2.b=200;
		t2.c=300;
		t2.d=400;
		
	    t2.vasu();
		t2.vamsi();
		
	}

}
