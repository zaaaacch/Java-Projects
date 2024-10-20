package lab4;
import java.util.Scanner;
public class Lab4 {
	public static void main(String[] args) {
		double a, b, c, root1, root2;
		Scanner input = new Scanner(System.in);
		System.out.println("A quadratic equation has the form ax^2 + bx + c = 0");
		System.out.print("Please enter the coefficient a >> ");
		a = input.nextDouble();
		System.out.print("Please enter the coefficient b >> ");
		b = input.nextDouble();
		System.out.print("Please enter the coefficient c >> ");
		c = input.nextDouble();
		input.close();
		double D = Math.pow(b,2) - 4*a*c;
		double tol = 0.0001;
		System.out.println("You are trying to solve the quadratic equation:\n" + a + "x^2 + " + b + "x + " + c + " = 0");
		if (D > tol) {
			root1 = (-b - (Math.sqrt(D)))/(2*a);
			root2 =(-b + (Math.sqrt(D)))/(2*a);
			System.out.print("There are two real roots:\nThe roots are " + root1 + " and " + root2);
		} else if (D < -tol) {
			double real = -b / (2*a);
			double imag = ((Math.sqrt(-D)))/(2*a);
			System.out.print("There are two imaginary roots:\nThe roots are " + real + " + " + imag + "i" + " and " + real + " - " + imag + "i");
		} else {
			root1 = (-b - (Math.sqrt(D)))/(2*a);
			System.out.print("There is one repeated root:\nThe root " + root1 + " has a multiplicity of two");
		}
	}
}
