package usingdata;
public class QuartsToGallons {
	public static void main(String[] args)
	{
		int quartsNeeded = 18;
		int gallonsNeeded = quartsNeeded / 4;
		int quartsLeft = quartsNeeded % 4;
		System.out.println("A job that needs " + quartsNeeded + " quarts requires " + gallonsNeeded + " gallons plus " + quartsLeft + " quarts.");
	}
}
