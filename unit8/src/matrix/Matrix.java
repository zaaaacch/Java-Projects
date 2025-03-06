package matrix;

public class Matrix {
	
	public static void main(String[] args) {
		Matrix a = new Matrix (2, 3);
		System.out.println("a = ");
		a.display();
		System.out.println();
		Matrix b = new Matrix (2, 2);
		System.out.println("b = ");
		b.display();
		System.out.println("I can add a and b: " + a.canAdd(b));
		System.out.println();
		Matrix c = new Matrix (2, 3);
		System.out.println("c = ");
		c.display();
		System.out.println();
		if (a.canAdd(c)) {
			Matrix d = new Matrix (a.getRows(), a.getCols());
			d = a.add(c);
			System.out.println("a + c = ");
			d.display();
			System.out.println();
			Matrix e = new Matrix (a.getRows(), a.getCols());
			e = a.subtract(c);
			System.out.println("a - c = ");
			e.display();
		}
		
		System.out.println();
		
		Matrix Andrew = new Matrix(2, 3);
		System.out.println("Andrew = ");
		Andrew.display();
		System.out.println();
		
		Matrix Cooper = new Matrix(3, 2);
		System.out.println("Cooper = ");
		Cooper.display();
		System.out.println();
		
		System.out.println("I can multiply Andrew and Cooper: " + Andrew.canMultiply(Cooper));
		System.out.println();
		
		if(Andrew.canMultiply(Cooper)) {
			Matrix result = Andrew.multiply(Cooper);
			System.out.println("Andrew * Cooper = ");
			result.display();
		}
;		
		
		
	}
	
	// Matrix data storage
	private int[][] matrixData;
	
	// Constructor to create a matrix with random values
	public Matrix (int rows, int cols) {
		matrixData = new int[rows][cols];
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				matrixData[r][c] = (int) (Math.random() * 6); // Random values between 0 and 5
			}
		}
	}
	
	// Constructor to create a matrix with optional randomization
	public Matrix (int row, int col, boolean rand) {
		matrixData = new int[row][col];
		if (rand) {
			for (int r = 0; r < row; r++) {
				for (int c = 0; c < col; c++) {
					matrixData[r][c] = (int) (Math.random() * 6);
				}
			}
		}
	}
	
	
	// Returns the number of rows
	public int getRows() {
		return matrixData.length;
	}
	
	// Returns the number of columns
	public int getCols() {
		return matrixData[0].length;
	}
	
	// Returns the value at a specific row and column
	public int getEntry(int row, int col) {
		return matrixData[row][col];
	}
	
	// Sets the value at a specific row and column
	public void setEntry(int row, int col, int num) {
		matrixData[row][col] = num;
	}
	
	// Checks if two matrices can be added (must have same dimensions)
	public boolean canAdd(Matrix b) {
		return this.getRows() == b.getRows() && this.getCols() == b.getCols();
	}
	
	// Displays the matrix
	public void display() {
		for (int row = 0; row < matrixData.length; row++) {
			for (int col = 0; col < matrixData[row].length; col++) {
				System.out.print(matrixData[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	// Adds two matrices and returns the result
	public Matrix add(Matrix b) {
		Matrix newM = new Matrix(this.getRows(), this.getCols());
		for (int r = 0; r < this.getRows(); r++) {
			for (int c = 0; c < this.getCols(); c++) {
				newM.setEntry(r, c, this.getEntry(r, c) + b.getEntry(r, c));
			}
		}
		return newM;
	}
	
	// Subtracts two matrices and returns the result
	public Matrix subtract (Matrix b) {
		Matrix newM = new Matrix(this.getRows(), this.getCols());
		for (int r = 0; r < this.getRows(); r++) {
			for(int c = 0; c < this.getCols(); c++) {
				newM.setEntry(r, c, this.getEntry(r, c) - b.getEntry(r, c));
			}
		}
		return newM;
	}
	
	// Checks if two matrices can be multiplied (columns of A == rows of B)
	public boolean canMultiply(Matrix b) {
		if (this.getCols() == b.getRows()) {
			return true;
		}
		return false;
	}
	
	// Multiplies two matrices and returns the resulting matrix
	public Matrix multiply(Matrix b) {
		Matrix result = new Matrix(this.getRows(), b.getCols(), false);
		for (int row = 0; row < this.getRows(); row++) {
			for (int col = 0; col < b.getCols(); col++) {
				for (int k = 0; k < this.getCols(); k++) {
					result.setEntry(row, col, result.getEntry(row, col) + this.getEntry(row, k) * b.getEntry(k, col));
				}
				
			}
		}
		return result;
		
	}
	
	
	
}
