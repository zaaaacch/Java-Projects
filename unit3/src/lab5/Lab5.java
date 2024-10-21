package lab5;
import java.util.Scanner;
public class Lab5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Would you like to rent a car?\nEnter Y for Yes or N for No >> ");
		String wantToRent = input.nextLine();
		String sizeVehicle, hasCoupon;
		int daysRent;
		double compactPrice = 30.50;
		double fullPrice = 40.50;
		if (wantToRent.equals("Y")) {
			System.out.print("How many days will you need your car? >> ");
			daysRent = input.nextInt();
			input.nextLine();
			System.out.print("Would you like a compact or full size vehicle?\nEnter C for compact or F for full-size. >> ");
			sizeVehicle = input.nextLine();
			System.out.print("Do you have a coupon?\nEnter Y for Yes or N for No. >> ");
			hasCoupon = input.nextLine();
			if(sizeVehicle.equals("C")) {
				System.out.println("You have requested a compact car for " + daysRent + " day(s).");
				if(hasCoupon.equals("Y")) {
					System.out.println("You have a coupon.");
					System.out.println("Your total cost will be $" + compactPrice*0.93*daysRent);
				} else {
					System.out.println("You do not have a coupon.");
					System.out.println("Your total cost will be $" + compactPrice*daysRent);
				};
			} else {
				System.out.println("You have requested a full-size car for " + daysRent + " day(s).");
				if(hasCoupon.equals("Y")) {
					System.out.println("You have a coupon.");
					System.out.println("Your total cost will be $" + fullPrice*0.93*daysRent);
				} else {
					System.out.println("You do not have a coupon.");
					System.out.println("Your total cost will be $" + fullPrice*daysRent);
				};
			};
		} else {
			System.out.print("If you change your mind, please come back. Goodbye");
		}
		input.close();
	}
}
