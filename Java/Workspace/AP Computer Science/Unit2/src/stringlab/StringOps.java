package stringlab;

public class StringOps {
	public static String awesomeness(String name) {
		return "I know " + name + " is awesome.";
	}
	
	public static int indexFirstSpace(String name) {
		return name.indexOf(" ");
	}
	
	public static int indexSecondSpace(String name) {
		return name.indexOf(" ", + name.indexOf(" ") + 1);
	}
	
	public static String firstName(String name) {
		int first = indexFirstSpace(name);
		return name.substring(0, first);
	}
	
	public static String lastName(String name) {
		int second = indexSecondSpace(name);
		return name.substring(second + 1);
	}
	
	public static String middleName(String name) {
		int first = indexFirstSpace(name);
		int second = indexSecondSpace(name);
		return name.substring(first + 1, second);
	}
	
	public static String lastFirstMidInitial(String name) {
		String initial = middleName(name).substring(0,1);
		return lastName(name) + ", " + firstName(name) + ", " + initial;
	}
	
	public static String firstNamePigLatin(String name) {
		int first = indexFirstSpace(name);
		String firstLetter = name.substring(0,1);
		String restName = name.substring(1, first);
		return restName + firstLetter + "ay";
		
	}
}
