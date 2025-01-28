package scramble;
import java.util.Scanner;
public class Scramble {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word;
		while (true) {
			System.out.print("Please enter a word to scramble or 1 to quit. >> ");
			word = input.nextLine();
			if(word.equals("1")) break;
			String newWord = mixLetters(word);
			System.out.println("The word " + word + " scambles to " + newWord + ".\n");
		}
		System.out.println("\nThank you for playing Scramble.");
		input.close();
	}
	
	
	public static String mixLetters(String temp) {
		String first = "";
		String mid = "";
		String last = "";
		int divisor = temp.length() / 3;
		if (temp.length() % 3 == 0) {
			first = temp.substring(0, divisor);
			mid = temp.substring(divisor, divisor * 2);
			last = temp.substring(divisor*2);
		} else if (temp.length() % 3 == 1) { 
			first = temp.substring(0, divisor);
			mid = temp.substring(divisor, divisor * 2 + 1);
			last = temp.substring(divisor*2 + 1);
		} else if (temp.length() % 3 == 2) {
			first = temp.substring(0, divisor + 1);
			mid = temp.substring(divisor + 1, divisor * 2 + 2);
			last = temp.substring(divisor*2 + 2);
		}
		return mid + first + last;
	}
}
