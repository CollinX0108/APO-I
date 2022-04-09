package model ;

public class WetlandController {

	private Wetland[] wetlands ;

	public WetlandController() {

		wetlands = new Wetland[80] ;

	}

	public boolean registerWetland(String name, String wetlandLocationArea, String wetlandLocationType, double size, String url, boolean protection, String village, String neighborhood) {

		boolean stopFlag = false ;

		Wetland myWetland = new Wetland(name, wetlandLocationArea, wetlandLocationType, size, url, protection, village, neighborhood) ;

		for(int i=0; i < wetlands.length && !stopFlag; i++) {

			if(wetlands[i] == null) {

				myWetland.setId((i+1)+"");
				wetlands[i] = myWetland ;
				stopFlag = true ;

			}

		}

		return stopFlag ;


	}

	public String showWetlands() {

		String msg = "" ;

		for(int i = 0; i < wetlands.length; i++) {

			if (wetlands[i] != null) {

				msg += "\n"+wetlands[i].getId()+", "+wetlands[i].getName() ;

			}

		}

		return msg ;
	}

	public boolean registerSpecies(String wetlandID, String name, String scientificName, String migratoty, String type) {

		boolean stopFlag = false ;

		Species mySpecies = new Species(name, scientificName, migratoty, type) ;

		for(int i=0; i < wetlands.length && !stopFlag; i++) {

			if(wetlands[i] != null) {

				if((i+1+"").equals(wetlandID)) {

					stopFlag = wetlands[i].addSpecies(name, scientificName, migratoty, type) ;
				}

			}

		}

		return stopFlag ;

	}

	public boolean registerEvent(String wetlandID, int type, int day, int month, int year, String host, double cost, String description) {

		boolean stopFlag = false ;

		Event myEvent = new Event(type, day, month, year, host, cost, description) ;

		for(int i=0; i < wetlands.length && !stopFlag; i++) {

			if(wetlands[i] != null) {

				if((i+1+"").equals(wetlandID)) {

					stopFlag = wetlands[i].addEvent(type, day, month, year, host, cost, description) ;
				}

			}

		}

		return stopFlag ;

	}

	public String showMaintenance(int searchYear) {

		String msg = "\nFor the year" + searchYear ;
		int quantity = 0 ;

		for(int i = 0; i < wetlands.length; i++) {

			if ((wetlands[i] != null) && (wetlands[i].getEvents() != null)) {

				for(int k = 0; k < wetlands[i].getEvents().length ; k++) {

					if (wetlands[i].getEvents()[k] != null) {

						if (((wetlands[i].getEvents()[k].getEventDate().getYear()) == searchYear) && (wetlands[i].getEvents()[k].getEventType().equals(EventType.MANTENIMIENTO))) {
							quantity++ ;
						}

					}
				}
				msg += "\nin the wetland with name: " + wetlands[i].getName() + " were " + quantity + " maintenances.";
			}

		}

		return msg ;
	}




}