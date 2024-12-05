package fraction;

public class Fraction {
	// Instance variables
	private int num, den;
	
	// Constructor
	public Fraction(int num, int den) {
		this.num = num;
		this.den = den;
	}
	// Default constructor
	public Fraction() {
		this(1, 1);
	}
	
	// Getter methods
	public int getNumerator() {
		return num;
	}
	
	public int getDenominator() {
		return den;
	}
	
	public Fraction add(Fraction f) {
		int num = (this.num * f.den) + (f.num * den);
		int den = this.den * f.den;
		return new Fraction(num, den);
	}
	
	public Fraction subtract(Fraction f) {
		int num = (this.num * f.den) - (f.num * this.den);
		int den = this.den * f.den;	
		return new Fraction(num, den);
	}
	
	public Fraction multiply(Fraction f) {
		int num = this.num * f.num;
		int den = this.den * f.den;
		return new Fraction(num, den);
	}
	
	public Fraction divide(Fraction f) {
		int num = this.num * f.den;
		int den = this.den * f.num;
		return new Fraction(num, den);
	}
	
	// toString() method
	public String toString() {
		return num + "/" + den;
	}
}
