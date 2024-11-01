package gradecalculation;
import java.util.Scanner;
public class GradeCalculation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double grade = 0.0;
		double sum = 0.0;
		int gradeCount = 0;
		double currentGrade;
		while (true) {
			System.out.print("Enter a grade value >> ");
			currentGrade = in.nextDouble();
			if (currentGrade == -1) {
				break;
			}
			sum += currentGrade;
			gradeCount++;
		}
		if (gradeCount == 0) {
			System.out.println("There were no grades added.");
		} else {
			grade = sum / gradeCount;
			System.out.println("Your average grade was " + grade);
		}
	}
}
