package sortingalgs;

public class SortingAlgs {
	public static void main(String[] args) {
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
		}
		list(a);
		System.out.println();
		selectionSort(a);
		list(a);
	}
	
	public static void list(int[] array) {
		for (int elem: array) {
			System.out.print(elem + " ");
		}
		System.out.println();
	}
	
	public static void selectionSort(int[] array) {
		int minIndex;
		for (int i = 0; i < array.length - 1; i++) {
			// calls findMin to find the minimum index of the 
			minIndex = findMin(array, i);
			if (minIndex != i) {
				swap(array, i, minIndex);
			}
			System.out.println("After pass number " + (i + 1) + " the array is:");
			list(array);
			System.out.println();
		}
	}
	
	public static int findMin(int[] array, int first) {
		int minIndex = first;
		for (int i = first; i < array.length; i++) {
			if (array[i] < array[minIndex]) {
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	public static void swap(int[] array, int x, int y) {
		int temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}
}
