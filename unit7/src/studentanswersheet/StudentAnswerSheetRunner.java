package studentanswersheet;
import java.util.ArrayList;

public class StudentAnswerSheetRunner
{

	public static void main(String[] args) 
	{
		ArrayList <String> key = new ArrayList <String> ();
		key.add("A");		key.add("C");		key.add("D");
		key.add("E");		key.add("B");		key.add("C");
		key.add("E");		key.add("B");		key.add("B");
		key.add("C");
		
		ArrayList <String> answers1 = new ArrayList <String> ();
		answers1.add("A");		answers1.add("B");		answers1.add("D");
		answers1.add("E");		answers1.add("A");		answers1.add("C");
		answers1.add("?");		answers1.add("B");		answers1.add("D");
		answers1.add("C");
		StudentAnswerSheet sheet1 = new StudentAnswerSheet("Debbie", answers1);
		
		ArrayList <String> answers2 = new ArrayList <String> ();
		answers2.add("A");		answers2.add("B");		answers2.add("?");
		answers2.add("A");		answers2.add("B");		answers2.add("E");
		answers2.add("D");		answers2.add("D");		answers2.add("C");
		answers2.add("C");
		StudentAnswerSheet sheet2 = new StudentAnswerSheet("Doug", answers2);
		
		ArrayList <String> answers3 = new ArrayList <String> ();
		answers3.add("A");		answers3.add("B");		answers3.add("C");
		answers3.add("D");		answers3.add("E");		answers3.add("E");
		answers3.add("D");		answers3.add("B");		answers3.add("C");
		answers3.add("A");
		StudentAnswerSheet sheet3 = new StudentAnswerSheet("Melissa", answers3);
		
		ArrayList <String> answers4 = new ArrayList <String> ();
		answers4.add("A");		answers4.add("B");		answers4.add("D");
		answers4.add("E");		answers4.add("B");		answers4.add("C");
		answers4.add("E");		answers4.add("B");		answers4.add("C");
		answers4.add("A");
		StudentAnswerSheet sheet4 = new StudentAnswerSheet("Samantha", answers4);
		
		ArrayList <StudentAnswerSheet> s = new ArrayList <StudentAnswerSheet> ();
		s.add(sheet1);	
		s.add(sheet2);		
		s.add(sheet3);		
		s.add(sheet4);
		
		// make sure code form part a works properly
		double score;
		String name;
	    for(StudentAnswerSheet element : s)
	    {
	        score = element.getScore(key);
		    name = element.getName();
		    System.out.println(name + " got a score of " + score);
	    }   
	    
	    // make sure code from part b works properly
	    TestResults results = new TestResults(s);
	    name = results.highestScoringStudent(key);
	    System.out.println("the highest scoring student is " + name);
	      

	}

}
