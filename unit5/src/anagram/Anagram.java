package anagram;

public class Anagram {
	public static boolean validAnagram(String str1, String str2) {
		// Creates Strings that have no nonLetters
		String noSpaceStr1 = nonLetters(str1);
		String noSpaceStr2 = nonLetters(str2);
		
		// Returns false if the length of str1 and str2 are different
		if (noSpaceStr1.length() != noSpaceStr2.length()) {
			return false;
		}
		// Iterates through each letter and checks occurrences
		for (int i = 0; i < noSpaceStr1.length(); i++) {
			char currentChar = noSpaceStr1.charAt(i);
			
			// Calls countOccurences
			int countInStr1 = countOccurrences(noSpaceStr1, currentChar);
			int countInStr2 = countOccurrences(noSpaceStr2, currentChar);
			noSpaceStr1 = removeLetter(noSpaceStr1, currentChar);
			noSpaceStr2 = removeLetter(noSpaceStr2, currentChar);
			// Returns false if the amount of occurrence of the letters are different
			if (countInStr1 != countInStr2) {
				return false;
			}
		}
		// Returns true if the loop runs completely through, meaning each letter occurred the same amount of times
		return true;
	}
	
	// Creates a method that increments count for the amount of cha
	public static int countOccurrences(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
			
		}
		return count;
	}
	
	// Creates a method that returns a string without any nonletter characters
	public static String nonLetters(String str) {
		int len = str.length();
		String result = "";
		for (int i = 0; i < len; i++) {
			String letter = str.substring(i, i+1);
			if (letter.compareTo("a") >= 0 && letter.compareTo("z") <= 0) {
				result += str.substring(i, i+1);
			}
		}
		return result;
	}
	
	public static String removeLetter(String str, char ch) {
		return str.replace(String.valueOf(ch), "");
	}
}
