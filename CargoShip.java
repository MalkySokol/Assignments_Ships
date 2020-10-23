//Malky Sokol
package Program10;

public class CargoShip extends Ship {
	private int cargoCapacity;
	/**
	 * constructor that receives three values
	 * @param s
	 * @param y
	 * @param c
	 */
	public CargoShip(String s, int y, int c) {
		super(s,y);
		//input validation
		if (c < 0) {
			throw new NegativeNumberException();
		}
		cargoCapacity = c;
	}
	//no arg constructor
	public CargoShip() {
		
	}
	/**
	 * setter for CargoCapacity
	 * @param c
	 */
	public void setCargoCapacity(int c) {
		//input validation
		if (c < 0) {
			throw new NegativeNumberException();
		}
		cargoCapacity = c;
	}
	/**
	 * getter for cargoCapacity
	 * @return cargoCapacity
	 */
	public int getCargoCapacity() {
		return cargoCapacity;
	}
	/**
	 * toString method returns the values in a string format
	 */
	@Override
	public String toString() {
		//use the StringBuilder class
		StringBuilder s = new StringBuilder("\nCargoShip\n");
		s.append("Ship's Name: " + getShip());
		s.append("\tCargo Capacity: " + cargoCapacity);
		return s.toString();
	}
}
