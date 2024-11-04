package luckysevens;
import java.util.Scanner;
public class LuckySevens {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("How many dollars do you have? ");
		int userMoney = in.nextInt();
		int rolls = 0;
		int maxMoney = userMoney;
		int maxCount = 0;
		while (userMoney > 0) {
			rolls++;
			int dice1 = (int) (Math.random() * 6 + 1);
			int dice2 = (int) (Math.random() * 6 + 1);
			if (dice1 + dice2 == 7) {
				userMoney += 4;
				if (userMoney > maxMoney) {
					maxMoney = userMoney;
					maxCount = rolls;
				}
			} else {
				userMoney -= 1;
			}
		}
		System.out.println("You are broke after " + rolls + " rolls.");
		System.out.print("You should have quit after " + maxCount + " rolls when you had $" + maxMoney);
	}
}
