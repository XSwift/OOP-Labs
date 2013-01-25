import Interfaces.Iterator;
import Interfaces.ListObserver;
import Interfaces.Observed;



/**
 * Clasa wrapper peste un vector de elemente reale.
 * Asigura redimensionarea automata.
 * 
 * @author Mihnea
 *
 */
public class MyArrayList implements Observed {
	
	private int age = 0;
	
	/**
	 * Suportul propriu-zis de stocare a elementelor.
	 * Absenta unui specificator explicit de acces induce caracterul implicit,
	 * package private.
	 */
	float[] vector;
	
	/**
	 * Numarul efectiv (util) de elemente din vector, care este mai mic sau egal
	 * cu capacitatea (length) cu care a fost initializat vectorul.
	 */
	private int size = 0;
	
	/**
	 * Constructorul cu parametru.
	 * 
	 * @param	size
	 * 			capacitatea initiala a vectorului.
	 */
	public MyArrayList(int size) {
		vector = new float[size];
	}
	
	/**
	 * Constructor fara parametri, initializeaza capacitatea vectorului la 10.
	 */
	public MyArrayList() {
		// Apel la constructorul cu parametru.
		this(10);
	}
	
	/**
	 * Adauga un element la sfarsitul vectorului. Dubleaza mai intai capacitatea
	 * vectorul este deja plin.
	 * 
	 * @param	value
	 * 			valoarea de adaugat
	 */
	public void add(float value) {
		this.age++;
		// Intai verificam daca exista loc pentru adaugare
		if (size == vector.length) {
			// Trebuie creat un vector de dimensiune dubla
			float copy[] = new float[2 * vector.length];
			
			// Copiem continutul vechi in noul vector
			System.arraycopy(vector, 0, copy, 0, vector.length);
			
			/* Copiere de referinte!
			 * Orice referinta la vechiul vector SE PIERDE!
			 */
			vector = copy;
		}
		
		// Adaugam elementul la sfarsit.
		vector[size++] = value;
	}
	
	/**
	 * Verifica daca un element exista in vector.
	 * 
	 * @param	value
	 * 			valoarea de cautat
	 * @return	{@code true} daca elementul exista.
	 */
	public boolean contains(float value) {
		// Compararea numerelor reale se face inexact, pentru evitarea erorilor de reprezentare interna.
		for(int i = 0; i < size; i++)
			if (Math.abs(vector[i] - value) < 0.001f)
				return true;
		
		return false;
	}

	/**
	 * Sterge elementul de la pozitia data.
	 * 
	 * @param	index
	 * 			pozitia elementului eliminat.
	 */
	public void remove(int index) {
		this.age++;
		// Verificam pozitia
		if (! isIndexValid(index, "remove"))
			return;
		
		/* Eliminam efectiv elementul, prin deplasarea elementelor
		 * de la dreapta acestuia cu o pozitie spre stanga.
		 */
		for(int i = index; i < size - 1; i++)
			vector[i] = vector[i + 1];
		
		size--;
	}
	
	/**
	 * Intoarce elementul de la pozitia data.
	 * 
	 * @param	index
	 * 			pozitia elementului de intors
	 * @return	elementul
	 */
	// Metoda de accesare a unui element
	public float get(int index)	{
		// Verificam pozitia
		if (! isIndexValid(index, "get"))
			return 0.0f;
		
		return vector[index];
	}
	
	/**
	 * Intoarce dimensiunea vectorului (numarul efectiv de elemnte).
	 * 
	 * @return	dimensiunea
	 */
	public int size() {
		return size;
	}
	
	/**
	 * Intoarce o reprezentare sub forma de sir a vectorului.
	 * 
	 * @return	vectorul sub forma de sir
	 */
	public String toString() {
		String str = "[";
		
		if (size > 0)
			str += vector[0];
		
		for(int i = 1; i < size; i++)
			str += ", " + vector[i];
		
		str += "]";
		
		return str;
	}
	
	/**
	 * Metoda verifica daca indexul se incadreaza intr-un interval acceptabil,
	 * tiparind un mesaj de eroare daca raspunsul este negativ.
	 * 
	 * @param	index
	 * 			pozitia testata
	 * @param	context
	 * 			un mesaj auxiliar cu care este imbogatit mesajul de eroare,
	 * 			de obicei numele functiei din care este apelata aceasta functie
	 * @return	{@code true} daca index-ul este valid
	 */
	private boolean isIndexValid(int index, String context) {
		if (index < 0 || index >= size)	{
			System.out.println(context + ": invalid index of " + index + " in array of size " + size);
			return false;
		}
		
		return true;
	}
	
	public class BrowseArray implements Iterator{
		
		private int age;
		private int size;
		private int current;
		
		public BrowseArray(){
			this.age  = MyArrayList.this.age;
			this.size = MyArrayList.this.size();
			this.current = -1;
		}
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return this.current < this.size-1 ? true : false;
		}

		@Override
		public float next() {
			// TODO Auto-generated method stub
			if (this.age != MyArrayList.this.age){
				return -1;
			}
			
			if (!this.hasNext()){
				return 0;
			}
			
			this.current++;
			return MyArrayList.this.get(this.current);
		}
		
		public void browse(){
			while(this.hasNext()){
				System.out.println(this.next());
			}
		}
		
	}
	
	public BrowseArray iterator(){
		BrowseArray ar = new BrowseArray();
		return ar;
	}

	@Override
	public void registerObserver(ListObserver o) {
		// TODO Auto-generated method stub
		
	}
	
}
