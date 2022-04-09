package ui;

import java.util.Scanner;
import model.WetlandController ;
import model.Wetland ;
import model.Location ;
import model.Species ;
import model.Event ;
import model.Date ;


public class WetlandManager {

	public static Scanner reader;
	public static WetlandController controller;

	public static void main(String[] args) {

		init();
		showMainMenu();

	}

	public static void init() {

		reader = new Scanner(System.in);
		controller = new WetlandController();

	}

	private static void showMainMenu() {

		boolean stopFlag = false;

		while (!stopFlag){
			System.out.println("\nRegistration Menu");
			System.out.println("\nType an option");
			System.out.println("1. Register Wetland.");
			System.out.println("2. Register new species.");
			System.out.println("3. Register event.");
			System.out.println("4. Wetland maintenance.");
			System.out.println("5. Wetland with less flora species.");
			System.out.println("6. Search wetlands that contains certain species.");
			System.out.println("7. Display all wetlands with their information.");
			System.out.println("8. Wetland with most animals.");

			int secondaryOption = reader.nextInt();

			switch (secondaryOption) {

			case 1:
				registerWetland();
				break;
			case 2:
				registerSpecies();
				break;
			case 3:
				registerEvent();
				break;
			case 4:
				searchMaintenance();
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

	private static void registerWetland() {

		System.out.println("Type the new Wetland name: ");
		String name = reader.next();

		System.out.println("Wetland location area: ");

		String wetlandLocationArea = "" ;

		boolean stopFlag = false;

		System.out.println("\nSelect the wetland location area: ");
		System.out.println("1. Urban");
		System.out.println("2. Rural");

		int wetSelect = reader.nextInt();

		while (!stopFlag) {

			switch (wetSelect) {

			case 1:
				wetlandLocationArea = "Urban" ;
				stopFlag = true;
				break;
			case 2:
				wetlandLocationArea = "Rural" ;
				stopFlag = true;
				break;
			default:
				System.out.println("You must type a valid option");
				break;
			}

		}

		String village = "" ;
		String neighborhood = "" ;

		if(wetlandLocationArea == "Rural") {
			System.out.println("\nType the village(corregimiento) name:");
			village = reader.next() ;
		}

		if(wetlandLocationArea == "Urban") {
			System.out.println("\nType the neighborhood name:");
			neighborhood = reader.next() ;
		}

		System.out.println("Wetland location type: ");

		String wetlandLocationType = "" ;

		stopFlag = false;

		System.out.println("\nSelect the wetland location type: ");
		System.out.println("1. Public");
		System.out.println("2. Private");

		wetSelect = reader.nextInt();

		while (!stopFlag) {

			switch (wetSelect) {

			case 1:
				wetlandLocationType = "Public" ;
				stopFlag = true;
				break;
			case 2:
				wetlandLocationType = "Private" ;
				stopFlag = true;
				break;
			default:
				System.out.println("You must type a valid option");
				break;
			}

		}

		System.out.println("Type the Wetland size (Km^2): ");
		double size = reader.nextDouble();

		System.out.println("Type the Wetland url: ");
		String url = reader.next();

		System.out.println("Is the wetland a protected area?");
		boolean protection = false ;

		stopFlag = false;

		System.out.println("\nSelect an option: ");
		System.out.println("1. Yes");
		System.out.println("2. No");

		wetSelect = reader.nextInt();

		while (!stopFlag) {

			switch (wetSelect) {

			case 1:
				protection = true ;
				stopFlag = true;
				break;
			case 2:
				protection = false ;
				stopFlag = true;
				break;
			default:
				System.out.println("You must type a valid option");
				break;
			}

		}
		
		if(controller.registerWetland(name, wetlandLocationArea, wetlandLocationType, size, url, protection, village, neighborhood)) {
			System.out.println("\n") ;
			System.out.println("The Wetland "+ name +" was sucefully registered") ;
		} else {
			System.out.println("\n") ;
			System.out.println("The Wetland "+ name +" couldn't be registered") ;
		}

	}

	private static void registerSpecies() {

		if(controller.showWetlands().equals("")) {
			
			System.out.println("There aren't any wetlands") ;

		} else {

			System.out.println("This are the wetlands currently registered:" + controller.showWetlands()) ;

			System.out.println("Type the ID of the wetland you want to register the species :") ;
			String wetlandID = reader.next() ;

			System.out.println("Type the Species information: ");
			System.out.println("Name: ");
			String name = reader.next();

			System.out.println("Scientific name: ");
			String scientificName = reader.next();

			System.out.println("The current species are migratory? ");
			String migratory = reader.next();

			System.out.println("Select the species type: ");
			System.out.println("1. Flora terrestre");
			System.out.println("2. Flora acuatica");
			System.out.println("3. Ave");
			System.out.println("4. Mamifero");
			System.out.println("5. Acuatico");

			int typeSelect = reader.nextInt();

			String type = "" ;

			boolean stopFlag = false;

			while (!stopFlag) {

				switch (typeSelect) {

				case 1:
					type = "Flora terrestre" ;
					stopFlag = true;
					break;
				case 2:
					type = "Flora acuatica" ;
					stopFlag = true;
					break;
				case 3:
					type = "Ave" ;
					stopFlag = true;
					break;
				case 4:
					type = "Mamifero" ;
					stopFlag = true;
					break ;
				case 5:
					type = "Acuatico" ;
					stopFlag = true;
					break ;
				default:
					System.out.println("You must type a valid option");
					break;
				}

			}
			controller.registerSpecies(wetlandID, name, scientificName, migratory, type) ;
		}

	}

	private static void registerEvent() {

		if(controller.showWetlands().equals("")) {
			
			System.out.println("There aren't any wetlands") ;

		} else {

			System.out.println("This are the wetlands currently registered:" + controller.showWetlands()) ;

			System.out.println("Type the ID of the wetland you want to register the event :") ;
			String wetlandID = reader.next() ;

			System.out.println("Type the Event information: ");

			System.out.println("Choose the event type: \n1. Mantenimiento\n2. Visitas de colegio\n3. Actividades de mejoramiento\n4. Celebraciones ");
			int type = reader.nextInt() ;

			System.out.println("\nDate (YYYY-MM-DD): ");
			String eventDate = reader.next();

			int year = Integer.parseInt(eventDate.split("-")[0]);
			int month = Integer.parseInt(eventDate.split("-")[1]);
			int day = Integer.parseInt(eventDate.split("-")[2]);

			System.out.println("\nType the host name: ");
			String host = reader.next();

			System.out.println("\nType the event cost: ");
			double cost = reader.nextDouble();

			System.out.println("\nType the event description: ");
			String description = reader.next();

			
			if(controller.registerEvent(wetlandID, type, day, month, year, host, cost, description)) {
				System.out.println("\n") ;
				System.out.println("The Wetland event was sucefully registered") ;
			} else {
				System.out.println("\n") ;
				System.out.println("The Wetland event couldn't be registered") ;
			}
		}

	}

	private static void searchMaintenance() {

		System.out.println("Type the year you want to know how many maintenance events has:") ;
		int searchYear = reader.nextInt() ;
		System.out.println("") ;
		System.out.println(controller.showMaintenance(searchYear)) ;

	}

	




}