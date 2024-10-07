package letter;

public class Letter {
	// no instance variables
	public void writeLetter() {
		greeting();
		specialMethod();
		specialMethod();
		closing();
	}
	
	public void greeting() {
		System.out.println("Hello Friend");
	}
	
	public void specialMethod() {
		System.out.println("\tComputer Science is awesome!");
	}
	
	public void closing() {
		System.out.println("\nSee you soon!");
	}
}
