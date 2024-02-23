package methodHiddingAndoverriding;


class Parant{
	
	public void display() {
		System.out.println("parant display method");
	}
	
	public static void show() {
		System.out.println("parant show method");
	}
}

class Chaild extends Parant{
	
	public static void show() {
		System.out.println("chaild show method");
	}
	
	public void display() {
		System.out.println("chaild display method");
	}
}
public class MehodHidding {

	public static void main(String[] args) {
		
		Parant p=new Parant();
		
	    Parant c=new Chaild();
	    
	    

	}

}
