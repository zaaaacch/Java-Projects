package frq;

public class FRQ {
	
	public static void longestStreak(String str)
	{
		int length = str.length();
		String longLetter = "";
		int longStreak = 1;
		for (int i = 0; i < length - 1; i++)
		{
			int currentStreak = 1;
			String letter = str.substring(i, i+1);
			String nextLetter = str.substring(i+1, i+2);
			while (i + 1 < length && letter.equals(nextLetter))
			{
				currentStreak++;
				i++;
				if (i + 1 < length)
				{
					nextLetter = str.substring(i+1, i+2);
				}
			}
			if (currentStreak > longStreak) 
			{
				longStreak = currentStreak;
				longLetter = letter;
			}
		}
		System.out.print(longStreak + " " + longLetter);
	}
}
