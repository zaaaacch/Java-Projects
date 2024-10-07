package cube;
import java.util.Scanner;
public class CubeSurfAreaTester {
	public static void main(String[] args) {
		int side;
		System.out.print("Please enter the length of the side of your cube >> ");
		Scanner keyboard = new Scanner(System.in);
		side = keyboard.nextInt();
		keyboard.close();
		System.out.println("For a cube with a side length of " + side + ", the surface area is " + CubeSurfArea.getSurfaceArea(side) + ".");
	}

}
