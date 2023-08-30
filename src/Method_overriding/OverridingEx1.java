package Method_overriding;


class Bank
{
	int getRateOfintrest() 
	{
		return 0;
	}
}

class SBI extends Bank
{
	int getRateOfintrest()// Override
	{
		return 10;
	}
}

class ICICI extends Bank
{
	int getRateOfintrest()// Override 
	{
		return 15;
	}
}

class AXIS extends Bank
{
	int getRateOfintrest() // Override
	{
		return 20;
	}
}

public class OverridingEx1 {

	public static void main(String[] args) {
		
		SBI sbiobj=new SBI();
		    System.out.println(sbiobj.getRateOfintrest());
		



	}

}
