package testavg;
import java.util.Scanner;
public class TestAvg {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter max score >> ");
		int max = input.nextInt();
		System.out.print("Enter min score >> ");
		int min = input.nextInt();
		System.out.print("Enter amount of scores >> ");
		int amt = input.nextInt();
		int[] scores = new int[amt];
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			scores[i] = (int) (Math.random() * (max - min + 1) + min);
			sum += scores[i];
		}
		list(scores);
		System.out.println((double) sum / scores.length);
	}
	
	public static void list(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i] + " ");
		}
	}
}
