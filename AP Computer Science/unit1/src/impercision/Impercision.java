package impercision;

public class Impercision {
	public static void main(String[] args)
	{
		double num1 = 2.2 - 2;
		double num2 = 0.2;
		System.out.println("Computed answer is " + num1);
		System.out.println("Exact answer is " + num2);
		boolean isEqual = num1 == num2;
		System.out.println("Computed equals exact? " + isEqual);
		double num3 = 2.0/3 * 9;
		double num4 = 6;
		System.out.println("Computed answer is " + num3);
		System.out.println("Exact answer is " + num4);
		boolean isEqual2 = num3 == num4;
		System.out.println("Computed equals exact? " + isEqual2);
	}
}

