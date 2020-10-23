//Malky Sokol
package Program10;

public class PassengerExistsException extends RuntimeException {
	/**
	 * no arg constructor
	 */
	public PassengerExistsException() {
		super("The passenger already exists.");
	}
	/**
	 * constructor that receives a  message
	 * @param message
	 */
	public PassengerExistsException(String message) {
		super(message);
	}

}
