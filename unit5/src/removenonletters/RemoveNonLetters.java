package removenonletters;

public class RemoveNonLetters {
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
