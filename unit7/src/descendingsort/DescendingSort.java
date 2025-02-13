package descendingsort;

public class DescendingSort {
	public static void main(String[] args) {
		int[] nums = new int[10];
		randomizeArray(nums);
		descendingBubble(nums);
		
		
	}
	
	public static void randomizeArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
		}
	}
	
	public static void list(int[] array) {
		for (int elem: array) {
			System.out.print(elem + " ");
		}
		System.out.println();
	}
	
	public static void descendingBubble(int[] a) {
		int k = 0;
		int temp;
		boolean exchangeMade = true;
		while((k < a.length - 1) && exchangeMade) {
			exchangeMade = false;
			k++;
			for (int j = 0; j < a.length - k; j++) {
				if (a[j] < a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					exchangeMade = true;
				}
			}
		list(a);
		}
	}
	
}
