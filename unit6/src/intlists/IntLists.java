package intlists;

public class IntLists {
	public static void main(String[] args) {
		int[] randomList = new int[10];
		int[] evenList = new int[10];
		int[] oddList = new int[10];
		int[] negativeList = new int[10];
		int eLog = 0, oLog = 0, nLog = 0;

		
		for (int i = 0; i < randomList.length; i++) {
			randomList[i] = (int) (Math.random() * 41 - 20);
		}
	
		for (int elem: randomList) {
			if (elem % 2 == 0) {
				evenList[eLog] = elem;
				eLog++;
			}
			else if (elem % 2 != 0) {
				oddList[oLog] = elem;
				oLog++;
			}
			if (elem < 0) {
				negativeList[nLog] = elem;
				nLog++;
			}
		}
		
		System.out.print("The random numbers were: \n\t");
		list(randomList, 10);
		System.out.print("\nThe negative numbers were: \n\t");
		list(negativeList, nLog);
		System.out.print("\nThe even numbers were: \n\t");
		list(evenList, eLog);
		System.out.print("\nThe odd numbers were: \n\t");
		list(oddList, oLog);
		
		
	}
	
	public static void list(int[] list, int logSize) {
		for (int i = 0; i < logSize; i++) {
			System.out.print(list[i] + " ");
		}
	}
}
