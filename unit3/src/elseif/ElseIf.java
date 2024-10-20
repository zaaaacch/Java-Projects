package elseif;
import java.util.Scanner;
public class ElseIf {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your grade >> ");
		double grade = input.nextDouble();
		String letter;
		input.close();
		if (grade >= 89.5) {
			letter = "A";
		}
	}
}
