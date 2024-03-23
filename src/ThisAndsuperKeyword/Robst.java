package ThisAndsuperKeyword;

 class Super{
	 int a;
	 int b;
	 Super(int a, int b){
		 
		 this.a=a;
		 this.b=b; 
	 }
	 
	 void display() {
		  System.out.println( "A value="+a);
		  System.out.println("B value="+b);
	 }
 }
 
 class Sub extends Super{
	 
	 int c;
	Sub(int a,int b,int c){
		super(a, b );
		this.c=c;
	}
void display() {
	super.display();
	System.out.println("c value="+c);
}
	 
 }
public class Robst {

	public static void main(String[] args) {
	 
		Sub s1= new Sub(100, 200, 300);
				s1.display();

	}

}
