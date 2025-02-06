package binarysearch;

public class BinarySearch {
	public static void main(String[] args) {
		int[] nums = {1, 3, 5, 7, 9, 11, 13, 15, 17};
		int lookFor = 15;
		int left = 0, right = nums.length - 1;
		display(nums, left, right);
		int foundAt = bisectionSearch(nums, lookFor);
		if (foundAt < 0)
			System.out.println("The number " + lookFor + " cannot be found");
		else
			System.out.println("The number " + lookFor + " was found at position " + foundAt);
		
	}
	
	public static void display(int[] arr, int l, int r) {
		for(int i = l; i <= r; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static int bisectionSearch(int[] arr, int find) {
		int l = 0, r = arr.length - 1;
		int mid;
		while (l <= r) {
			System.out.println("searching for " + find + ": left = " + l + " right = " + r);
			display(arr, l, r);
			mid = (l + r) / 2;
			if (arr[mid] == find)
				return mid;
			else if(arr[mid] < find)
				l = mid + 1;
			else
				r = mid - 1;
		}
		return -1;
	}
}
