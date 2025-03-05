package matrixpractice;

public class MatrixPractice {
	public static void main(String[] args) {
		int[][] mat = new int[4][8];
		
		for (int r = 0; r < mat.length; r++) {
			System.out.println();
			for (int c = 0; c < mat[r].length; c++) {
				mat[r][c] = r * c + c / 2 + r * (c + 1);
				System.out.print(mat[r][c] + "\t");
			}
		}
	}
}
