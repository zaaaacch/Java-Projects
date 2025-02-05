package arraycompare;

import java.util.ArrayList;

public class ArrayCompare {
	public static void main(String[] args) {
		String[] list = new String[] {"cat", "dog", "fish", "cow"};
		display(list);
		String[] lastList = new String[list.length];
		String[] firstList = new String[list.length];
		System.out.print("\n");
		lastList = lastComesFirst(list);
		firstList = firstComesLast(list);
		display(lastList);
		display(firstList);
		
		
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("cat");
		arrList.add("dog");
		arrList.add("fish");
		arrList.add("cow");
		System.out.print("\n");
		System.out.println(arrList);
		ArrayList<String> lastArrList = new ArrayList<String>();
		ArrayList<String> newArrList = new ArrayList<String>();
		newArrList = lastComesFirst(arrList);
		System.out.println(newArrList);
		
	}
	
	public static String[] lastComesFirst(String[] arr) {
		String[] newA = new String[arr.length];
		newA[0] = arr[arr.length-1];
		for(int i = 1; i < arr.length; i++) {
			newA[i] = arr[i-1];
		}
		return newA;
	}
	
	public static String[] firstComesLast(String[] arr) {
		String[] temp = new String[arr.length];
		String last = arr[0];
		temp[arr.length - 1] = last;
		for (int i = arr.length; i < arr.length; i++) {
			arr[i] = temp[i - 1];
		}
		return temp;
	}
	
	public static ArrayList<String> lastComesFirst(ArrayList<String> arrList){
		String temp = arrList.remove(arrList.size()-1);
		arrList.add(0, temp);
		return arrList;
	}
	
	
	
	public static void display(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}
}
