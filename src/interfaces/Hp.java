package interfaces;

public class Hp implements Laptop{

	@Override
	public void copy() {
	System.out.println("Hp copy code");
		
	}

	@Override
	public void paste() {
		System.out.println("Hp paste code");
		
	}

	@Override
	public void cut() {
		System.out.println("Hp cut code");
		
	}

	@Override
	public void keybord() {
		System.out.println("Hp keybord code");
		
	}

}
