package student;

public class Student {
	// Instance variables
	private String StudentName;
	private int TestScore1, TestScore2, TestScore3;
	// Default constructor
	public Student() {
		StudentName = "";
		TestScore1 = 0;
		TestScore2 = 0;
		TestScore3 = 0;
	}
	// Constructor for name and test scores
	public Student(String nm, int t1, int t2, int t3) {
		StudentName = nm;
		TestScore1 = t1;
		TestScore2 = t2;
		TestScore3 = t3;
	}
	// Constructor to copy a passed in student object
	public Student(Student s) {
		StudentName = s.StudentName;
		TestScore1 = s.TestScore1;
		TestScore2 = s.TestScore2;
		TestScore3 = s.TestScore3;
	}
	// Getter methods
	public String getName() {
		return StudentName;
	}
	public int getScore(int tNum) {
		if (tNum == 1) {
			return TestScore1;
		}
		if (tNum == 2) {
			return TestScore2;
		}
		if (tNum == 3) {
			return TestScore3;
		}
		else
			return 0;
	}
	public int getAvg() {
		int avg = (int) ((TestScore1 + TestScore2 + TestScore3) / 3. + 0.5);
		return avg;
	}
	public int getHighTest() {
		int high = 0;
		if (TestScore1 > high) {
			high = TestScore1;
		}
		if (TestScore2 > high) {
			high = TestScore2;
		}
		if (TestScore3 > high) {
			high = TestScore3;
		}
		return high;
	}
	// Setter methods
	public void setName(String name) {
		StudentName = name;
	}
	public void setScore(int score, int tNum) {
		if (tNum == 1) {
			TestScore1 = score;
		} 
		else if (tNum == 2) {
			TestScore2 = score;
		}
		else if (tNum == 3) {
			TestScore3 = score;
		}
	}
	// toString method
	public String toString() {
		return "Name:\t\t" + StudentName + "\nTest 1:\t\t" + TestScore1 + "\nTest 2:\t\t" + TestScore2 + "\nTest 3:\t\t" + TestScore3 + "\nAverage:\t" + getAvg();
	}
}

