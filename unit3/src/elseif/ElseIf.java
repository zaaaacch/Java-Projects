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
		} else if (grade >= 79.5 && grade <= 89.49999) {
			letter = "B";
		} else if (grade >= 69.5 && grade <= 79.49999) {
			letter = "C";
		} else if (grade >= 59.5 && grade <= 69.49999) {
			letter = "D";
		} else 
			letter = "F";
		System.out.println(letter);
	} 
}
