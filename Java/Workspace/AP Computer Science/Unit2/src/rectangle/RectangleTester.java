package rectangle;
import java.util.Scanner;
public class RectangleTester {
	public static void main(String[] args) {
		System.out.print("Please enter the length of the side of your rectangle >> ");
		Scanner keyboard = new Scanner(System.in);
		double length = keyboard.nextInt();
		System.out.print("Please enter the width of the side of your rectangle >> ");
		double width = keyboard.nextInt();
		keyboard.close();
		System.out.println("For a rectangle with sides " + length + " and " + width + " the perimeter is " + Rectangle.getPerimeter(length,width));
		System.out.println("For a rectangle with sides " + length + " and " + width + " the area is " + Rectangle.getArea(length,width));
	}
}
