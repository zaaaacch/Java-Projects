package math;
import static java.lang.Math.*;
public class Math {
	public static void main (String[] args) {
		// try to find integers from a to b, inclusive
		int a = 1;
		int b = 10;
		int numDig = b - a + 1;
		
		System.out.println((int)(random()*numDig + a));
	}
}
