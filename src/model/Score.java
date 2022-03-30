package model;

public class Score {

	private int localPoints;
	private int visitorPoints;

	public Score(int localPoints, int visitorPoints) {

		this.localPoints = localPoints;
		this.visitorPoints = visitorPoints;

	}

	public int getLocalPoints() {
		return localPoints;
	}

	public void setLocalPoints(int localPoints) {
		this.localPoints = localPoints;
	}

	public int getVisitorPoints() {
		return visitorPoints;
	}

	public void setVisitorPoints(int visitorPoints) {
		this.visitorPoints = visitorPoints;
	}

	@Override
	public String toString() {
		return "Local(" + localPoints + ") vs Visitor(" + visitorPoints+")";
	}
	
	

}
