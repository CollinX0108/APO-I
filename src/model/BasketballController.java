package model ;

public class BasketballController {

	private Team[] teams ;

	public BasketballController() {

		teams = new Team[3] ;

	}

	public boolean registerTeam(String teamName, int day, int month, int year) {

		boolean stopFlag = false ;

		Team myTeam = new Team(teamName, day, month, year) ;

		for(int i=0; i < teams.length && !stopFlag; i++) {

			if(teams[i] == null) {

				myTeam.setId((i+1)+"");
				teams[i] = myTeam ;
				stopFlag = true ;

			}

		}

		return stopFlag ;


	}

	public String showTeams() {

		String msg = "" ;

		for(int i = 0; i < teams.length; i++) {

			if (teams[i] != null) {

				msg += "\n"+teams[i].getId()+". "+teams[i].getName() ;

			}

		}

		return msg ;
	}

	public boolean registerPlayer(String teamID, String name, String lastName, String id, int shirtNumber, int playerPosition) {

		boolean stopFlag = false ;

		Player myPlayer = new Player(name, lastName, id, shirtNumber, playerPosition) ;

		for(int i=0; i < teams.length && !stopFlag; i++) {

			if(teams[i] != null) {

				if(((i+1)+"").equals(teamID)) {

					stopFlag = teams[i].addPlayer(name, lastName, id, shirtNumber, playerPosition) ;

				}

			}

		}

		return stopFlag ;

	}

	public boolean registerCoach(String teamID, String name, String lastName, String id, int yearsOfExperience) {

		boolean stopFlag = false ;

		Coach myCoach = new Coach(name, lastName, id, yearsOfExperience) ;

		for(int i=0; i < teams.length && !stopFlag; i++) {

			if(teams[i] != null) {

				if((i+1+"").equals(teamID)) {

					stopFlag = teams[i].addCoach(name, lastName, id, yearsOfExperience) ;
				}

			}

		}

		return stopFlag ;

	}


}