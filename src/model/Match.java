package model;

public class Match {

	private Team localTeam;
	private Team visitorTeam;
	private Quarter[] quarters;
	private String winnerName;
	private int totalLocalPoints;
	private int totalVisitorPoints;
	private int totalTimeOuts;
	private Date matchDate;

	public Match(int day, int month, int year) {

		quarters = new Quarter[4];
		this.localTeam = null;
		this.visitorTeam = null;
		this.matchDate = new Date(day, month, year);
		this.totalLocalPoints = 0;
		this.totalVisitorPoints = 0;
		this.setTotalTimeOuts(0);
		this.winnerName = null;

	}

	public Team getLocalTeam() {
		return localTeam;
	}

	public void setLocalTeam(Team localTeam) {
		this.localTeam = localTeam;
	}

	public Team getVisitorTeam() {
		return visitorTeam;
	}

	public void setVisitorTeam(Team visitorTeam) {
		this.visitorTeam = visitorTeam;
	}

	public Quarter[] getQuarters() {
		return quarters;
	}

	public void setQuarters(Quarter[] quarters) {
		this.quarters = quarters;
	}

	public Date getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}

	public void setMatchDate(int day, int month, int year) {
		this.matchDate = new Date(day, month, year);
	}

	public String getWinnerName() {
		return winnerName;
	}

	public void setWinnerName(Team winner) {

		if (winner == null) {
			this.winnerName = "Empate";
		} else {
			this.winnerName = winner.getName();
		}

	}

	public int getTotalLocalPoints() {
		return totalLocalPoints;
	}

	public void setTotalLocalPoints(int totalLocalPoints) {
		this.totalLocalPoints = totalLocalPoints;
	}

	public int getTotalVisitorPoints() {
		return totalVisitorPoints;
	}

	public void setTotalVisitorPoints(int totalVisitorPoints) {
		this.totalVisitorPoints = totalVisitorPoints;
	}

	@Override
	public String toString() {
		return "The match played on "
				+ matchDate.toString() + " had a score of " + this.totalLocalPoints + " to " + this.totalVisitorPoints
				+ ".";
	}

	public int getTotalTimeOuts() {
		return totalTimeOuts;
	}

	public void setTotalTimeOuts(int totalTimeOuts) {
		this.totalTimeOuts = totalTimeOuts;
	}

}
