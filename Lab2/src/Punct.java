/**
 * 
 * Clasa punct
 * 
 * @author Andru
 *
 */
public class Punct {
	
	/**
	 * 
	 * Cele 2 coordonate ale unui punct
	 * 
	 */
	private float x, y;
	
	/**
	 * 
	 * Constructor pentru punct
	 * 
	 * @param x	coordonata x
	 * @param y	coordonata y
	 */
	public Punct(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * 
	 * Metoda pentru modificarea coordonatelor unui punct
	 * 
	 * @param x	noua coordonata x
	 * @param y	noua coordonata y
	 */
	public void changeCoords(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * 
	 * Metoda ce afiseaza un punct
	 * 
	 */
	public void showPoint() {
		System.out.println(this);
	}
	
	/**
	 * 
	 * Reprezentarea sub forma de String a unui punct
	 * 
	 */
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
}
