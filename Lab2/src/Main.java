
/**
 * 
 * Clasa de test
 * 
 * @author Andru
 *
 */
public class Main {
	
	/**
	 * 
	 * Metoda pentru care masuram timpul la taskul 3
	 * 
	 * @param isPrimitive
	 */
	@SuppressWarnings("unused")
	public static void task3(boolean isPrimitive) {
		int x;
		Integer y;
		
		for (int i = 0; i < 10000; i++){
			if (isPrimitive)
				x = 2 + 3;
			else
				y = new Integer(2 + 3);
		}		
	}

	/**
	 * 
	 * Masuram diferenta de timp intre 2 + 3 si new Integer(2 + 3)
	 * 
	 * @param isPrimitive	Operatia este primitiva sau nu
	 * @return
	 */
	public static long run(boolean isPrimitive) {
	    long start = System.nanoTime();
	    task3(isPrimitive);
	    return System.nanoTime() - start;
	}
	
	/**
	 * 
	 * Metoda ce masoara consumul de memorie
	 * 
	 */
	public static void showUsedMemory() {
	    long usedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
	    System.out.println(usedMem);
	}
	
	/**
	 * 
	 * Testam diferenta de memorie introdusa de folosirea lui String literal versus obiecte.
	 * In cazul literalului se foloseste String pool iar consumul este mai mic.
	 * 
	 */
	public static void task4() {
		int N = 50000;
		String[] stringVector = new String[N];
		
		System.out.println("Inainte: ");
		showUsedMemory();
		for (int i = 0; i < N; i++) {
			stringVector[i] = "abc";
		}
		System.out.println("Dupa introducere de literal: ");
		showUsedMemory();
		
		for (int i = 0; i < N; i++) {
			stringVector[i] = new String("abc");
		}
		System.out.println("Dupa introducere obiecte");
		showUsedMemory();
		
	}


	public static void main(String[] args) {
		
		// Task 1 & 2
		System.out.println("Task 1 & 2");
		float v[] = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f};
		Poligon triunghi;
		
		triunghi = new Poligon(v);
		System.out.println(triunghi);

		
		// Task 3
		System.out.println("\nTask 3");
		System.out.println("Timp pentru 2 + 3: " + run(true));
		System.out.println("Timp pentru new Integer(2 + 3): " + run(false));
		
		// Task 4
		System.out.println("\nTask 4");
		System.out.println("Memorie utilizata");
		task4();

		// Task 5
		RandomStringGenerator rsg = new RandomStringGenerator(10, "abcdefghij");
		System.out.println("\nTask 5");
		System.out.println("String-uri generate aleator: ");
		System.out.println(rsg.next());
		System.out.println(rsg.next());
		
		// Task 6
		PasswordMaker pm = new PasswordMaker("Luke", "Skywalker", 22);
		System.out.println("\nTask 6");
		System.out.println("Parola generata: ");		
		System.out.println(pm.getPassword());
		
		// Task 7
		Test t1, t2;
		System.out.println("\nTask 7");
		t1 = new Test(1, 2); // x = 1, y = 2
		t2 = new Test(3, 4); // x = 3, y = 4
		// pentru ca y e static, el nu depinde de instanta, deci atat pentru t1 cat si pentru t2, y = 4
		t1.show(); // 1 4
		t2.show(); // 3 4
	}

}
