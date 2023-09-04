package OOPS;

public class Book {
	
	int Bid;
	String  Bname;
	int Bprice;
	
	
	void setBookData(int Bid,String Bname,int Bprice) 
	{
		this.Bid=Bid;
		this.Bname=Bname;
		this.Bprice=Bprice;
	}
	
	void display() 
	{
		System.out.println(Bid);
		System.out.println(Bname);
		System.out.println(Bprice);
	}
	
	public static void main(String[] args) {
		
		// Assinging the values to class variables using method
		Book b1=new Book();
		     b1.setBookData(2, "computer", 100);
		     b1.display();
		    

	}

}
