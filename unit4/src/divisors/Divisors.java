package divisors;
import java.util.Scanner;
public class Divisors {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a positive integer >> ");
		int n = reader.nextInt();
		reader.close();
		System.out.print("\nThe divisors of " + n + " are ");
		int limit = n / 2;
		int d;
		for (d = 2; d <= limit; d++) {
			if(n % d == 0) {
				System.out.print(d + " ");
				break;
			}
		}
	}
}
