package usingdata;
import java.util.Scanner;
public class QuartsToGallonsInteractive {
	public static void main(String[] args)
	{
		int quartsNeeded;
		Scanner input = new Scanner(System.in);
		System.out.print("How many quarts are needed? ");
		quartsNeeded = input.nextInt();
		input.close();
		int gallonsNeeded = quartsNeeded / 4;
		int quartsLeft = quartsNeeded % 4;
		System.out.println("A job that needs " + quartsNeeded + " quarts requires " + gallonsNeeded + " gallons plus " + quartsLeft + " quarts.");
	}
}
