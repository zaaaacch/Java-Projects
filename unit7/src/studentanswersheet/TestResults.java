package studentanswersheet;
import java.util.ArrayList;

public class TestResults 
{
   private ArrayList <StudentAnswerSheet> sheets;
   
   public TestResults(ArrayList <StudentAnswerSheet> s)
   {
	   sheets = s;
   }
   
   public String highestScoringStudent (ArrayList <String> key)
   {
	   String highName = "";
	   double highScore = 0;
	   for (int i = 0; i < sheets.size(); i++) {
		   if (sheets.get(i).getScore(key) > highScore) {
			   highName = sheets.get(i).getName();
			   highScore = sheets.get(i).getScore(key);
		   }
	   }
	   return highName;
	   
   }
}

