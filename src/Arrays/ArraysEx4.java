package Arrays;

public class ArraysEx4 {

	public static void main(String[] args) {
	
	// Array creation	
	int A[]=new int[10];
	
	// Array intilization values
	int B[]= {1,34,12,45,23,67,14,15,16};
	
	// Array creation
	int c[];
	c=new int[14];
	
//	for(int i=0;i<A.length;i++) 
//	{
//		System.out.println(A[0]);
//	}
	
	// Red the the values using for loop
	for(int i=0;i<B.length;i++) 
	{
		System.out.println(B[i]);
	}
	
	// Red the the values using for Each loop
	for(int x:B) 
	{
		System.out.println(x);
	}

	}

}
