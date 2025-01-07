package scores;
public class Scores {
	public static void main(String[] args) {
		int[] scores = new int[3];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = (int) (Math.random() * 36) + 65;
		}
		list(scores);
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println((double) sum / scores.length);
	}
	
	public static void list(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
