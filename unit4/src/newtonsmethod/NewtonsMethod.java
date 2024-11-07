package newtonsmethod;
import java.util.Scanner;
public class NewtonsMethod {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num = 1;
		double guess = 0;
		double newApprox = 0;
		double oldApprox;
		double tol = 0.001;
		while (num >= 0) {
			System.out.print("Enter a number to find the square root or a negative number to stop >> ");
			num = input.nextDouble();
			if (num < 0) break;
			System.out.print("Enter your estimate >> ");
			oldApprox = input.nextDouble();
			double diff = 1;
			int counter = 0;
			while (diff > tol) {
				newApprox = ((num / oldApprox) + oldApprox) / 2.;
				diff = Math.abs(newApprox-oldApprox);
				System.out.println("Iteration " + counter + ": current estimate: " + oldApprox + " off by " + Math.abs(Math.sqrt(num) - oldApprox));
				oldApprox = newApprox;
				counter++;
			}
		System.out.println("Stopping after iteration " + counter + ": final estimate: " + oldApprox + " off by " + Math.abs(Math.sqrt(num) - oldApprox));
		}
	}
}