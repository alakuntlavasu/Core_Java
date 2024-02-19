package Strings;

public class Demo1 {

	public static void main(String[] args) {
		
		String str="Hello";
		
		String b="Hello";
		
		String str1= new String("Hello");

		String str2= new String("Good morning");
		
		System.out.println(str1==str2);
		
		System.out.println(str==b);
		
		System.out.println(b.equals(str1));

	}

}
