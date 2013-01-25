/*
 * Exercitiul 3
 */

/**
 * Operatii
 * 
 * Implementeaza cateva din operatiile de baza pentru numere complexe: adunare, inmultire.
 * 
 * @author radu
 *
 */
class Operatii {
	
	/**
	 * Metoda returneaza suma a doua numere complexe, fara a modifica vreun termen.
	 * @param a Primul termen
	 * @param b Al doilea termen
	 * @return Suma
	 */
	public NumarComplex adunare(NumarComplex a, NumarComplex b) {
		NumarComplex rez = new NumarComplex();
		
		rez.setReal(a.getReal() + b.getReal());
		rez.setImaginar(a.getImaginar() + b.getImaginar());
		
		return rez;
	}
	
	/**
	 * Metoda returneaza produsul a doua numere complexe, fara a modifica vreun factor.
	 * @param a Primul factor
	 * @param b Al doilea factor
	 * @return Produsul
	 */
	public NumarComplex inmultire(NumarComplex a, NumarComplex b) {
		NumarComplex rez = new NumarComplex();
		
		rez.setReal(a.getReal() * b.getReal() -
				a.getImaginar() * b.getImaginar());
		
		rez.setImaginar(a.getReal() * b.getImaginar() +
				a.getImaginar() * b.getReal());
		
		return rez;
	}

}
