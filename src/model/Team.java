package model;

public class Team {

	private String id;
	private String name;
	private Date foundationDate;
	private Coach coach;
	private Player[] players;

	public Team(String name, int day, int month, int year) {

		this.id = "";
		this.name = name;
		this.foundationDate = new Date(day, month, year);
		this.coach = null ;
		players = new Player[5];

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getFoundationDate() {
		return foundationDate;
	}

	public void setFoundationDate(Date foundationDate) {
		this.foundationDate = foundationDate;
	}

	public void setFoundationDate(int day, int month, int year) {
		this.foundationDate = new Date(day, month, year);
	}

	public Coach getCoach() {
		return coach;
	}

	public void setCoach(Coach coach) {
		this.coach = coach;
	}

	public Player[] getPlayers() {
		return players;
	}

	public void setPlayers(Player[] players) {
		this.players = players;
	}

	public boolean addPlayer(String name, String lastName, String id, int shirtNumber, int playerPosition) {

		boolean stopFlag = false;

		Player myPlayer = new Player(name, lastName, id, shirtNumber, playerPosition);

		for (int i = 0; i < players.length && !stopFlag; i++) {

			if (players[i] == null) {

				players[i] = myPlayer;
				stopFlag = true;

			}

		}

		return stopFlag;

	}

	public boolean addCoach(String name, String lastName, String id, int yearsOfExperience) {

		boolean stopFlag = false;

		Coach myCoach = new Coach(name, lastName, id, yearsOfExperience);

		coach = myCoach ;

		stopFlag = true ;

		return stopFlag;

	}

	
	@Override
	public String toString() {

		String msg = "";

		msg += "Team info:\nName: " + name + "\nFoundationDate: " + foundationDate;

		for (int i = 0; i < players.length; i++) {

			if (players[i] != null) {

				msg += "\n" + players[i].toString();
			}

		}

		return msg;
	}

}