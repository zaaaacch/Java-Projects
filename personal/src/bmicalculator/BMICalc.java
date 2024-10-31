package bmicalculator;
import java.util.Scanner;
public class BMICalc {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double lbs, m, kg, bmi, ft, in;
		System.out.print("Your height (feet only): ");
		ft = input.nextDouble();
		in = ft * 12;
		System.out.print("Your height (inches only): ");
		in += input.nextDouble();
		m = in / 39.37;
		System.out.print("Your weight in pounds: ");
		lbs = input.nextDouble();
		input.close();
		kg = lbs / 2.205;
		bmi = kg / Math.pow(m, 2);
		System.out.println("Your BMI is " + bmi);
		if (bmi < 15) {
			System.out.println("BMI Category: very severely underweight");
		} else if (bmi >= 15 && bmi <= 16.0) {
			System.out.println("BMI Category: severely underweight");
		} else if (bmi >= 16.1 && bmi <= 18.4) {
			System.out.println("BMI Category: underweight");
		} else if (bmi >= 18.5 && bmi <= 24.9) {
			System.out.println("BMI Category: normal weight");
		} else if (bmi >= 25.0 && bmi <= 29.9) {
			System.out.println("BMI Category: overweight");
		} else if (bmi >= 30.0 && bmi <= 34.9) {
			System.out.println("BMI Category: morbidly obese");
		} else if (bmi >= 35.0 && bmi <= 39.9) {
			System.out.println("BMI Category: severely obese");
		} else {
			System.out.println("BMI Category: very severely obsese");
		}
	}
}
