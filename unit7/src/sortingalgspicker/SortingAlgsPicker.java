package sortingalgspicker;
import java.util.Scanner;
public class SortingAlgsPicker {
	public static void main(String[] args) {
		int[] a = new int[10];
		int rand = 0;
		int pts = 0;
		String algoChoice = "";
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("Please select which sorting algorithm you would like to use:\n1\tSelection Sort\n2\tBubble Sort\n3\tInsertion Sort\n0\tQuit\n>> ");
			algoChoice = input.nextLine();
			randomizeArray(a);
			if (algoChoice.equals("1")) {
				selectionSort(a);
			} else if (algoChoice.equals("2")) {
				bubbleSort(a);
			} else if (algoChoice.equals("3")) {
				insertionSort(a);
			} else {
				break;
			}
		}
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
	
	public static void selectionSort(int[] array) {
		System.out.println("We started with the array: ");
		list(array);
		System.out.println();
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
	
	public static void bubbleSort (int[] array) {
		System.out.println("We started with the array: ");
		list(array);
		System.out.println();
		// Number in correct position
		int k = 0;
		int n = array.length;
		boolean exchangeMade = true;
		// While the numbers in the correct position are less than the length - 1, and exchangeMade
		while (k < n - 1 && exchangeMade) {
			exchangeMade = false;
			// Increment amount in correct position, because we started at 0
			k++;
			// For each j from 0 to n, array.length, - k, amount of numbers in the correct position
			for (int j = 0; j < n - k; j++) {
				if (array[j] > array[j + 1]) {
					swap(array, j, j+1);
					exchangeMade = true;
				}
			}
			System.out.println("After pass number " + k + " the array looks like ");
			list(array);
			System.out.println();
		}
	}
	
	public static void insertionSort(int[] array) {
		System.out.println("We started with the array: ");
		list(array);
		System.out.println();
		int itemToInsert;
		int j;
		boolean stillLooking;
		// Loops through the array, starting at 1
		for (int k = 1; k <= array.length - 1; k++) {
			// the item we are looking for is at the current position, k
			itemToInsert = array[k];
			// the position before the current position
			j = k - 1;
			stillLooking = true;
			// while we are looking and j is not 0 or less
			while(stillLooking && (j >= 0)) {
				// check if the current item is less than the previous
				if (itemToInsert < array[j]) {
					// swap the items
					swap(array, j, j+1);
					// decrement j to look further behind
					j--;
				}
				// if greater or at the beginning, stop swapping
				else {
					stillLooking = false;
				}
				// Moves on to the next array element
				itemToInsert = array[j+1];
			}
			System.out.println("After pass number " + k + " the array looks like ");
				list(array);
				System.out.println();
			}
		}
	}

