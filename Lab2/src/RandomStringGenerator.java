import java.util.Random;

/**
 * 
 * Clasa pentru generarea de String-uri aleatoare
 * 
 * @author Andru
 *
 */
public class RandomStringGenerator {
	private char[] alphabet;
	private int len;
	
	public RandomStringGenerator(int len, String alphabet) {
		this.alphabet = alphabet.toCharArray();
		this.len = len;
	}
	
	/**
	 * 
	 * Metoda ce genereaza un String aleator. Se iau caractere random din alfabet si se
	 * concateneaza la output.
	 * 
	 * @return	String-ul aleator
	 */
	public String next() {
		if (len > 0 && alphabet != null) {
			String randomString = "";
			Random rg = new Random();
			for (int i = 0; i < len; i++)
				randomString += alphabet[rg.nextInt(alphabet.length)];
			return randomString;
		}
		return null;
	}
	
}
