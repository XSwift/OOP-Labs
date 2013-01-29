import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;


/**
 * 
 * Clasa ce defineste tipul dictionar
 * 
 * @author Andru
 *
 */
public class Dictionary {
	
	/**
	 * 
	 * Numarul de intrari din dictionar
	 * 
	 */
	private int numEntries = 0;
	
	/**
	 * 
	 * Constructor pentru dictionar. Primeste ca parametru numele fisierului text (dictionarului) si il citeste linie cu linie
	 * 
	 * @param inputFile
	 * 
	 * Numele fisierului text
	 */
	public Dictionary(String inputFile) {
		try{
			File dictFile = new File(inputFile);
			Scanner reader = new Scanner(dictFile);
			String strLine;
			String word;
		    int Pages[];
			int i=0;
		    Trie trie=new Trie(); //Arborele Trie in care retin cuvintele si indicii
			ExTree extree = new ExTree(); //Arborele binar pentru expresie
			ETNode root=new ETNode(); // Radacina pentru arborele binar
			
			while (reader.hasNextLine()) {
				strLine = reader.nextLine(); // in strLine este linia curenta din dictionar
				//System.out.println(strLine);
				numEntries++;
				
				StringTokenizer ST = new StringTokenizer(strLine); // Se imparte linia curenta , spatiul " " fiind separatorul
				word = ST.nextToken(); // Primul element este cheia
				Pages= new int[ST.countTokens()]; // Initializez vectorul pentru indici
				i=0;
				while (ST.hasMoreElements()) 
				  {Pages[i]=Integer.parseInt(ST.nextToken()); // Pun indicii in vector, convertiti la integer
				   i++;
				  }
				 trie.insert(word,Pages);	// Apelez functia de insert in Trie
				 
				 Pages=null;

				
			}
			reader.close();
			
			
			//System.out.print("Enter something here : ");
			String Expression="";
			Scanner scanIn = new Scanner(System.in);
			do {
			Expression = scanIn.nextLine(); // Scanez fiecare linie pana intalnesc cuvantul 'exit'
			if (!Expression.equals("exit")){
			//System.out.println(Expression);
			StringTokenizer expr = new StringTokenizer(Expression," ()",true);	
			//System.out.println(expr.countTokens());
			if (expr.countTokens()==1) { root=extree.insert(expr.nextToken(), trie, 1);}
			else
			{	
			while (expr.hasMoreTokens())
			{   if (expr.countTokens()==1) {  root=extree.insert(expr.nextToken(),trie,3); }
			
			    else { root=extree.insert(expr.nextToken(),trie,2);} // Apelez functia de insert a expresiei in arbore ce imi returneaza radacina
			}
			}
			extree.rezultat(root); // Apelez functia ce imi intoarce rezultatul expresiei pentru arborele cu radacina data drept parametru
			}
			
		    } while (!Expression.equals("exit"));
			scanIn.close();
		    
		}catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
	
	/**
	 * 
	 * Metoda ce returneaza numarul de intrari din dictionar
	 * 
	 * @return
	 * Numarul de intrari din dictionar
	 */
	public int getnumEntries() {
		return numEntries;
	}
}
