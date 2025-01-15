package enhanced;
import java.util.Scanner;
public class Enhanced {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of the array >> ");
		int size = input.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = (int) (Math.random() * 10) + 1;
		}
		list(nums);
		System.out.println("\nThe sum of the numbers is: " + sumE(nums));
		System.out.print("Does the array contain >> ");
		int contains = input.nextInt();
		System.out.println(containsE(nums, contains));
		System.out.print("How many times does this number appear >> ");
		int count = input.nextInt();
		System.out.print(countNumE(nums, count));
		System.out.print("\nWhat is the first location of this number >> ");
		int locationFind = input.nextInt();
		System.out.print(firstLocE(nums, count));
		input.close();
	}
	

	public static void list(int[] nums) {
		for (int elem: nums) {
			System.out.print(elem + " ");
		}
	}
	
	public static int sumE(int[] nums) {
		int sum = 0;
		for (int elem: nums) {
			sum+= elem;
		}
		return sum;
	}
	
	public static boolean containsE(int[] nums, int a) {
		for (int elem: nums) {
			if (elem == a) {
				return true;
			}
		}
		return false;
	}
	
	public static int countNumE(int[] nums, int a) {
		int amt = 0;
		for(int elem: nums) {
			if (elem == a) {
				amt++;
			}
		}
		return amt;
	}
	
	public static int firstLocE(int[] nums, int a) {
		int loc = 0;
		for (int elem: nums) {
			if (a == elem) {
				return loc;
			}
			loc++;
		}
		return -1;
	}
	
}
