/*
 * Exercitiul 5
 */

/*
 * Continutul pachetului java.util nu este importat in mod implicit.
 */
import java.util.Scanner;

/**
 * Clasa de test pentru clasa Carte
 * @author radu
 *
 */
public class Test {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
		System.out.println("Introduceti datele pentru o noua carte, dupa cum urmeaza:");
		
		Carte c = new Carte();
		System.out.print("titlu: ");
		/*
		 * Puteti consulta documentatia metodei next() aici:
		 * http://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html#nextLine()
		 */
		c.setTitlu( s.nextLine() );
		
		System.out.print("autor: ");
		c.setAutor( s.nextLine() );
		
		System.out.print("editura: ");
		c.setEditura( s.nextLine() );
		
		int nrPagini = -1;
		
		/*
		 * De mentionat ca este de preferat executarea unor validari de acest tip in
		 * metodele setter, pentru a evita repetarea codului de validare in aplicatie
		 * si a pastra logica respectivei clase incapsulata.
		 */
		while ( nrPagini < 0 ) {
			System.out.print("numar de pagini( > 0 ): ");
			nrPagini = s.nextInt();
		}
		
		c.setNumarPagini(nrPagini);
		
		System.out.println("A fost instantiata o carte cu urmatoarele atribute:");
		/*
		 * Observati cum operatia efectuata de operatorul + definit pentru obiecte String
		 * impune conversia la String a obiectului c, efectuata implicit apelandu-se metoda
		 * toString(), comentand implementarea acestei metode veti observa modificarea
		 * outputului programului.
		 */
		System.out.println( c + ", " + c.getNumarPagini() + " pagini ");
		
		Carte cealalta = new Carte();
		cealalta.setAutor("Mihai Eminescu");
		cealalta.setEditura("All");
		cealalta.setTitlu("Poezii celebre vol.I");
		cealalta.setNumarPagini(456);
		
		System.out.println("In biblioteca exista deja cartea: " + cealalta);
		
		/*
		 * Acelasi comentariu ca in cazul clasei Operatii se aplica si clasei Verificari,
		 * metodele sale puteau fi statice, evitandu-se instantieri inutile.
		 */
		Verificari v = new Verificari();
		
		/*
		 * Testam identitatea
		 */
		System.out.println("Cartile " +
				(v.cartiIdentice(c, cealalta) ? "" : "nu ") +
				"sunt identice");
		
		/*
		 * Determinam cartea mai groasa
		 */
		Carte maiGroasa = v.carteMaiGroasa(c, cealalta);
		System.out.println("Cartea mai groasa este " +
				(maiGroasa != null ? maiGroasa : "neexistenta, au aceeasi grosime.") );
		
		s.close();
	}

}
