package twodarrays;

public class TwoDArrays {
	
	public static void main(String[] args) {
		int size = 3;
		TwoDArrays arr1 = new TwoDArrays(size);
		arr1.display();
		System.out.println(arr1.sumAll());
		int[] colSums = arr1.sumCol();
		System.out.println("The column sums are: ");
		for (int colSum: colSums) {
			System.out.println(colSum + " ");
		}
		System.out.println();
		arr1.sumRow();
		System.out.println("The sum of the entries on the main diagonal is " + arr1.sumMain());
		System.out.println("The sum of the entries on the off diagonal is " + arr1.sumOff());
		
		
	}
	
	private int[][] arr;
	
	public TwoDArrays(int n) {
		arr = new int[n][n];
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				arr[row][col] = (int) (Math.random() * 5) + 1;
			}
		}
	}
	
	public void display() {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	public int sumAll() {
		int sum = 0;
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				sum += arr[row][col];
			}
		}
		return sum;
	}
	
	public int[] sumCol() {
		int[] results = new int[arr.length];
		for (int c = 0; c < arr[0].length; c++) {
			for (int r = 0; r < arr.length; r++) {
				results[c] += arr[r][c];
			}
		}
		return results;
	}
	
	public void sumRow() {
		System.out.println("The row sums are:");
		for (int row = 0; row < arr.length; row++) {
			int sum = 0;
			for (int col = 0; col < arr[row].length; col++) {
				sum += arr[row][col];
			}
			System.out.println(sum);
		}
	}
	
	public int sumMain() {
		int sum = 0;
		for (int row = 0; row < arr.length; row++) {
			for (int col = row; col < arr[0].length; col++) {
				if (col == row) {
					sum += arr[row][col];
				}
			}
		}
		return sum;
	}
	
	public int sumOff() {
		int sum = 0;
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				if (row + col == arr.length - 1) {
					sum += arr[row][col];
				}
			}
		}
		return sum;
	}
	
	
}
