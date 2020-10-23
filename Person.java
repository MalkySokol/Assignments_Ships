package Program10;
import java.time.*;
/**
 * This class holds information about a person
 * @author Malky Sokol
 */

public class Person {
	private String firstName;
	private String lastName;
	private Gender gender;
	private LocalDate birthdate;
	private Address address;
	/**
	 * birthdate is parsed to LocalDate
	 * these 5 values are sent to another constructor(that accepts a LocalDate value)
	 * @param f
	 * @param l
	 * @param g
	 * @param add
	 * @param birthdate
	 */
	public Person(String f, String l, Gender g, Address add, String birthdate ) {
		//birthdate must be of type LocalDate 
		this(f,l,g,add,LocalDate.parse(birthdate));
		}
	/**
	 * this constructor receives 8 values  
	 * @param f
	 * @param l
	 * @param g
	 * @param s
	 * @param c
	 * @param state
	 * @param zip
	 * @param Birthdate
	 */
	public Person(String f, String l, Gender g, String s, String c, String state, String zip, String birthdate) {
		// send this to another constructor
		// create the address object
		// parse birthdate to type LocalDate
		this(f,l,g,new Address(s,c,state,zip),LocalDate.parse(birthdate));
		}
	/**
	 * copy constructor
	 * @param p
	 */
	public Person(Person p) {
		this(p.firstName,p.lastName,p.gender,p.address,p.birthdate);
	}
	/**
	 * this constructor receives 5 values
	 * birthdate is passed as a LocalDate object
	 * 
	 * @param f
	 * @param l
	 * @param g
	 * @param add
	 * @param birthdate
	 */
	public Person(String f, String l, Gender g, Address add, LocalDate birthdate) {
		firstName = f;
		lastName = l;
		gender = g;
		address = add;
		this.birthdate = birthdate;
	}
	
	/**
	 * getter for firstName
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * getter for lastName
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * getter for gender
	 * @return gender
	 */
	public Gender getGender() {
		return gender;
	}
	/**
	 * getter for birthdate
	 * @return birthdate
	 */
	public LocalDate getBirthdate() {
		return birthdate;
	}
	/**
	 * getter for address
	 * @return address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * setter for lastName
	 * @param last
	 */
	public void setLastName(String last) {
		lastName = last;
	}
	/**
	 * setter for address
	 * @param addr 
	 */
	public void setAddress(Address addr) {
		address = addr;
	}
	/**
	 * This is a toString method that will display all the instance variables in a String
	 */
	@Override
	public String toString() {
		//use the StringBuilder class
		StringBuilder str = new StringBuilder("Person \n");
		str.append("First Name: " + firstName);
		str.append("\t Last Name: " + lastName);
		str.append("\t Gender: " + gender);
		str.append("\t Birthdate: " + birthdate + "\n" );
		str.append(address.toString());
		return str.toString();
	}
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
		Person next = (Person)o;
		//check if the first names are equal to each other
		//first check if firstName is pointing to null
		if(firstName == null) {
			//if firstName is pointing to null and next is not
			if(next.firstName != null)
				return false;
		}
		//if the firstNames are not equal
		else if (!firstName.equals(next.firstName))
			return false;
		//check if the last names are equal
		if(lastName == null) {
			if(next.lastName != null)
				return false;
		}
		else if (!lastName.equals(next.lastName))
			return false;
	    //check birthdates
		if(birthdate != next.birthdate) 
			return false;
		return true;
	}
	
}
