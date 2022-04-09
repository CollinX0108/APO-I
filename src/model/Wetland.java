package model ;

public class Wetland {

	private String id ;
	private String name ;
	private String wetlandLocationArea ;
	private String wetlandLocationType ;
	private double size ;
	private String url ;
	private boolean protection ;
	private String village ;
	private String neighborhood ;
	private Species[] speciess ;
	private Event[] events ;

	public Wetland(String name, String wetlandLocationArea, String wetlandLocationType, double size, String url, boolean protection, String village, String neighborhood) {

		this.id = "" ;
		this.name = name ;
		this.wetlandLocationArea = wetlandLocationArea ;
		this.wetlandLocationType = wetlandLocationType ;
		this.size = size ;
		this.url = url ;
		this.protection = protection ;
		this.village = village ;
		this.neighborhood = neighborhood ;
		speciess = new Species[15] ;
		events = new Event[80] ;

	}

	public boolean addSpecies(String name, String scientificName, String migratory, String type) {

		boolean stopFlag = false;

		Species mySpecies = new Species(name, scientificName, migratory, type) ;

		for (int i = 0; (i < speciess.length) && !stopFlag; i++) {

			if (speciess[i] == null) {

				speciess[i] = mySpecies ;
				stopFlag = true ;

			}

		}

		return stopFlag;

	}

	public boolean addEvent(int type, int day, int month, int year, String host, double cost, String description) {

		boolean stopFlag = false;

		Event myEvent = new Event(type, day, month, year, host, cost, description) ;

		for (int i = 0; (i < events.length) && !stopFlag; i++) {

			if (events[i] == null) {

				events[i] = myEvent ;
				stopFlag = true ;

			}

		}

		return stopFlag;

	}





	public String getId() {
		return id ;
	}

	public void setId(String id) {
		this.id = id ;
	}

	public String getName() {
		return name ;
	}

	public void setName(String name) {
		this.name = name ;
	}

	public String getWetlandLocationArea() {
		return wetlandLocationArea ;
	}

	public void setWetlandLocationArea(String wetlandLocationArea) {
		this.wetlandLocationArea = wetlandLocationArea ;
	}

	public String getWetlandLocationType() {
		return wetlandLocationType ;
	}

	public void setWetlandLocationType(String wetlandLocationType) {
		this.wetlandLocationType = wetlandLocationType ;
	}

	public double getSize() {
		return size ;
	}

	public void setSize(double size) {
		this.size = size ;
	}

	public String getUrl() {
		return url ;
	}

	public void setUrl(String url) {
		this.url = url ;
	}

	public boolean getProtection() {
		return protection ;
	}

	public void setProtection(boolean protection) {
		this.protection = protection ;
	}

	public String getVillage() {
		return village ;
	}

	public void setVillage(String village) {
		this.village = village ;
	}

	public String getNeighborhood() {
		return neighborhood ;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood ;
	}

	public Species[] getSpecies() {
		return speciess ;
	}

	public void setSpecies(Species[] speciess) {
		this.speciess = speciess ;
	}

	public Event[] getEvents() {
		return events ;
	}

	public void setNeighborhood(Event[] events) {
		this.events = events ;
	}

}
