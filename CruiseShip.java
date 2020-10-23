/**
 * Malky Sokol
 */
package Program10;
import java.util.*;

public class CruiseShip extends Ship{
	private int maxPassengers;
	//array list of passengers
	ArrayList <Passenger> passengers;
	/**
	 * This constructor accepts 3 values
	 * @param s
	 * @param y
	 * @param maxPassengers
	 */
	public CruiseShip(String s, int y, int maxPassengers) {
		//call the superclass constructor
		super(s,y);
		//input validation
		if (maxPassengers < 0) {
			throw new NegativeNumberException("The maxPassenger field is asigned a negative value");
		}
		this.maxPassengers = maxPassengers;
		passengers = new ArrayList<Passenger>();
	}
	/**
	 * if the user passes no values to the constructor
	 */
	public CruiseShip() {
		//call the superclass constructor
		super();
		//assign maxPassengers to zero
		maxPassengers = 0;
	}
	/**
	 * this method sets the number for the maximum amount of passengers
	 * @param maxPassenger
	 */
	public void setMaxPassengers(int maxPassengers) {
		//input validation
		if (maxPassengers < 0) {
			throw new NegativeNumberException("The maxPassenger field is asigned a negative value");
		}
		this.maxPassengers = maxPassengers;
	}
	/**
	 * getter for maxPassengers
	 * @return maxPassesngers
	 */
	public int getMaxPassengers() {
		return maxPassengers;
	}
	/**
	 * getter for the ArrayList of passengers
	 * @return passengers
	 */
	public ArrayList getPassengers() {
		//return a deep copy of the array
		return new ArrayList (passengers);
	}
	/**
	 * toString method to display the values in string format
	 */
	@Override
	public String toString() {
		//use the StringBuilder class
		StringBuilder s = new StringBuilder("\nCruise Ship\n");
		s.append(super.toString());
		s.append("Maximum amount of passengers: "  + maxPassengers);
		s.append("\nPassengers on the Cruise Ship: ");
		//use the enhanced for loop to append the passengers
		for(Passenger p: passengers) {
			s.append(p + "\t");
		}
		return s.toString();
	}
	public void addPassenger(Passenger p) {
		//check if this passenger is already in the list
		if(passengers.contains(p)) {
			throw new PassengerExistsException("The passenger already exists.");
		}
		//check if the size of the ArrayList already reached it's max
		if(passengers.size() == maxPassengers) {
			throw new ExceedsMaxPassengersException();
		}
		//if the passenger is not in the list and the maxPassengers has not been reached yet
		passengers.add(p);
	}
}
