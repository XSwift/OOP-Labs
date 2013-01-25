/*
 * Testare
 */

/**
 * Clasa care contine metoda main, folosita pentru teste
 * 
 * @author radu
 *
 */
public class Main {

	
	public static void main(String[] args) {
		
		System.out.println("Testam clasa NumarComplex si clasa Operatii " +
				"folosind punctele:\n1*i si 1, 2*i");
		
		NumarComplex a = new NumarComplex();
		NumarComplex b = new NumarComplex();
		
		a.setReal(1);
		a.setImaginar(1);
		
		b.setReal(1);
		b.setImaginar(2);
		
		/*
		 * A se observa modul anevoios de a apela cele doua metode ale clasei:
		 * este nevoie de o instanta care oricum nu este caracterizata de vreun atribut.
		 * 
		 * O implementare folosind metode statice este de preferat.
		 */
		Operatii o = new Operatii();
		
		System.out.println("\nTestam adunarea:");
		NumarComplex suma = o.adunare(a, b);
		System.out.println("Rezultatul este " + suma.getReal() + ", " + 
				suma.getImaginar() + "*i");
		
		System.out.println("\nTestam inmultirea:");
		NumarComplex produs = o.inmultire(a, b);
		System.out.println("Rezultatul este " + produs.getReal() + ", " + 
				produs.getImaginar() + "*i");
		
	}

}
