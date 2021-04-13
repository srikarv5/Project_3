
import java.util.*;
public class Frontend {
	Map madisonMap = new Map("MapData.csv");
	Backend UWmap = new Backend(madisonMap);
	ArrayList<String> ls = new ArrayList<String>();
	
	
	public static void main(String[] args) {
		Map madisonMap = new Map("MapData.csv");
		Backend UWmap = new Backend(madisonMap);
		//welcome message
		System.out.println("Welcome to a map of the beautiful campus of UW Madison...");
		//show option
		System.out.println("In this application, you can search for buildings as well as finding the most "
				+ "convenient way to transport around campus");
		System.out.println();
		//show option
		while(1==1) {	
			String input = menu();
			if(input.equals("1")) {do1(UWmap);}
			if(input.equals("2")) {do2(UWmap);}
			if(input.equals("3")) {do3(UWmap);}
			if(input.equals("4")) {do4(UWmap);}
			if(input.equals("5")) {do5(UWmap);}
			System.out.println();
			System.out.println("if you want to quit the application, please enter 'quit', else press 'enter' to continue");
			Scanner quit = new Scanner(System.in);
			String last = quit.nextLine();
			if(last.equals("quit")) {
				break;
			}
		}
		System.out.println("Thanks for usng UW Madison Map, have a nice day >.<");
	}
	public static String menu() {
		System.out.println("please insert the number following the instruction below to use the applcation correctly:");
		System.out.println("1: see all the buildings on campus");
		System.out.println("2: find the shortest distance between buildings");
		System.out.println("3: find the shortest path to travel around two buildings");
		System.out.println("4: check out the shortest time to walk between two buildings");
		System.out.println("5: check out the time it takes to drive around two buildings");
		System.out.println("please input a number from 1 to 5: ");
		Scanner inp = new Scanner(System.in);
		String firstInput = inp.nextLine();
		if(firstInput.equals("1") || firstInput.equals("2") || 
				firstInput.equals("3") || firstInput.equals("4") || firstInput.equals("5")){

			return firstInput;
		}
		System.out.println("your input is invalid!");

		return menu();
	}
	
	public static void do1(Backend thisMap) {
		System.out.println("this is all the buildings in UW Madison: ");
		thisMap.printBuildings();
	}
	public static void do2(Backend thisMap) {
		
		ArrayList<String> buildings = new ArrayList<String>();
		buildings.add("Vilas Hall");
		buildings.add("University Book Store");
		buildings.add("Memorial Library");
		buildings.add("Memorial Union");
		buildings.add("College Library");
		buildings.add("Humanities");
		buildings.add("Bascom Hall");
		buildings.add("Grainger Hall");
		
		System.out.println("please enter the name of the building you are staring from: ");
		Scanner input = new Scanner(System.in);
	
		String firstinput = input.nextLine();
		if(!buildings.contains(firstinput)) {
			System.out.println("please enter a valid building name!");
			do2(thisMap);
			return;
		}
		System.out.println("please enter the name of the building you are going to: ");
		String secondinput = input.nextLine();
		if(!buildings.contains(secondinput)) {
			System.out.println("please enter a valid building name!");
			do2(thisMap);
			return;
		}
		System.out.println("The shortest distance between this two buildings is "+ 
		thisMap.getShortestDistance(firstinput, secondinput));	
	}
	public static void do3(Backend thisMap) {
		ArrayList<String> buildings = new ArrayList<String>();
		buildings.add("Vilas Hall");
		buildings.add("University Book Store");
		buildings.add("Memorial Library");
		buildings.add("Memorial Union");
		buildings.add("College Library");
		buildings.add("Humanities");
		buildings.add("Bascom Hall");
		buildings.add("Grainger Hall");
		
		System.out.println("please enter the name of the building you are staring from: ");
		Scanner input = new Scanner(System.in);
	
		String firstinput = input.nextLine();
		if(!buildings.contains(firstinput)) {
			System.out.println("please enter a valid building name!");
			do3(thisMap);
			return;
		}
		System.out.println("please enter the name of the building you are going to: ");
		String secondinput = input.nextLine();
		if(!buildings.contains(secondinput)) {
			System.out.println("please enter a valid building name!");
			do3(thisMap);
			return;
		}
		System.out.println("The shortest path to go between this two building is "+ 
		thisMap.getShortestPath(firstinput, secondinput));
	}
	public static void do4(Backend thisMap) {
		ArrayList<String> buildings = new ArrayList<String>();
		buildings.add("Vilas Hall");
		buildings.add("University Book Store");
		buildings.add("Memorial Library");
		buildings.add("Memorial Union");
		buildings.add("College Library");
		buildings.add("Humanities");
		buildings.add("Bascom Hall");
		buildings.add("Grainger Hall");
		
		System.out.println("please enter the name of the building you are staring from: ");
		Scanner input = new Scanner(System.in);
	
		String firstinput = input.nextLine();
		if(!buildings.contains(firstinput)) {
			System.out.println("please enter a valid building name!");
			do4(thisMap);
			return;
		}
		System.out.println("please enter the name of the building you are going to: ");
		String secondinput = input.nextLine();
		if(!buildings.contains(secondinput)) {
			System.out.println("please enter a valid building name!");
			do4(thisMap);
			return;
		}
		System.out.println("The shortest time it takes to walk between this two buildings is "+ 
		thisMap.getWalkTime(firstinput, secondinput)+ " minutes");
	}
	public static void do5(Backend thisMap) {
		ArrayList<String> buildings = new ArrayList<String>();
		buildings.add("Vilas Hall");
		buildings.add("University Book Store");
		buildings.add("Memorial Library");
		buildings.add("Memorial Union");
		buildings.add("College Library");
		buildings.add("Humanities");
		buildings.add("Bascom Hall");
		buildings.add("Grainger Hall");
		
		System.out.println("please enter the name of the building you are staring from: ");
		Scanner input = new Scanner(System.in);
	
		String firstinput = input.nextLine();
		if(!buildings.contains(firstinput)) {
			System.out.println("please enter a valid building name!");
			do5(thisMap);
		}
		System.out.println("please enter the name of the building you are going to: ");
		String secondinput = input.nextLine();
		if(!buildings.contains(secondinput)) {
			System.out.println("please enter a valid building name!");
			do5(thisMap);
		}
		System.out.println("The shortest time it takes to drive between this two buildings is "+ 
		thisMap.getDriveTime(firstinput, secondinput) + " minutes");
	}
}
