package factorial;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What number should I find the factorial of? >>> ");
		int n = keyboard.nextInt(); // sets the number to find factorial of
		keyboard.close();
		int number = n; // creates a variable that will not be changed
		System.out.print(n + "! = ");
		int ans = 1; // sets ans as it has to start somewhere
		// beginning of loop
		while (n > 1) { // ends once n is 1 or less
			ans *= n;
			n--; // subtracts from n
		} // end of loop
		System.out.print(ans);
		System.out.println("\nUpon exit number = " + number);
	}
}
