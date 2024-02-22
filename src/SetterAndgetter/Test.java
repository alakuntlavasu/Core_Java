package SetterAndgetter;


class Bank
{
	private String accountname;
	private int balance;
	
	public void setAccountName(String n) 
	{
		this.accountname=n;
		
	}
	public String getAccountName() 
	{
		return accountname;
		
	}
	public void setBalance(int x) 
	{
		this.balance=x;
	}
	public int getBalance() {
		return balance;
		
	}
}
public class Test {

	public static void main(String[] args) {
		
       Bank b1=new Bank();
       
       b1.setAccountName("vasu");
       b1.setBalance(78);
       
       System.out.println(b1.getAccountName());
       System.out.println(b1.getBalance());
	}

}
