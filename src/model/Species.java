package model ;

public class Species {

	private String name ;
	private String scientificName ;
	private String migratoty ;
	private String type ;

	public Species(String name, String scientificName, String migratoty, String type) {

		this.name = name ;
		this.scientificName = scientificName ;
		this.migratoty = migratoty ;
		this.type = type ;

	}

	public String getName() {
		return name ;
	}

	public void setName(String name) {
		this.name = name ;
	}

	public String getScientificName() {
		return scientificName ;
	}

	public void setScientificName(String scientificName) {
		this.scientificName = scientificName ;
	}

	public String getMigratory() {
		return migratoty ;
	}

	public void setMigratory(String migratoty) {
		this.migratoty = migratoty ;
	}

	public String getType() {
		return type ;
	}

	public void setType(String type) {
		this.type = type ;
	}

}