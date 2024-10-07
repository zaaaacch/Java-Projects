package righttriangle;

public class RightTriangle {
	// instance variables
	private int side1;
	private int side2;
	
	// constructors
	// default constructor
	public RightTriangle() {
		side1 = 1;
		side2 = 1;
	}
	// constructor for both lengths
	public RightTriangle(int side1, int side2) {
		this.side1 = side1;
		this.side2= side2;
		// "this." tells the computer to use the instance variable when the names are the same
	}
	
	// prints side1 saved
	public int side1() {
		return side1;
	}
	
	// prints side2 saved
	public int side2() {
		return side2;
	}
	
	// hypotenuse method
	public double hypotenuse() {
		return Math.sqrt(side1 * side1 + side2 * side2);
	}
	
	// perimeter method
	public double perimeter() {
		return side1 + side2 + hypotenuse();
	}
	
	// area method
	public double area() {
		return 0.5*side1*side2;
	}
}
