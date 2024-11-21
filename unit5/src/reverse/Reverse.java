package reverse;

public class Reverse {
	
	public static String Reverse(String str){
		int len = str.length();
		String result = "";
		for (int i = len - 1; i >= 0; i--) {
			result += str.substring(i, i+1);
		}
		return result;
	}
}
