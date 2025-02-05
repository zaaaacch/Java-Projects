package examplelist2;
import java.util.ArrayList;
public class ExampleList2 {
	public static void main(String[] args) {
		// Declare and instantiate an ArrayList of Integers called nums
		ArrayList<Integer> nums = new ArrayList<Integer>();
		// Use a for loop to add the numbers 1 - 10 to the list
		for (int i = 1; i <= 10; i++)  {
			nums.add(i);
		}
		// Display the list
		System.out.println(nums);
		// Add the number 20 to position 5
		nums.add(5, 20);
		// Print the length of the new list
		System.out.println("The size of the list is: " + nums.size());
		// Remove the number at position 4
		nums.remove(4);
		// Add the number 12 to the end of the list
		nums.add(12);
		// Add the number 2 to the beginning of the list
		nums.add(0, 2);
		// Change the number in position 4 to 100
		nums.set(4, 100);
		// Find what number is stored in position 2
		System.out.println("The number stored in position 2 is: " + nums.get(2));
		// Amount of numbers in the list
		System.out.println("The size of the list is: " + nums.size());
		// Create list called pets to store String objects, 
		ArrayList<String> pets = new ArrayList<String>();
		// Add the Strings "cat" and "dog"
		pets.add("cat");
		pets.add("dog");
		// Display the list
		System.out.println(pets);
		// Add a fish to the front of the pet list
		pets.add(0, "fish");
		// Display list
		System.out.println(pets);
		// Print pet in position 1
		System.out.println("The pet in position 1 is: " + pets.get(1));
		// Swap cat for iguana
		pets.set(1, "iguana");
		System.out.println(pets);
		// The iguana ran away!
		pets.remove("iguana");
		// Lion added to the end
		pets.add("lion");
		// Adds a zebra, cat, and bird, to a random position within the list
		pets.add((int) (Math.random() * (pets.size() + 1)), "zebra");
		pets.add((int) (Math.random() * (pets.size() + 1)), "cat");
		pets.add((int) (Math.random() * (pets.size() + 1)), "bird");
		System.out.println(pets);
		// If the lion and zebra are adjacent, the zebra is eaten
		if (Math.abs(pets.indexOf("zebra") - pets.indexOf("lion")) == 1) {
			pets.remove("zebra");
		}
		// List the amount of animals left
		System.out.println("There are " + pets.size() + " pets left in the list");
		
	}
}
