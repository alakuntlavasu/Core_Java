package OOPS;


abstract class Bike
{
	 abstract void run ();
}
public class Honda extends Bike 
{
	
	@Override
	void run() 
	{
		// TODO Auto-generated method stub
		System.out.println("honda bikes are very fast");
		
	}

	public static void main(String[] args) {
		
		 Bike br = new Honda();
		 br.run();

	}

	

}
