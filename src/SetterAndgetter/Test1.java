package SetterAndgetter;


class Animal{
	private String animalname;
	private String animalcolor;
	private int animalncost;
	
	
	public void setAnimalName(String aname)
	{
		this.animalname=aname;
	}
	public String getAnimalName()
	{
		return animalname;
		
		
	}
	
	public void setAnimalColor(String acolor) 
	{
		this.animalcolor=acolor;
	}
	
	public String getAnimalColor()
	{
		return animalcolor;
		
	}
	
	public void setAnimalnCost(int acost) 
	{
		this.animalncost=acost;
	}
	
	public int getAnimalCost(){
		return animalncost;
		
	}
}
public class Test1 {

	public static void main(String[] args) {
		
		Animal dog=new Animal();
		
		dog.setAnimalName("smilley");
		dog.setAnimalColor("black");
		dog.setAnimalnCost(56);
		
		System.out.println(dog.getAnimalName());
		
		System.out.println(dog.getAnimalColor());
		
		System.out.println(dog.getAnimalCost());
		
		

	}

}
