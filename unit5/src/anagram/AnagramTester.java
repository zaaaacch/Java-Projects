package anagram;

public class AnagramTester {
	public static void main(String[] args) {
		String str1 = "silent";
		String str2 = "lis ten";
		System.out.println(Anagram.validAnagram(str1, str2));
	}
}
