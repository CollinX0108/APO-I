package model ;

public class Event {

	private EventType type ;
	private Date eventDate ;
	private String host ;
	private double cost ;
	private String description ;

	public Event(int type, int day, int month, int year, String host, double cost, String description) {

		switch(type) {

		case 1:
			this.type = EventType.MANTENIMIENTO ;
			break ; 
		case 2:
			this.type = EventType.VISITAS_DE_COLEGIO ;
			break ; 
		case 3:
			this.type = EventType.ACTIVIDADES_DE_MEJORAMIENTO ;
			break ; 
		case 4:
			this.type = EventType.CELEBRACIONES ;
			break ; 
		}

		this.eventDate = new Date(day, month, year) ;
		this.host = host ;
		this.cost = cost ;
		this.description = description ;

	}

	public EventType getEventType() {
		return type ;
	}

	public void setEventType(EventType type) {
		this.type = type ;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate ;
	}

	public void setEventDate(int day, int month, int year) {
		this.eventDate = new Date(day, month, year);
	}

	public String getHost() {
		return host ;
	}

	public void setHost(String host) {
		this.host = host ;
	}

	public double getCost() {
		return cost ;
	}

	public void setCost(double cost) {
		this.cost = cost ;
	}

	public String getDescription() {
		return description ;
	}

	public void setDescription(String description) {
		this.description = description ;
	}

}