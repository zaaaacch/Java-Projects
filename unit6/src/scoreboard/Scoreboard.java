package scoreboard;

public class Scoreboard {
	private String team1, team2;
	private int t1Score, t2Score;
	private boolean t1Active;
	
	public Scoreboard(String team1, String team2) {
		this.team1 = team1;
		this.team2 = team2;
		t1Score = 0;
		t2Score = 0;
		t1Active = true;
	}
	
	public void recordPlay(int pts) {
		if (pts == 0) {
			t1Active = !t1Active;
		}
		if (t1Active) {
			t1Score+= pts;
		} else {
			t2Score+= pts;
		}
	}
	
	public String getScore() {
		if (t1Active) {
			return t1Score + "-" + t2Score + " " + team1;
		} else {
			return t1Score + "-" + t2Score + " " + team2;
		}
	}
	
	
	public static void main(String[] args) {
		Scoreboard match = new Scoreboard("Dominic", "Zach");
		match.recordPlay(100000);
		System.out.println(match.getScore());	
		match.recordPlay(10);
		System.out.println(match.getScore());	
		
	}
}
