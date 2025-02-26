package studentanswersheet;
import java.util.ArrayList;

public class StudentAnswerSheet 
{
   private ArrayList <String> answers;
   private String name;
   
   public StudentAnswerSheet(String studentName, ArrayList <String> sheet)
   {
	   name = studentName;
	   answers = sheet;
   }
   
   public double getScore(ArrayList <String> key)
   {
	   double score = 0;
	   for (int i = 0; i < answers.size(); i++) {
		   if (answers.get(i).equals("?"));
		   else if (answers.get(i).equals(key.get(i))) {
			   score++;
		   }
		   else {
			   score -= 0.25;
		   }
	   }
	   return score;
   }
   
   public String getName()
   {
	   return name;
   }
} 

