package frq;

public class FRQ {
	
	public static void longestStreak(String str)
	{
		int longStreak = 1;
		char longLetter = str.charAt(0);
		int currentStreak = 1;
		char currentLetter = str.charAt(0);
		for (int i = 1; i < str.length(); i++)
		{
			if (str.charAt(i) == currentLetter)
			{
				currentStreak++;
			}
			else
			{
				currentLetter = str.charAt(i);
				currentStreak = 1;
			}
			if (currentStreak > longStreak)
			{
				longStreak = currentStreak;
				longLetter = currentLetter;
			}
		}
		System.out.print(longStreak + " " + longLetter);
	}
}