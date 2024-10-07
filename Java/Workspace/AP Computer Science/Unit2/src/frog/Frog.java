package frog;

public class Frog {
	private int xlocation;
	private int ylocation;
	public Frog(int xStart, int yStart) {
		xlocation = xStart;
		ylocation = yStart;
	}
	public void moveForward3() {
		xlocation +=3;
		System.out.println("The frog moved forward by 3 hops.");
	}
	public void moveForward(int numHops) {
		xlocation += numHops;
		System.out.println("The frog moved forward by " + numHops + " hops.");
	}
	public void moveUp3() {
		ylocation += 3;
		System.out.println("The frog moved forward by 3 hops.");
	}
	public void moveDown(int numHops) {
		ylocation -= numHops;
		System.out.println("The frog moved forward by " + numHops + " hops.");
	}
}
