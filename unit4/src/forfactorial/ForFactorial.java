package forfactorial;
import java.util.Scanner;
public class ForFactorial {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What number should I find the factorial of? >>> ");
		int number = keyboard.nextInt(); // sets the number to find factorial of
		keyboard.close();
		System.out.print(number + "! = ");
		int ans = 1; // sets ans as it has to start somewhere
		// beginning of loop
		
		for (int n = number; n > 1; n--) {
			ans *= n;
		}
		System.out.print(ans);
		System.out.println("\nUpon exit number = " + number);
	}
}
