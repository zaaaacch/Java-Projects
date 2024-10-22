package commonshapes;
import java.util.Scanner;
import static java.lang.Math.*;
public class CommonShapes {
	public static void main(String[] args)
	{
		double rad, dia, circ, area, vol, surfArea;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a radius >> ");
		rad = input.nextDouble();
		input.close();
		dia = 2 * rad;
		circ = (2*PI) * rad;
		area = PI * (pow(rad, 2));
		vol = (4./3 * PI) * (pow(rad,3));
		surfArea = (4. * PI) * (pow(rad,2));
		System.out.println("\nWith a given radius of " + rad + "\n\nDiameter\t=\t" + dia + "\nCircumference\t=\t" + circ + "\nArea\t\t=\t" + area + "\nVolume\t\t=\t" + vol + "\nSurface Area\t=\t" + surfArea);
	}
}
