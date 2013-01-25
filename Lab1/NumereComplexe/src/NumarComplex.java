/*
 * Exercitiul 2
 */

/**
 * NumarComplex
 * 
 * @author radu
 *
 */
class NumarComplex {

	/*
	 * Campurile re si im, specificate private, pentru a realiza incapsularea acestora.
	 */
	private float re, im;

	/*
	 * Metode getter si setter pentru a exterioriza campurile incapsulate printr-un API,
	 * evitand cuplarea stransa a claselor.
	 * 
	 * Vezi http://en.wikipedia.org/wiki/Coupling_(computer_programming), pentru detalii.
	 */
	public float getReal() {
		return re;
	}

	public void setReal(float re) {
		this.re = re;
	}

	public float getImaginar() {
		return im;
	}

	public void setImaginar(float im) {
		this.im = im;
	}
	
}
