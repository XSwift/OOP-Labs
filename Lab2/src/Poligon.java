/**
 * 
 * Clasa Poligon
 * 
 * @author Andru
 *
 */
public class Poligon {
	
	/**
	 * 
	 * Vector de puncte
	 * 
	 */
	private Punct[] points;
	
	/**
	 * 
	 * Constructor ce aloca spatiu pentru n puncte
	 * 
	 * @param n	numarul de puncte
	 */
	public Poligon(int n) {
		points = new Punct[n];
	}
	
	/**
	 * 
	 * Constructor ce primeste un vector de coordonate (se presupune ca sunt 6)
	 * 
	 * @param v	vector de coordonate
	 */
	public Poligon(float[] v) {
		this(3);
		for (int i = 0; i < 6; i += 2) {
			points[i / 2] = new Punct(v[i], v[i + 1]);
		}

	}
	
	/**
	 * 
	 * Metoda ce converteste un Poligon la reprezentarea de String
	 * 
	 */
	public String toString() {
		String output = "";
		for (int i = 0; i < points.length; i++) {
			output += points[i];
		}
		return output;
	}
	
}
