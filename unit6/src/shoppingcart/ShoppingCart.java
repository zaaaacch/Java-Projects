package shoppingcart;

public class ShoppingCart {
	// a method to list the cost of elements in the cart
	public static void list(double[] a, int size) {
		for (int i = 0; i < size; i++) {
			System.out.println(a[i]);
		}
	}
	
	// a method to compute the total of all items in the cart
	public static double total(double[] a, int logicalSize) {
		double sum = 0;
		for (int i = 0; i < logicalSize; i++) {
			sum += a[i];
		}
		return sum;
	}
	// a method to compute the total with 5% tax
	public static double withTax(double[] a, int logicalSize) {
		double total = total(a, logicalSize);
		total *= 1.05;
		return total;
	}

	// a method to insert values into a specific location in an array, returns true if item was inserted, false if not
	public static boolean insertValue(double[] a, int logicalSize, int loc, double value) {
		// if location is out of logicalSize or value is less than 0, do nothing
		if (loc >= logicalSize || value < 0.0) {
			return false;
		} else {
			// creates variable val, which is initially equal to value
			double val = value;
			for (int i = loc; i < logicalSize + 1; i++) {
				// creates a variable curr, which is equal to the current position
				double curr = a[i];
				// updates the current location to val
				a[i] = val;
				// updates val to be equal to curr, carrying the current value to the next position
				val = curr;
			}
			a[loc] = value;
			return true;
		}
	}
//	// a void method to remove values from a specific location in an array
//	public static void removeValue(double[] a, int logicalSize, int loc) {
//		
//	}
//	// a method to remove a specific value from an array, returns true if removed, false if could not be found
//	public static boolean removeValue(double[] a, int logicalSize, double value) {
//		
//	}
//	
}
