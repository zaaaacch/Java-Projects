package righttriangle;

public class RightTriangleTester {
	public static void main(String[] args) {
		
		// created a right triangle object using default constructor, named t1
		RightTriangle t1 = new RightTriangle();
		System.out.println("The hypotenuse is: " + t1.hypotenuse());
		System.out.println("The area is: " + t1.area());
		System.out.println("The perimeter is: " + t1.perimeter());
		
		RightTriangle t2 = new RightTriangle(2, 3);
		System.out.println("The hypotenuse is: " + t2.hypotenuse());
		System.out.println("The area is: " + t2.area());
		System.out.println("The perimeter is: " + t2.perimeter());
		System.out.println("Side 1 is " + t2.side1() + " and side 2 is " + t2.side2());
	}
}
