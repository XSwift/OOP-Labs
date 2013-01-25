/*
 * Exercitiul 5
 */

/**
 * Clasa Carte
 * 
 * @author radu
 *
 */
class Carte {
	
	/*
	 * Atributele clasei, incapsulate si exteriorizate prin metode setter si getter.
	 */
	private String titlu, autor, editura;
	private int numarPagini;
	
	/*
	 * Metode getter si setter (ca in cazul clasei Numar Complex)
	 * 
	 * Se pot genera automat folosind Source -> Generate Getters and Setters ...
	 * si bifand variabilele ce se doresc exteriorizate.
	 */
	public String getTitlu() {
		return titlu;
	}
	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditura() {
		return editura;
	}
	public void setEditura(String editura) {
		this.editura = editura;
	}
	public int getNumarPagini() {
		return numarPagini;
	}
	public void setNumarPagini(int numarPagini) {
		//if ( numarPagini > 0 ) {
			this.numarPagini = numarPagini;
		//}
	}
	
	/*
	 * Exercitiul 7 
	 */
	
	/**
	 * Metoda care returneaza o reprezentare sub forma de String, "human-readable",
	 * a atributelor clasei.
	 * 
	 * Aceasta metoda este apelata cand se doreste obtinerea unei reprezentari
	 * String a obiectului de catre JVM (a se vedea in metoda main a clasei Test).
	 */
	public String toString(){
		if ( titlu != null && autor != null && editura != null ) {
		 return titlu.toUpperCase() + ", " + autor + ", " + editura.toLowerCase();
		} else {
			return "Carte set incomplet de atribute";
		}
	}

}
