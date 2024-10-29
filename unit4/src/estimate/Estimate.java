package estimate;

public class Estimate {
	public static void main(String[] args) {


		// Using 7 terms, estimates the value of Pi

		/* int terms = 7;
		int count = 1;
		double est = 0.0;
		while (count <= terms) {
			if (count % 2 == 0) {
				est = est - 1. / (2 * count - 1);
			} else {
				est = est + 1. / (2 * count - 1);
			}
			count++;
		}
		est *= 4;
		System.out.println(est);
		double offBy = Math.abs(Math.PI - est);
		System.out.println("That is off by " + offBy + ".");
		*/

		// Estimates the value of Pi and finds the amount of terms needed to get close enough

		int terms = 1;
		double est = 0.0;
		double tol = 0.00001;
		int count = 1;
		while (Math.abs(Math.PI-est * 4) >= tol) {
			if (count % 2 == 0) {
				est = est - 1. / (2 * count - 1);
			} else {
				est = est + 1. / (2 * count - 1);
			}
			count++;
			terms++;
		}
		est *= 4;
		System.out.println(est);
		double offBy = Math.abs(Math.PI - est);
		System.out.println("That is off by " + offBy + ".");
		System.out.println("There were " + terms + " terms.");
	}
}

