/*
 * Exercitiul 6
 */

/**
 * Clasa Verificari
 * 
 * @author radu
 *
 */
class Verificari {
	
	/**
	 * Metoda verifica identitatea tuturor atributelor celor doua obiecte
	 * @param a Prima carte
	 * @param b A doua carte
	 * @return Rezultatul testului
	 */
	boolean cartiIdentice( Carte a, Carte b ) {
		
		/*
		 * Identitatea a doua obiecte se testeaza folosind metoda equals()
		 * http://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#equals(java.lang.Object),
		 * operatorul == testeaza identitatea a doua referinte, fiind, implicit, mai strict.
		 * 
		 * Cu alte cuvinte, doua obiecte pot fi considerate identice (au atribute identice), chiar
		 * daca sunt obiecte diferite, caz in care testul folosind == ar returna invariabil false.
		 * 
		 * Pentru tipuri primitive, testul folosind == este valid, neimplicand conceptul de referinte.
		 * 
		 * Observati posibilitatea apelului consecutiv de metode, din codul de mai jos, folosind,
		 * succesiv, ca receptor al apelului obiectul intors de metoda precedenta.
		 * http://en.wikipedia.org/wiki/Method_chaining
		 */
		if ( a.getAutor().equals(b.getAutor()) &&
				a.getEditura().equals(b.getEditura()) &&
				a.getTitlu().equals(b.getTitlu()) &&
				a.getNumarPagini() == b.getNumarPagini()) {
			return true;		
		}
		
		return false;
	}
	
	/**
	 * Returneaza cartea mai groasa, null in caz de egalitate a nr. de pagini
	 * @param a Prima carte
	 * @param b A doua carte
	 * @return Cartea mai groasa/null
	 */
	Carte carteMaiGroasa( Carte a, Carte b ) {
		if (a.getNumarPagini() > b.getNumarPagini()) {
			return a;
		} else if (a.getNumarPagini() < b.getNumarPagini()) {
			return b;
		}
		
		return null;
	}
	
}
