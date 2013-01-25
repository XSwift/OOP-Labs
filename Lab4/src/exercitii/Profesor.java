package exercitii;

public class Profesor extends Persoana {
	
	String materie;
	
	public Profesor(){
		
	}
	
	public Profesor(String nume, String materie){
		super(nume);
		this.materie = materie;
	}
	
	public String toString(){
		return "Profesor: " + super.toString() + " " + materie;
	}
	
	public void preda(){
		System.out.println(nume + " preda");
	}
}
