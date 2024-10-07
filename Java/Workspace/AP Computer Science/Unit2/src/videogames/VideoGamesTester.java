package videogames;
import java.util.Scanner;
public class VideoGamesTester {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the number of popular games you are subscribing to >> ");
		int numPop = keyboard.nextInt();
		System.out.print("Please enter the number of older games you are subscribing to >> ");
		int numOld = keyboard.nextInt();
		keyboard.close();
		System.out.println("Your monthly subscription price for " + numPop + " popular and " + numOld + " older games is $" 
		+ VideoGames.monthlyPrice(numPop, numOld));
		System.out.println("Your annual subscription price for " + numPop + " popular and " + numOld + " older games is $" 
		+ VideoGames.annualPrice(numPop,numOld));
	}

}
