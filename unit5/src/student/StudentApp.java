package student;
import java.util.Scanner;
public class StudentApp {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Scanner input = new Scanner(System.in);
		String name;
		int score;
		// Takes user input for student name
		System.out.print("Enter the student name: ");
		name = input.nextLine();
		s1.setName(name);
		// Loops to get user input for test scores
		for (int i = 1; i <= 3; i++) {
			System.out.print("Enter test score " + i + ": ");
			score = input.nextInt();
			s1.setScore(score, i);
		}
		input.nextLine();
		// Takes user input for student name
		System.out.print("Enter the student name: ");
		name = input.nextLine();
		s2.setName(name);
		// Loops to get user input for test scores
		for (int i = 1; i <= 3; i++) {
			System.out.print("Enter test score " + i + ": ");
			score = input.nextInt();
			input.nextLine();
			s2.setScore(score, i);
		}
		input.close();
		
		if (s1.getHighTest() > s2.getHighTest()) {
			System.out.println(s1.getName() + " has the higher test score.");
		} else if (s1.getHighTest() < s2.getHighTest()) {
			System.out.println(s2.getName() + " has the higher test score.");
		} else {
			System.out.println("Both students have the same high test score.");
		}
		System.out.println("\n" + s1 + "\n\n" + s2);
	}
}
