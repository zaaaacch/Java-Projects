package rectangle;

public class RectangleTester {
	public static void main(String[] args)
	{
		// Creates new Rectangle object called r1 with values of length: 3 and width: 6
		Rectangle r1 = new Rectangle(3,6);
		System.out.println(r1.getLength());
		System.out.println(r1.toString());
		r1.setLength(4);
		System.out.println(r1.getLength());
		System.out.println(r1.toString());
	}
}
