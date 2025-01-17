package averagedoubles;

public class AverageDoubles {
	public static void main(String[] args) {
		double[] randomList = new double[10];
		double[] greaterList = new double[10];
		int gLog = 0;
		for (int i = 0; i < randomList.length; i++) {
			randomList[i] = Math.random() * 20;
		}
		
		for(int i = 0; i < randomList.length; i++) {
			if (randomList[i] > avg(randomList, 10)) {
				greaterList[gLog] = randomList[i];
				gLog++;
			}
		}
		
		System.out.print("The numbers were:\n\t");
		list(randomList, 10);
		System.out.print("\nThe average is " + avg(randomList, 10));
		System.out.print("\nThe number greater than the average are: \n\t");
		list(greaterList, gLog);
		
		
		
	}
	
	public static void list(double[] list, int logSize) {
		for (int i = 0; i < logSize; i++) {
			System.out.printf("%8.4f ", list[i]);
		}
	}
	
	public static double avg(double[] list, int logSize) {
		double sum = 0;
		for (double elem: list) {
			sum += elem;
		}
		return sum / logSize;
	}
}
