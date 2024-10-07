package videogames;

public class VideoGames {
	public static double monthlyPrice(int numPop, int numOld) {
		return numPop*3.00 + numOld*1.50;
	}
	
	public static double annualPrice(int numPop, int numOld) {
		return monthlyPrice(numPop,numOld) * 12;
	}
}
	