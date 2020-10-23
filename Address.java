package Program10;
/**
 * This is an address class
 * @author Malky Sokol
 */
public class Address {
	//instance variables
	private String street;
	private String city;
	private String state;
	private String zipcode;
	/**
	 * this is a constructor that is passed 4 values
	 * @param street
	 * @param city
	 * @param state
	 * @param zip
	 */
	public Address(String street, String city, String state, String zip) {
		//set the instance variables to the given values
		this.street = street;
		this.city = city;
		this.state = state;
		zipcode = zip;
	}
	/**
	 * This method is a getter for the street field
	 * @return street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * This method is a getter for  the city field
	 * @return city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * This method is a getter for the state field
	 * @return state
	 */
	public String getState() {
		return state;
	}
	/**
	 * This method is a getter for the zipcode field
	 * @return zipcode
	 */
	public String getZip() {
		return zipcode;
	}
	@Override
	public String toString() {
		//use the StringBuilder class
		StringBuilder str = new StringBuilder("Address \n");
		str.append("Street: " + street);
		str.append("\t City: " + city);
		str.append("\t State: " + state);
		str.append("\t ZipCode: " + zipcode + "\n");
		return str.toString();
	}
	
}
