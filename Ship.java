/**
 * Malky Sokol
 */
package Program10;

public class Ship {
	//instance variables
	private String ship;
	private int year;
	/**
	 * This constructor accepts no values
	 */
	public Ship() {
		this(null,0);
	}
	/**
	 * This constructor accepts a value for ship
	 * @param ship
	 */
	public Ship(String ship) {
		this(ship,0);
	}
	/**
	 * this constructor accepts 2 values: ship and year ship was built
	 * @param ship
	 * @param year
	 */
	public Ship(String ship, int year) {
		this.ship = ship;
		if (year < 0) {
			throw new NegativeNumberException("The year is not an acceptable value.");
		}
		this.year = year;
	}
	/**
	 * setter for ship
	 * @param ship
	 */
	public void setShip(String ship) {
		this.ship = ship;
	}
	/**
	 * setter for year
	 * @param year
	 */
	public void setYear(int year) {
		if (year < 0) {
			throw new NegativeNumberException("The year is not an acceptable value.");
		}
		this.year = year;
	}
	/**
	 * this method returns the value in ship
	 * @return ship
	 */
	public String getShip() {
		return ship;
	}
	/**
	 * this method returns the value in year
	 * @return year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * This method returns the values of the instance variables formatted in a String
	 */
	@Override
	public String toString() {
		//use the StringBuilder class
		StringBuilder str = new StringBuilder("Ship\n");
		str.append("Name of Ship: " + ship);
		str.append("\tYear: " + year + "\n");
		return str.toString();
	}

}
