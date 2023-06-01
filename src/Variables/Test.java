package Variables;

public class Test {
    int a;// instant variable
    static int b;// static variable
	public static void main(String[] args) {
		int c;
		 Test obj1=new Test();// 0
		 System.out.println(b);// 0
		 System.out.println(Test.b);// 0
		 System.out.println(obj1.b);// 0

	}

}
