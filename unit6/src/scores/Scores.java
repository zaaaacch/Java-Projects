package scores;

public class Scores {
	public static void main(String[] args) {
		int[] scores = new int[3];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = (int) (Math.random() * 36) + 65;
			System.out.println(scores[i]);
		}
	}
}
