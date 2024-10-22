package circle;

public class Circle {
	
	// instance variables
	private double radius;
	
	
	// default constructor, no variables passed in
	public Circle() {
		radius = 1.0;
	}
	
	// constructor for one variable passed in
	public Circle(double r) {
		radius = r;
	}
	
	// method for calculating area
	public double area() {
		return Math.pow(radius, 2) * Math.PI;
	}
	
	// method for calculating circumference
	public double circumference() {
		return Math.PI * 2 * radius;
	}
	
	public String toString() {
		String ans = "This circle has a radius of " + radius + ", an area of " + area() + ", and a circumference of " + circumference();
		return ans;
	}
}
