package examplelist;
import java.util.ArrayList;
public class ExampleList {
	public static void main(String[] args) {
		// Creates an ArrayList that holds Integer objects
		ArrayList<Integer> list = new ArrayList<Integer>();
		// Loops through 1-10, adds the value of i to the end of list
		for (int i  = 1; i < 10; i++) {
			list.add(i);
		}
		// ArrayList has a dedicated toString to print its values
		System.out.println(list);
		
		// Prints the value located at position 1
		System.out.println(list.get(1));
		
		// Loops through each position in the ArrayList, multiplies each value by two
		for (int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i) * 2);
		}
		
		System.out.println(list);
	}
}
