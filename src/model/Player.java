package model;

public class Player {

	private String name;
	private String lastName;
	private String id;
	private int shirtNumber;
	private Position playerPosition ;

	public Player(String name, String lastName, String id, int shirtNumber, int playerPosition) {

		super();
		this.name = name;
		this.lastName = lastName;
		this.id = id;
		this.shirtNumber = shirtNumber;

		switch(playerPosition) {

		case 1:
			this.playerPosition = Position.CENTER ;
			break ; 
		case 2:
			this.playerPosition = Position.POWER_FORWARD ;
			break ; 
		case 3:
			this.playerPosition = Position.SMALL_FORWARD ;
			break ; 
		case 4:
			this.playerPosition = Position.POINT_GUARD ;
			break ; 
		case 5:
			this.playerPosition = Position.SHOOTING_GUARD ;
			break ; 
		}

	}

	public Position getPlayerPosition() {
		return playerPosition;
	}

	public void setPlayerPosition(Position playerPosition) {
		this.playerPosition = playerPosition;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getShirtNumber() {
		return shirtNumber;
	}

	public void setShirtNumber(int shirtNumber) {
		this.shirtNumber = shirtNumber;
	}

	@Override
	public String toString() {
		return "Player info:\nId: " + id + "\nFullname: " + name + " " + lastName + "\nShirt Number: " + shirtNumber +"\nPosition: " + playerPosition;
	}

}
