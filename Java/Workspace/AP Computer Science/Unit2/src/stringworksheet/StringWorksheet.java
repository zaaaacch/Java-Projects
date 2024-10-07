package stringworksheet;

public class StringWorksheet {
	public static void main(String[] args) {
		
		// question 3
		
		String s1 = "Bob";
		String s2 = "Linda";
		s2 = "Linda";
		String s3 = s2.concat(s1);
		System.out.println(s3);
	
		// question 6, Bob is smaller because B is 66, and L is 76
		if(s1.compareTo(s2)==0)
			System.out.println("They are equal");
		else if(s1.compareTo(s2)<0)
			System.out.println(s1+ " is smaller");
		else
			System.out.println(s2 + " is smaller");
		
		// question 7, returns "in" because it starts at position 1 (i) and returns the letter before position 3 (n)
		s3 = s2.substring(1,3);
		System.out.println(s3);
		
		// question 8, lowercase letters have a greater value than uppercase
		
		s1 = "bob";
		s2 = "Linda";
 		
		if(s1.compareTo(s2)==0)
			System.out.println("They are equal");
		else if(s1.compareTo(s2)>0)
			System.out.println(s1 + " is bigger");
		else
			System.out.println(s2 + " is bigger");
		
		// question 9, 
		
		if(s1.compareToIgnoreCase (s2) == 0)
			System.out.println("They are equal");
		else if(s1.compareToIgnoreCase (s2) > 0)
			System.out.println(s1+ " is bigger");
		else
			System.out.println(s2+ " is bigger");
		
		// question 10
		
		s1 = "banana";
		s2 = "";
		for(int i = 0; i < s1.length(); i++)
			s2+=s1.charAt(s1.length()-i-1);
		System.out.println(s2);
		
		// question 11
		
		s2 = "fast car";
		int x = s2.indexOf('a');
		System.out.println(x);
		
		// question 12
		
		s1 = "Result";
		s1 = s1+1+2;
		System.out.println(s1);
		
		// question 13
		
		s1 = "Result";
		s1 = 1+2+s1;
		System.out.println(s1);
		
		// question 14
		
		s1 = "Result";
		s1 = s1 + (1+2);
		System.out.println(s1);
		
		// question 15
		
		s1 = "Result";
		s1 = s1 + 3*4;
		System.out.println(s1);
		
		// question 16
		
		s1 = "Result";
		s1 = 3*4 + s1;
		System.out.println(s1);
		
		// question 17
		
		s1 = "mississippi";
		s2 = "is";
		int result = s1.indexOf(s2);
		System.out.println(result);
		
		// question 18
		s1 = "ohio";
		s2 = "";
		for(int i = 0; i < s1.length(); i++) {
			s2 = s1.substring(i);
			System.out.println(s2);
		}
		
		// question 19
		
		s1 = "missouri";
		s2 = "mississippi";
		System.out.println(s2.indexOf(s1.substring(1,4)));

	}
}
