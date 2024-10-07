package circle;

public class CircleTester {

	public static void main(String[] args) {
		
		// creates circle 1, uses default constructor
		Circle c1 = new Circle();
		
		//creates circle 2, uses 4 as radius
		Circle c2 = new Circle(28);
		
		// calculates the area and circumference of c1, using 1 from the default operator as radius
		System.out.println("The area of c1 is " + c1.area());
		System.out.println("The area of c1 is " + c1.circumference());
		
		// calculates the area and circumference of c2, using 4 as radius
		System.out.println("The area of c2 is " + c2.area());
		System.out.println("The area of c2 is " + c2.circumference());
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
