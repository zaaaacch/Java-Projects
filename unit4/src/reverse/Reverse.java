package reverse;
// this program prints in reverse the digits of a number
public class Reverse { // begin class
	public static void main(String[] args) { // begin main
		int n = 123456;
		// begin loop
		while (n > 0) {
			System.out.print(n % 10);
			n /= 10;
		} // end loop
	} // end main
} // end class
