package ifelse;
import java.util.Scanner;
public class IfElse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int hours;
		double rate = 14.50;
		double pay;
		System.out.print("How many hours did you work? >>> ");
		hours = input.nextInt();
		input.close();
		if (hours <= 40) {
			pay = rate * hours;
		} else {
			pay = rate * 40 + rate*1.5*(hours-40);
		}
		System.out.println("Your pay will be: " + pay);
	}

}
