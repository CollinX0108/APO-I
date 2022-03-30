package ui;

import java.util.Scanner;

import model.*;

public class BasketballManager {

	public static Scanner reader;
	public static BasketballController controller;

	public static void main(String[] args) {

		init();
		showMainMenu();

	}

	public static void init() {

		reader = new Scanner(System.in);
		controller = new BasketballController();

	}

	public static void showMainMenu() {

		System.out.println("Welcome to Basketball Manager 3000");

		boolean stopFlag = false;

		while (!stopFlag){

			System.out.println("\nType an option");
			System.out.println("1. Manage Teams, Coaches or Players");
			System.out.println("2. Manage Matches or Scores");
			System.out.println("0. Exit");

			int mainOption = reader.nextInt();

			switch (mainOption) {

			case 1:
				manageTeamCoachPlayer();
				break;
			case 2:
				manageMatchOrScore();
				break;
			case 0:
				stopFlag = true;
				System.out.println("Thanks for using our system");
				break;
			default:
				System.out.println("You must type a valid option");
				break;

			}

		} 

	}

	private static void manageTeamCoachPlayer() {

		boolean stopFlag = false;

		while (!stopFlag){
			System.out.println("\nRegistration Menu");
			System.out.println("\nType an option");
			System.out.println("1. Register Team");
			System.out.println("2. Register Coach");
			System.out.println("3. Register Players");
			System.out.println("4. Show Teams information");
			System.out.println("0. Go back");

			int secondaryOption = reader.nextInt();

			switch (secondaryOption) {

			case 1:
				registerTeam();
				break;
			case 2:
				registerCoach();
				break;
			case 3:
				registerPlayer();
				break;
			case 4:
				System.out.println("These are the Teams currently registered");
				System.out.println(controller.showTeams());
				break;
			case 0:
				stopFlag = true;
				showMainMenu();				
				break;
			default:
				System.out.println("You must type a valid option");
				break;
			}

		} 

	}

	private static void manageMatchOrScore() {

		boolean stopFlag = false;

		while (!stopFlag){
			System.out.println("\nRegistration Menu");
			System.out.println("\nType an option");
			System.out.println("1. Register Match");
			System.out.println("2. Register Quarter");
			System.out.println("3. Register Score");
			System.out.println("0. Go back");

			int secondaryOption = reader.nextInt();

			switch (secondaryOption) {

			case 1:
				registerMatch();
				break;
			case 2:
				registerQuarter();
				break;
			case 3:
				registerScore();
				break;
			case 0:
				stopFlag = true;
				showMainMenu();
				break;
			default:
				System.out.println("You must type a valid option");
				break;
			}

		}

	}

	private static void registerTeam() {

		System.out.println("Type the new Team name: ");
		String teamName = reader.next();

		System.out.println("Type the new Team foundation date (YYYY-MM-DD): ");
		String foundationDate = reader.next();

		int year = Integer.parseInt(foundationDate.split("-")[0]);
		int month = Integer.parseInt(foundationDate.split("-")[1]);
		int day = Integer.parseInt(foundationDate.split("-")[2]);

		
		if(controller.registerTeam(teamName, day, month, year)) {
			System.out.println("The team "+ teamName +" was sucefully registered") ;
		} else {
			System.out.println("The team "+ teamName +" couldn't be registered") ;
		}

		//System.out.println(myTeam.toString());

	}

	private static void registerCoach() {

		if(controller.showTeams().equals("")) {

			System.out.println("There aren't any teams") ;

		} else {

			System.out.println("This are the teams currently registered:" + controller.showTeams()) ;

			System.out.println("Type the ID of the Team you want to register a Coach :") ;
			String teamID = reader.next() ;

			System.out.println("Type the Coach's information: ");
			System.out.println("Name: ");
			String name = reader.next();

			System.out.println("Lastname: ");
			String lastName = reader.next();

			System.out.println("ID: ");
			String id = reader.next();

			System.out.println("Years of experience: ");
			int yearsOfExperience = Integer.parseInt(reader.next());

			if (controller.registerCoach(teamID, name, lastName, id, yearsOfExperience)) {
				System.out.println("Coach was successfully registered");
			} else {
				System.out.println("Coach couldn't be registered");
			}

		}
		
		//System.out.println(myCoach.toString());

	}

	private static void registerPlayer() {

		if(controller.showTeams().equals("")) {

			System.out.println("There aren't any teams") ;

		} else {

			System.out.println("This are the teams currently registered:" + controller.showTeams()) ;

			System.out.println("Type the ID of the Team you want to register a player :") ;
			String teamID = reader.next() ;

			System.out.println("Type the Players's information: ");
			System.out.println("Name: ");
			String name = reader.next();

			System.out.println("Lastname: ");
			String lastName = reader.next();

			System.out.println("ID: ");
			String id = reader.next();

			System.out.println("Shirt number: ");
			int shirtNumber = Integer.parseInt(reader.next());

			System.out.println("Choose the player position: \n1. Center\n2. Power Forward\n3. Small Forward\n4. Point Guard\n5. Shooting Guard ");
			int playerPosition = reader.nextInt() ;

			if (controller.registerPlayer(teamID, name, lastName, id, shirtNumber, playerPosition)) {
				System.out.println("Player was successfully registered");
			} else {
				System.out.println("Player couldn't be registered");
			}
		}

		//System.out.println(myPlayer.toString());

	}

	private static void registerMatch() {

		System.out.println("Type the match date (YYYY-MM-DD): ");
		String matchDate = reader.next();

		int year = Integer.parseInt(matchDate.split("-")[0]);
		int month = Integer.parseInt(matchDate.split("-")[1]);
		int day = Integer.parseInt(matchDate.split("-")[2]);

		
		
		//System.out.println(myMatch.toString());

	}

	private static void registerQuarter() {

		System.out.println("\nType the number of time outs for local team");
		int timeOutsLocalTeam = reader.nextInt();
		System.out.println("Type the number of time outs for visitor team");
		int timeOutsVisitorTeam = reader.nextInt();
		System.out.println("Type the number of points for local team");
		int pointsLocalTeam = reader.nextInt();
		System.out.println("Type the number of points for visitor team");
		int pointsVisitorTeam = reader.nextInt();
		
		
		
		//System.out.println(myQuarter.toString());
	}

	private static void registerScore() {

		System.out.println("Type the number of points for local team");
		int pointsLocalTeam = reader.nextInt();
		System.out.println("Type the number of points for visitor team");
		int pointsVisitorTeam = reader.nextInt();

		
		
		//System.out.println(myScore.toString());

	}

}
