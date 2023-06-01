package interfaces;

public class Lenovo implements Laptop {

	@Override
	public void copy() {
		System.out.println("Lenovo copy code");
	}

	@Override
	public void paste() {
		System.out.println("Lenovo paste code");
		
	}

	@Override
	public void cut() {
		System.out.println("Lenovo cut code");
		
	}

	@Override
	public void keybord() {
		System.out.println("Lenovo keybord code");
		
	}

}
