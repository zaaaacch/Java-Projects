package rectangle;

public class RectangleTester {
	public static void main(String[] args)
	{
		// Creates new Rectangle object called r1 with values of length: 3 and width: 6
		Rectangle r1 = new Rectangle(3,6);
		// Creates new Rectangle object called r2 with default constructor, length: 1 and width: 1
		Rectangle r2 = new Rectangle();
		// Prints the size of each rectangle
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		// Gets and prints the area of r2
		System.out.println("The area for r2 is: " + r2.getArea());
		// Sets r1's dimensions to 5 by 5, then prints area and perimeter
		r1.setDims(5,5);
		System.out.println("The area for r1 is: " + r1.getArea() + "\nThe perimeter for r1 is: " + r1.getPerimeter());
		// Sets r2's length to 7, then prints area and perimeter
		r2.setLength(7);
		System.out.println("The area for r2 is: " + r2.getArea() + "\nThe perimeter for r2 is: " + r2.getPerimeter());
		
	}
}
