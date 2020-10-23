//Malky Sokol
package Program10;

public class NegativeNumberException extends RuntimeException{
	/**
	 * no-arg constructor
	 */
	public NegativeNumberException() {
		super("The number passed is negative, which is invalid. ");
	}
	/**
	 * constructor that receives a message
	 * @param message
	 */
	public NegativeNumberException(String message) {
		super(message);
	}

}
