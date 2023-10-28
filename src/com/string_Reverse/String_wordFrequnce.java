package com.string_Reverse;

import java.util.Scanner;

public class String_wordFrequnce {

	public static void main(String[] args) {
		
		System.out.println("Enter given string:");
		
		Scanner sc= new Scanner(System.in);
		 String s= sc.nextLine();
		 
		 int count=1;
		 
		 for(int i=0;i<s.length()-1;i++) 
		 {
			 if((s.charAt(i)==' '))
               {
				 count ++;
			   }
			
		 }
		 
		 System.out.println("number of words in a string:"+count);
	}
	

}
