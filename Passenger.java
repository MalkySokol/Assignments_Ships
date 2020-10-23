package Program10;
//Malky Sokol

public class Passenger extends Person {
	private String passportID;
	private int luggagePieces;
	/**
	 * constructor passed 7 values
	 * @param f
	 * @param l
	 * @param g
	 * @param addr
	 * @param birthdate
	 * @param passportID
	 * @param luggage
	 */
	public Passenger(String f, String l, Gender g, Address addr, String birthdate, String passportID, int luggage) {
		//call the super classes constructor
		super(f, l, g, addr, birthdate);
		this.passportID = passportID;
		if(luggage < 0) {
			throw new NegativeNumberException("The amount of luggage pieces is asigned a negative number. ");
		}
		luggagePieces = luggage;
	}
	/**
	 * copy constructor
	 * @param p
	 */
	public Passenger(Passenger p) {
		//call the super classes constructor
		super(p.getFirstName(),p.getLastName(),p.getGender(),p.getAddress(),p.getBirthdate());
		passportID = p.passportID;
		luggagePieces = p.luggagePieces;
	}
	/**
	 * this method displays the values of the instance variables in string form
	 */
	@Override
	public String toString() {
		//call the StringBuilder class
		StringBuilder s = new StringBuilder("Passenger\n");
		s.append(super.toString());
		s.append("Passport ID: " + passportID);
		s.append("\tLuggage Pieces: " + luggagePieces + "\n");
		return s.toString();
	}
	/**
	 * this method checks if 2 passenger objects are equal
	 */
	@Override
	public boolean equals(Object o) {
		//check if the addresses are the same
		if (this == o)
			return true;
		//check if o is null
		if (o == null) 
			return false;
		// if the classes are not equal then the objects must not be equal
		if(getClass() != o.getClass())
			return false;
		//typecast o
		Passenger second = (Passenger)o;
		//check if the passportID's are equal to each other
		//first check if passportID is pointing to null
		if(passportID == null) {
			//if passportID is pointing to null and and the second one is not
			if(second.passportID != null)
				return false;
		}
		//if the passportID's are not equal
		else if (!passportID.equals(second.passportID))
			return false;
		// if they are equal
		return true;
	}

}
