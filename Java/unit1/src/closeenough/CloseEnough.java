package closeenough;

public class CloseEnough {
	public static void main(String[] args)
	{
		double num1 = 2.2 - 2;
		double num2 = 0.2;
		System.out.println("Computed answer is " + num1);
		System.out.println("Exact answer is " + num2);
		double tol = 0.0001;
		boolean isCloseEnough = Math.abs(num1 - num2) <= tol;
		System.out.println("Computed value is close enough to the exact answer? " + isCloseEnough);
		double num3 = 2.0/3 * 9;
		double num4 = 6;
		System.out.println("Computed answer is " + num3);
		System.out.println("Exact answer is " + num4);
		boolean isCloseEnough2 = Math.abs(num3 - num4) <= tol;
		System.out.println("Computed value is close enough to the exact answer? " + isCloseEnough2);
		
	}
}

