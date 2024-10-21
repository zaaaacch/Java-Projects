package division;
import java.util.Scanner;
public class Division {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numerator, denominator, result;
		System.out.print("Enter numerator >> ");
		numerator = input.nextInt();
		System.out.print("Enter denominator >> ");
		denominator = input.nextInt();
		try {	// tries the following code
			System.out.println(2/denominator);
		}
		catch (ArithmeticException e) {	// if the try code fails, checks for type of error and runs if ArithmeticException
			System.out.println("Silly human, you can't divide by zero");
		}
		catch (Exception e) {	// if the try code fails, checks for type of error and runs if any other Exception
			System.out.println("Something went wrong");
			System.out.println(e);
		}
		result = numerator / denominator;
		System.out.println(numerator + " / " + denominator + " = " + result);
		System.out.println("I am out of the catch block");
	}
}
