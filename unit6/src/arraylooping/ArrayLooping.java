package arraylooping;

public class ArrayLooping {
	public static void main(String[] args) {
		int size = 10;
		// Creates an array of 10 integers
		int[] nums = new int[size];
		// Loops to generate 10 random integers between 1-10
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 10 + 1);
		}
		list(nums);
		System.out.println(sumArray(nums));
		System.out.println(findNum(nums, 5));
	}
	
	// sumArray method that prints the sum of all numbers within array
	public static int sumArray(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}
	// list method that prints all numbers of the array
	public static void list(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i] + " ");
		}
	}
	// findNum method that returns a boolean based on if a number is in the random array
	public static boolean findNum(int[] nums, int find) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == find) {
				return true;
			}
		}
		return false;
	}
}
