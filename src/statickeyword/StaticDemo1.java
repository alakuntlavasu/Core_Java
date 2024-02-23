package statickeyword;

class TcsEployess{
	int id;
	String name;
	int sal;
	String location;
	String domain;
	
	static String manager="Rajesh";
	
	
	public void show() {
		System.out.println(id+":"+name+":"+sal+":"+location+":"+domain+":"+manager);
	}
}


public class StaticDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TcsEployess jaggu= new TcsEployess();
		
		jaggu.id=101;
		jaggu.name="jaggu";
		jaggu.location="Bangalore";
		jaggu.domain="React js Developer";
		
		
		TcsEployess Rahul= new TcsEployess();
		
		Rahul.id=102;
		Rahul.name="Rahul";
		Rahul.location="hydrabad";
		Rahul.domain="java developer";
		

		
		jaggu.show();
		Rahul.show();
	}

}
