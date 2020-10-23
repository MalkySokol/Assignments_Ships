/**
 * Malky Sokol
 */
package Program10;
import java.util.*;


public class Harbor {

	public static void main(String[] args) {
		//create a scanner object
		Scanner input = new Scanner(System.in);
		//create an ArrayList to hold cruise ships
		ArrayList<CruiseShip> cruise = new ArrayList <>();
		//create an ArrayList to hold cargo ships
		ArrayList<CargoShip> cargo = new ArrayList<>();
		//ask the user for the amt of cruise ships
		System.out.println("How many Cruise"
				+ " Ships do you have? ");
		int amt = input.nextInt();
		//input validation
		while(amt < 0) {
			System.out.println("Enter an apropriate value: ");
			amt = input.nextInt();
		}
		//call a method to fill the array
		fillCruise(cruise,amt, input);
		//ask the user for the number of cargo ships
		System.out.println("How many Cargo Ships do you have? ");
		int maximum = input.nextInt();
		//input validation
		while(maximum < 0) {
			System.out.println("Enter an apropriate value: ");
			maximum = input.nextInt();
		}
		//call a method to fill the array
		fillCargo(cargo, maximum, input);
		
	}
	/**
	 * This method fills the cruise ArrayList with CruiseShip objects
	 * @param cruise
	 * @param amt
	 * @param input
	 */
	public static void fillCruise(ArrayList <CruiseShip> cruise, int amt, Scanner input) {
		try {
			//fill the array with CruiseShips
			for(int i = 0; i < amt; i++) {
				//swallow up the next line after an integer
				input.nextLine();
				System.out.println("What is the name of ship " + (i+1) + "?");
				String name = input.nextLine();
				System.out.println("What year was the ship built in?");
				int year = input.nextInt();
				//input validation
				while (year < 0) {
					System.out.println("Please enter a valid year: ");
					year = input.nextInt();
				}
				System.out.println("What is the maximum amount of passengers allowed on the ship?");
				int maxP = input.nextInt();
				//input validation
				while(maxP < 0) {
					System.out.println("Please enter a positive number: ");
					maxP = input.nextInt();
				}
				//create a CruiseShip object
				CruiseShip c = new CruiseShip(name,year,maxP);
				//add passengers
				System.out.println("Would you like to add a passenger to the ship? enter 1 to add a passenger: ");
				int num = input.nextInt();
				int acc = 0;
				while(num == 1 && acc < maxP) {
					//ask the user for the necessary info to make a passenger object
					input.nextLine();
					System.out.println("Please enter the following information about the passenger.");
					System.out.println("First Name: ");
					String f = input.nextLine();
					System.out.println("Last Name: ");
					String l = input.nextLine();
					System.out.println("Gender: ");
					String g = input.nextLine().toUpperCase(); 
					Gender ge = Gender.valueOf(g);
					System.out.println("Street: ");
					String str = input.nextLine();
					System.out.println("City: ");
					String ci = input.nextLine();
					System.out.println("State: ");
					String st = input.nextLine();
					System.out.println("Zip: ");
					String z = input.nextLine();
					Address add = new Address(str,ci,st,z);
					System.out.println("Birthdate: ");
					String b = input.nextLine();
					System.out.println("Passport ID: ");
					String p = input.nextLine();
					System.out.println("Peices of Luggage: ");
					int lug = input.nextInt();
					Passenger pass = new Passenger(f,l,ge,add,b,p,lug);
					//add this passenger to the cruiseship
					c.addPassenger(pass);
					//ask the user if he would like to add another passenger
					System.out.println("Would you like to add another passenger to the ship? enter 1 to add a passenger or any other number to finish: ");
					num = input.nextInt();
					//increment the accumulator
					acc ++;
					
				}
				
				//add to the array
				cruise.add(c);
			}
			//display ArrayList
			for(CruiseShip cs: cruise) {
				System.out.println(cs);
			}
		}
	
		catch (NegativeNumberException e){
			System.out.println(e.getMessage());
		}
		catch (PassengerExistsException e) {
			System.out.println(e.getMessage());
		}
		catch (ExceedsMaxPassengersException e) {
			System.out.println(e.getMessage());
		}
	}
	/**
	 * This method fills the cargo ArrayList with CargoShip objects
	 * @param cargo
	 * @param maximum
	 * @param input
	 */
	public static void fillCargo(ArrayList<CargoShip> cargo, int maximum, Scanner input) {
		try {
			//fill the array with CargoShips
			for(int i = 0; i < maximum; i++) {
				input.nextLine();
				System.out.println("What is the name of ship " + (i+1) + "?");
				String name = input.nextLine();
				System.out.println("What year was the ship built in?");
				int year = input.nextInt();
				System.out.println("What is the cargo capacity of the ship?");
				int maxC = input.nextInt();
				CargoShip c = new CargoShip(name,year,maxC);
				//add to the array
				cargo.add(c);
			}
			//display ArrayList
			for(CargoShip cs: cargo) {
				System.out.println(cs);
			}
			
		}
		catch(NegativeNumberException e) {
			System.out.println(e.getMessage());
		}
	}
}



