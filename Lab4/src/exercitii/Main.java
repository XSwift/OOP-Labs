package exercitii;

//import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Profesor prof = new Profesor ("Negreanu", "POO");
		Student stud = new Student ("Stefan", 10);
		System.out.println(prof.toString());
		System.out.println(stud.toString());
		
		Persoana[] pers = new Persoana[2]; // upcasting - vectorul Persoana va fi populat cu obiecte de tip Profesor si Student
		pers[0] = new Profesor ("Popovici", "AA");
		pers[1] = new Student ("Andrei", 10);
		
		//Scanner s = new Scanner(System.in);
		
		//for(int i=0; i<3; i++){
		//	System.out.println("Profesor:");
		//	String p = s.nextLine();
		//	System.out.println("Materie:");
		//	String m = s.nextLine();
		//	p[i] = new ..args.
		//}
		
		for(int i=0; i<2; i++)
			System.out.println(pers[i].toString());
		
		for(int i=0; i<2; i++){ //downcasting
			if(pers[i] instanceof Profesor)
				((Profesor)pers[i]).preda();
			if(pers[i] instanceof Student)
				((Student)pers[i]).invata();
		}
		
		System.out.println(stud.equals(pers[1]));
	}

}
