package usingdata;
import java.util.Scanner;
public class Eggs {
	public static void main(String[] args)
	{
		int howManyEggs, dozensOfEggs, looseEggs;
		double dozenCost, looseCost, totalCost;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your amount of eggs >> ");
		howManyEggs = input.nextInt();
		input.close();
		dozensOfEggs = howManyEggs / 12;
		looseEggs = howManyEggs % 12;
		dozenCost = dozensOfEggs * 3.25;
		looseCost = looseEggs * 0.45;
		totalCost = dozenCost + looseCost;
		System.out.print("You ordered " + howManyEggs + " eggs. That is " + dozensOfEggs + " dozen at $3.25 per dozen and " 
		+ looseEggs + " loose eggs at 45 cents each for a total of $" + String.format("%.2f", totalCost));
	}
}
