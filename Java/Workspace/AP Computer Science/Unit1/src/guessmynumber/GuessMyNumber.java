package guessmynumber;
import java.util.Scanner;

public class GuessMyNumber {

	public static void main(String[] args) {
		int number = 63;
		int playerGuess;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter your number >> ");
		playerGuess = keyboard.nextInt();
		keyboard.close();
		boolean isLessThan = number < playerGuess;
		boolean isGreaterThan = number > playerGuess;
		boolean isEqualTo = number == playerGuess;
		System.out.println("The number I am thinking of is less than yours: " + "\t" + isLessThan + "\n\nThe number I am thinking of is greater than yours: " + "\t" + isGreaterThan + "\n\nThe number I am thinking of is equal to yours: " + "\t\t" + isEqualTo);
	}

}
