package usingdata;
import java.util.Scanner;
public class MinutesConversion {
	public static void main(String[] args)
	{
		double numMins, numHours, numDays;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount of minutes to convert >> ");
		numMins = input.nextDouble();
		input.close();
		numHours = numMins / 60;
		numDays = numHours / 24;
		System.out.print("\n" + numMins + " minutes equals " + numHours + " hours and equals " + String.format("%.2f", numDays) + " days.");
	}
}
