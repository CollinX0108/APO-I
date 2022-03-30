package model;

public class Coach {

	private String name;
	private String lastName;
	private String id;
	private int yearsOfExperience;

	public Coach(String name, String lastName, String id, int yearsOfExperience) {
		this.name = name;
		this.lastName = lastName;
		this.id = id;
		this.yearsOfExperience = yearsOfExperience;
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

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	@Override
	public String toString() {
		return "Coach info:\nFullname: " + name + " " + lastName + "\nId: " + id + "\nYears Of Experience: "
				+ yearsOfExperience;
	}

}
