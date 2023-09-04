package Method_overloding;

public class OverlodingEx1 
{
	int a;
	int b;
	
	 void sum() // first method
	 {
		 a=10;
		 b=20;
		 System.out.println(a+b);
	 }
	 
	 void sum(int x, int y) // second method 
	 {
		 int a=x;
		 int b=y;
		 System.out.println(a+b);
		 
	 }
	 
	 void sum(int x,int y, int z) // Third method
	 {
		 System.out.println(x+y+z);
	 }
	 
	 void sum(int x, double y)// fourth method
	 {
		 System.out.println(x+y);
	 }

	public static void main(String[] args) {
		
             OverlodingEx1 a=new OverlodingEx1();
                           a.sum(); // call first method
                           
                          a.sum(100, 200);// call second method
                          
                          a.sum(100, 200, 300);// call third method
                          a.sum(100, 20.00);
                          a.sum(20,500);
	}                    
                   
}
