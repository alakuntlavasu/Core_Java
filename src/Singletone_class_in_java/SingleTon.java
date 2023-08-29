package Singletone_class_in_java;

public class SingleTon
{
	private static SingleTon instance;
	
	public static SingleTon instance()
	{
		if(instance==null)
		{
			instance = new SingleTon();
		}
		return instance;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("SingleTon class, allows only one object at an instance");
	}

}
