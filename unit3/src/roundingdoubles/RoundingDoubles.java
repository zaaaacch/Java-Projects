package roundingdoubles;
import java.util.Scanner;
public class RoundingDoubles {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double num;
		int newNum;
		System.out.print("What is number? ");
		num = keyboard.nextDouble();
		keyboard.close();
		if (num >= 0) {
			newNum = (int) (num + 0.5);
		} else {
			newNum = (int) (num - 0.5);
		}
		System.out.println(newNum);
	}
}
