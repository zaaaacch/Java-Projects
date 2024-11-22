package anagram;
import java.util.Scanner;
public class AnagramTester {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your first string: ");
		String str1 = input.nextLine();
		
		System.out.print("Enter your second string: ");
		String str2 = input.nextLine();
		
		if (Anagram.validAnagram(str1, str2)) {
			System.out.println(str1 + " and " + str2 + " are anagrams");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams");
		}
	}
}
