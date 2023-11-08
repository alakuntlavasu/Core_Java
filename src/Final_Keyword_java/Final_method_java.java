package Final_Keyword_java;

 class  Demo{
	
	final void getgm() {
		
		System.out.println("good morning");
		
	}
	
}
 
 class Test extends Demo
 {
	 // final method canot be overriden in child class
	 
//	 void getgm() 
//	 {
//		 System.out.println("good morning overriden");
//	 }
 }

public class Final_method_java {

	public static void main(String[] args) {
		
		Test t1=new Test();
		
		t1.getgm();
		

	}

}
