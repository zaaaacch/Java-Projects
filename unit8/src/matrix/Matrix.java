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
		
		
	}
	
	private int[][] m;
	
	public Matrix (int row, int col) {
		m = new int[row][col];
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {
				m[r][c] = (int) (Math.random() * 6);
			}
		}
	}
	
	public int getRows() {
		return m.length;
	}
	
	public int getCols() {
		return m[0].length;
	}
	
	public int getEntry(int row, int col) {
		return m[row][col];
	}
	
	public void setEntry(int row, int col, int num) {
		this.m[row][col] = num;
	}
	
	public boolean canAdd(Matrix b) {
		if (this.getRows() == b.getRows() && this.getCols() == b.getCols())
			return true;
		return false;
	}
	
	public void display() {
		for (int row = 0; row < m.length; row++) {
			for (int col = 0; col < m[row].length; col++) {
				System.out.print(m[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	public Matrix add(Matrix b) {
		Matrix newM = new Matrix(this.getRows(), this.getCols());
		for (int r = 0; r < this.getRows(); r++) {
			for (int c = 0; c < this.getCols(); c++) {
				newM.m[r][c] = this.m[r][c] + b.m[r][c];
			}
		}
		return newM;
	}
	
	public Matrix subtract (Matrix b) {
		Matrix newM = new Matrix(this.getRows(), this.getCols());
		for (int r = 0; r < this.getRows(); r++) {
			for(int c = 0; c < this.getCols(); c++) {
				newM.m[r][c] = this.m[r][c] - b.m[r][c];
			}
		}
		return newM;
	}
	
	
	
}
