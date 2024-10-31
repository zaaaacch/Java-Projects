package littlequiz;
import java.util.Scanner;
public class LittleQuiz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Are you ready for a quiz? ");
		String isReady = input.nextLine();
		int response;
		int numCorrect = 0;
		if (isReady.equals("Y")) {
			System.out.print("Okay, here it comes!\n");
			System.out.print("Q1) How freaky am I on a scale of 1-10?\n\t1) 10/10\n\t2) 0/10\n\t3) 1 BILLION/10\n\n> ");
			response = input.nextInt();
			if (response == 3) {
				numCorrect ++;
				System.out.println("\nThat's right! I am the freakiest of them all!");
			} else {
				System.out.println("\nNope! You are dumb and don't use your brain at all!");
			}
			System.out.print("\nQ2) Meow meow meow meow?\n\t1) meow?\n\t2) meow!\n\n> ");
			response = input.nextInt();
			if (response == 2) {
				numCorrect ++;
				System.out.println("\nYes! I love your confidence! MEOW!");
			} else {
				System.out.println("\nWhy do you even try at this point.");
			}
			System.out.print("\nQ3) Doug Stacy is a freak!\n\t1) true\n\t2) false\n\n> ");
			response = input.nextInt();
			if (response == 1) {
				numCorrect ++;
				System.out.println("\nGOAT STATUS !!!!!");
			} else {
				System.out.println("\nAre you serious?? Doug is the freakiest!");
			}
			System.out.println("You got " + numCorrect + " correct out of 3! Wonderful!!!!!!!!");
		}
	}
}
