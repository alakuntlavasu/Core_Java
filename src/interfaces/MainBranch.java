package interfaces;

  interface MainBank
{
    void deposite();
    void withdraw();
    void lone();
    void account();
}

abstract  class ICC implements MainBank
{

	@Override
	public void deposite() {
		// TODO Auto-generated method stub
		
		System.out.println("your deposite money is :"+3000);
		
	}
}

	abstract class Axces extends ICC
	{


		@Override
		public void withdraw() {
			// TODO Auto-generated method stub
			
			System.out.println("your withdraw money is :"+2000);
			
		}

	
		}
	
	 class RBI extends Axces
	{

		

		@Override
		public void lone() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void account() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public class MainBranch{
		public static void main(String[] args) {
			
			RBI d=new RBI();
			
			d.deposite();
			d.withdraw();
		}
	}
		
	 
	
	

