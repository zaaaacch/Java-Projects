package binaryinsertion;

public class BinaryInsertion {
	public static void main(String[] args) {
		Integer[] list = {2, 15, 61, 11, 7, 9, 3};
		for(int i = 1; i < list.length; i++) {
			int bot = 0, top = i-1;
			while (bot <= top) {
				int mid = (bot + top) / 2;
				if (list[mid].compareTo(list[i]) < 0) {
					bot = mid+1;
				}
				else {
					top = mid-1;
				}
			}
			
			Integer temp = list[i];
			for (int j=i; j > bot; j--) {
				list[j] = list[j-1];
			}
			list[bot] = temp;
			
			System.out.print("Pass " + i + ": ");
			for(int x = 0; x < list.length; x++) {
				System.out.print(list[x] + " ");
			}
			System.out.println();
		}
		
	}
}
