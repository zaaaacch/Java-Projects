package linearsearch;
import java.util.ArrayList;
public class LinearSearch {
	public static void main(String[] arg) {
		ArrayList<Integer> rand = new ArrayList<Integer>();
		for (int i = 0; i < 25; i++) {
			rand.add((int) (Math.random() * 11) + 10);
		}
		
		System.out.println(rand);
		
		System.out.println(linSearchB(rand, 15));
		
		System.out.println(linSearchFI(rand, 15));
		
		System.out.println(linSearchLI(rand, 15));
		
	}
	
	public static boolean linSearchB(ArrayList<Integer> arr, int num) {
		for (int elem: arr) {
			if (elem == num) {
				return true;
			}
		}
		return false;
	}
	
	public static int linSearchFI(ArrayList<Integer> arr, int num) {
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i) == num) {
				return i;
			}
		}
		return -1;
	}
	
	public static int linSearchLI(ArrayList<Integer> arr, int num) {
		for (int i = arr.size() - 1; i >= 0; i--) {
			if(arr.get(i) == num) {
				return i;
			}
		}
		return -1;
	}
	
	
}
