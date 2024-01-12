package patterns_in_java;

public class PermidPattren {

	public static void main(String[] args) {
		int i;
		int j;
		int k;
		int n=8;
		
		for( i=1;i<n; i++) 
		{
			for(k=1;k<=n-i;k++) 
			{
				System.out.print(" ");
			}
			for(j=1; j<=i ;j++) 
			{
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
/*     *
      **
     ***
    ****
   *****
  ******
 ******* */
