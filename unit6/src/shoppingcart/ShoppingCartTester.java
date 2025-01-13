package shoppingcart;

public class ShoppingCartTester {
	public static void main(String[] args) {
		final int MAX_SIZE = 10;
		double[] cart = new double[MAX_SIZE];
		int logicalSize = 0;
		cart[0] = 1; cart[1] = 2; cart[2] = 3; cart[3] = 4; cart[4] = 5; cart[5] = 6;
		logicalSize = 6;
		System.out.println("There is/are " + logicalSize + " item(s) in your cart");
		ShoppingCart.list(cart, logicalSize);
		System.out.printf("The total cost of your items is $%.2f \n\n", ShoppingCart.total(cart, logicalSize));
		System.out.printf("With 5 percent tax added the total cost is $%.2f\n\n", ShoppingCart.withTax(cart, logicalSize));
		ShoppingCart.insertValue(cart, logicalSize, 3, 333);
		logicalSize++;
		ShoppingCart.list(cart, logicalSize);
	}
}
