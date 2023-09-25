package StringBufferEx;

public class StringBufferDemo2 {

	public static void main(String[] args) {
		
		StringBuffer sb1=new StringBuffer("Alakuntla");
		
	   StringBuffer sb2=sb1.append("vasu");
	   StringBuffer sb3=sb2.append("King");
	   
	   System.out.println(sb1);
	   System.out.println(sb2);
	   System.out.println(sb3);

	}

}
