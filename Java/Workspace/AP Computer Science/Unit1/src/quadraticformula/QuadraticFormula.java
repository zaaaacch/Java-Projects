package quadraticformula;
import java.util.Scanner;
public class QuadraticFormula 
{	
	public static void main(String[] args) 
	{
		String name;
		int numbA, numbB, numbC;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is your name? >> ");
		name = keyboard.nextLine();
		System.out.println("Please enter your equation: ax^2+bx+c=0");
		System.out.print("Enter variable a >> ");
		numbA = keyboard.nextInt();
		System.out.print("Enter variable b >> ");
		numbB = keyboard.nextInt();
		System.out.print("Enter variable c >> ");
		numbC = keyboard.nextInt();
		keyboard.close();
		double root1 = (-numbB - (Math.sqrt(Math.pow(numbB, 2) +(-4*numbA*numbC))))/(2*numbA);
		double root2 = (-numbB + (Math.sqrt(Math.pow(numbB, 2) +(-4*numbA*numbC))))/(2*numbA);
		System.out.println("Hi " + name);
		System.out.println("You asked me to solve: " + numbA + "x^2 " + "+ " + numbB + "x" + " + "+ numbC + " = 0");
		System.out.println("Root 1 is equal to " + String.format("%.2f", root1));
		System.out.println("Root 2 is equal to " + String.format("%.2f", root2));
	}
}
