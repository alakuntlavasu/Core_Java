package OOPS;

public class Class4 {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		this.name = newName;
	}
}
class Demo{
	public static void main(String[] args) {
		 Class4 t1=new Class4();
		 t1.setName("Alakuntla");
		 System.out.println(t1.getName());
	}
}
		

	


