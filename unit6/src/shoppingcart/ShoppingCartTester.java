package shoppingcart;

public class ShoppingCartTester {
	public static void main(String[] args) {
		final int MAX_SIZE = 10;
		double[] cart = new double[MAX_SIZE];
		int logicalSize = 0;
		cart[0] = 10.00; cart[1] = 20.00; cart[2] = 30.00; cart[3] = 40.00; cart[4] = 50.00; cart[5] = 60.00;
		logicalSize = 6;
		System.out.println("There is/are " + logicalSize + " item(s) in your cart");
		ShoppingCart.list(cart, logicalSize);
		System.out.printf("The total cost of your items is $%.2f \n\n", ShoppingCart.total(cart, logicalSize));
		System.out.printf("With 5 percent tax added the total cost is $%.2f\n\n", ShoppingCart.withTax(cart, logicalSize));
		ShoppingCart.insertValue(cart, logicalSize, 4, 43.95);
		logicalSize++;
		System.out.printf("Inserted an item at position 4 that costs $43.95\n");
		ShoppingCart.list(cart, logicalSize);
		System.out.print("\n");
		System.out.print("Removed the value at position 3\n");
		ShoppingCart.removeValue(cart, logicalSize, 3);
		logicalSize--;
		ShoppingCart.list(cart, logicalSize);
		System.out.print("\n");
		System.out.print("Removed the value 20.00\n");
		ShoppingCart.removeValue(cart, logicalSize, 20.00);
		logicalSize--;
		ShoppingCart.list(cart, logicalSize);
		
		
		
	}
}
