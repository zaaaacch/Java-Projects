package additionpattern;

public class AdditionPattern {
	// Instance variables
	private int start;
	private int added;
	private int current;
	// Constructor
	public AdditionPattern(int start, int added) {
		this.start = start;
		this.added = added;
		current = start;
	}
	public int currentNumber() {
		return current;
	}
	public void next() {
		current += added;
	}
	public void previous() {
		if ((current - added) >= start) {
			current -= added;
		}
	}
}
