package model;

public class Quarter {

	private int timeOuts;
	private Score score;

	public Quarter(int timeOuts, int localPoints, int visitorPoints) {
		this.timeOuts = timeOuts;
		score = new Score(localPoints, visitorPoints);
	}

	public int getTimeOuts() {
		return timeOuts;
	}

	public void setTimeOuts(int timeOuts) {
		this.timeOuts = timeOuts;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Quarter info: \nTimeOuts: " + timeOuts + "\nScore: " + score.toString();
	}

	
	
}
