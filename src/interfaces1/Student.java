package interfaces1;

public interface Student {

	public void id ();
	
	public void dresscode ();
	
	public void name(); 
	
	default void Email() {
		System.out.println("every student must and shoud emails");
	}
}
