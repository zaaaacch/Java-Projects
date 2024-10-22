package thing;

public class ThingTester {

	public static void main(String[] args) {
		Thing snack = new Thing("potato chip"); // creates a Thing object named "snack" and gives it myName = "potato chip"
		
		Thing favFood = new Thing("pizza"); 	// creates a Thing object named "favFood" and gives it a myName = "pizza"
		
		favFood.printMessage(); 				// Prints the name of name of favFood + "_is_great"

		Thing something = new Thing("hello"); 	// creates a Thing object named something and gives it a myName = "hello"
		
		// changes the myName of something to remove one character at random.
		String oldName = something.getName(); 	// sets oldName to the myName of something
		int len = oldName.length(); 			// gets length of oldName
		int index = (int)(Math.random()* len);	// gets a random number between 0 - length of oldName
		something.setName(oldName.substring(0,index)
				+ oldName.substring(index+1));	// sets myName of something to a section of oldName between 0 and index 
												// concatenated with oldName index+1, removing one letter
		
		System.out.println(something.getName()); // prints something's name
	}

}
