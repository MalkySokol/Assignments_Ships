package Program10;
//Malky Sokol

public class ExceedsMaxPassengersException  extends RuntimeException {
	/**
	 * no arg constructor
	 */
	public ExceedsMaxPassengersException() {
		super("The amount of passengers already reached it's max. ");
	}
	/**
	 * the constructor receives a message
	 * @param message
	 */
	public ExceedsMaxPassengersException(String message) {
		super(message);
	}

}
