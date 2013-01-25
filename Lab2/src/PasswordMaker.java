
/**
 * 
 * Clasa pentru generarea de parole personalizate
 * 
 * @author Andru
 *
 */
public class PasswordMaker {
	private static final int MAGIC_NUMBER = 42;
	private final String password; // blank final, initializat in constructor
	
	/**
	 * 
	 * Constructorul initializeaza parola construita din nume, prenume si varsta
	 * 
	 * @param firstName	nume
	 * @param lastName	prenume
	 * @param age	varsta
	 */
	public PasswordMaker(String firstName, String lastName, int age) {
		RandomStringGenerator rsg = new RandomStringGenerator(MAGIC_NUMBER, "nuclear");
		password = firstName.substring(firstName.length() - age % 3 - 1) + rsg.next() + (age + lastName.length());
	}
	
	/**
	 * 
	 * Metoda ce returneaza parola generata
	 * 
	 * @return
	 */
	public String getPassword() {
		return password;
	}
	
	
}
