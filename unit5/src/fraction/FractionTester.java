package fraction;

public class FractionTester {
	public static void main(String[] args) {
		Fraction oneHalf = new Fraction(1,2);
		Fraction twoThirds = new Fraction(2, 3);
		System.out.println(oneHalf.add(twoThirds));
		System.out.println(oneHalf.subtract(twoThirds));
		System.out.println(oneHalf.multiply(twoThirds));
		System.out.println(oneHalf.divide(twoThirds));
		Fraction ans = oneHalf.add(twoThirds);
		System.out.println(ans);
	}
}
