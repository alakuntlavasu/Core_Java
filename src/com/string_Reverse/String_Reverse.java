package com.string_Reverse;

public class String_Reverse {

	public static void main(String[] args) {
	  
		String str="AlakuntlaVasu";
		
		// Approach-1
		char[] chArr= str.toCharArray();
		
		for(int i= chArr.length-1; i>=0; i--) 
		
		{
			System.out.print(chArr[i]);
		}
		
		System.out.println("");
		
		
		// Approach-2 
		for(int i=str.length()-1; i>=0; i--) 
		{
			System.out.print(str.charAt(i));
		}
		
		System.out.println("");
		
		
		// Approach-3
		StringBuffer sb= new StringBuffer(str);
		
		System.out.println(sb.reverse());

	}

}
