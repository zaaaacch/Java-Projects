package sumintegers;

public class SumIntegers {
	public static void main(String[] args) {
		int sum = 0;
		for (int n = 0; n <= 100; n++) {
			sum += n;
		}
		System.out.println("The sum of the numbers 1 to 100 is " + sum);
		
		String phoneNum1 = "407-555-2207";
		String phoneNum2 = "407-555-5000";
		System.out.println(phoneNum1.compareTo(phoneNum2) < 0);
	}
}
