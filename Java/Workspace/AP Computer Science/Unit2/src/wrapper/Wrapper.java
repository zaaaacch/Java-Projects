package wrapper;

public class Wrapper {

	public static void main(String[] args) {
		/* int and double are primatives
		 * ArrayLists only accept objects
		 * Integer Class and Double Class
		 * Integer(int value) constructor for the Integer class
		 * Integer.MIN_VALUE - the smallest value that an int or Integer can be
		 * 		often used when trying to find the max value from a list
		 * Integer.MAX_VALUE - the largest value that an int or Integer can be
		 * 		often used when trying to find the min value from a list
		 * int intValue();		Returns the int valueof what is stored in the object
		 */
		
		// call the Integer constructor
		Integer num1 = new Integer(157);
		System.out.println(num1);
		int num1int = num1.intValue();
		System.out.println(num1int);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE+1); // when integers overflow, they wrap around
		System.out.println(Integer.MIN_VALUE-1); // wraps to the MAX_VALUE
		
		
		Double score1 = new Double(89.45);
		System.out.println(score1);
		Double score2 = (92.38);
		System.out.println(score2);
		Double meanScore = (score1+score2)/2;
		System.out.println("The mean is " + meanScore.doubleValue());
		System.out.println("The mean is " + meanScore);
		
		/* Double and Integer both autobox and unbox
		 * 		if the compiler needs an int, it will automatically unbox an Integer
		 *		if the compiler needs a Double, it will automatically box a double
		 */

	}

}