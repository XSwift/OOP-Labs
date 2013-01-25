package exercitii;

public class Student extends Persoana {
	
	int nota;
	
	public Student(){
		
	}
	
	public Student(String nume, int nota){
		super(nume);
		this.nota=nota;
	}
	
	public String toString(){
		return "Student: " + super.toString() + " " + Integer.toString(nota);
	}
	
	public void invata (){
		System.out.println(nume + " invata"); 
	}
	
	public boolean equals(Object obj) {
		if (!(obj instanceof Student) || obj==null )
			return false;
		Student stud = (Student)obj;
		if ( stud.nume.equals(this.nume) && stud.nota==this.nota )
			return true;
		else
			return false;
			
			
	}
}
