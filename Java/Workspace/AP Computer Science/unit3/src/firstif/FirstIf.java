package firstif;
import java.util.Scanner;
public class FirstIf {
	public static void main(String[] args) {
		
		// open a scanner object
		Scanner keyboard = new Scanner(System.in);
		// ask the user for input
		System.out.print("Please enter a numeric grade >>> ");
		// get input from user
		int score = keyboard.nextInt();
		// close the scanner
		keyboard.close();
		int threshold = 60;
		if (score >= threshold) {
			System.out.println("\n" + score + " is a passing score.");
		}  // end of if
		System.out.println("End of first if");
		if (score < threshold ){
			System.out.println("\n" + score + " is a failing score.");
		} // end of second if
		
	} // end of main
	
} // end of class
