package calculator;

public class Calculator {
	// public is access specifier, void is return type (no return),  calcAverage is method name, inside () is signature
	public void calcAverage(int num1, double num2) {
		double avg = (num1 + num2) / 2;
		System.out.println("The average of the provided numbers is " + avg);
	}
	public void calcAverage(int n1, int n2, int n3) {
		double avg = (n1 + n2 + n3) / 3.;
		System.out.println("The average of the provided numbers is " + avg);
	}
	
	// static void class does not require an object. this means that calling is just is Calculator.voidAverage(2, 3);
	// basic but not helpful when using another's code
	public static void voidAverage(int num1, double num2) {
		double avg = (num1 + num2) / 2;
		System.out.println("The average of the provided numbers is " + avg);
	}
	
	// returns a value to the main
	public double calcAvg(int num1, double num2) {
		return (num1+num2) / 2;
	}
}
