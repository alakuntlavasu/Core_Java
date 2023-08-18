package javapattern;

public class Test {

	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=n;i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.println("");
				
			}
			
			for (int j=i; j>=1;j--) {
				System.out.println(j+"");
				
			}
			for (int j=2; j<=i; j++) {
				System.out.println(j+"");
				
			}
			System.out.println();
			
		}
		

}
}