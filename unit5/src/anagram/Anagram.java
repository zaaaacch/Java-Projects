package anagram;

public class Anagram {
	public static boolean validAnagram(String str1, String str2) {
		// Returns false if the length of str1 and str2 are not equal
		String noSpaceStr1 = nonLetters(str1);
		String noSpaceStr2 = nonLetters(str2);
		if (noSpaceStr1.length() != noSpaceStr2.length()) {
			return false;
		}
		for (int i = 0; i < noSpaceStr1.length(); i++) {
			char currentChar = noSpaceStr1.charAt(i);
			
			int countInStr1 = countOccurences(noSpaceStr1, currentChar);
			int countInStr2 = countOccurences(noSpaceStr2, currentChar);
			
			if (countInStr1 != countInStr2) {
				return false;
			}
		}
		return true;
	}
	
	public static int countOccurences(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}
	
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

}