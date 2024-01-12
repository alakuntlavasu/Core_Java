package interfaces;

interface student
{
	public abstract void data();
}

class Vasu implements student
{

	@Override
	public void data() {
		
//	 	Local variables
		String name="Alakuntla vasu";
		
		int emprol=23;
		
		System.out.println(name);
		System.out.println(emprol);
		
	}
	
}

public class Demo {

	public static void main(String[] args) {
		
         Vasu s=new Vasu();
         
         s.data();
      
       
         
	}

}
