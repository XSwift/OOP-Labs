
 
import java.util.Collection;
import java.util.LinkedList;
/**
 * Clasa ce defineste tipul Node
 * @author Vladimir
 * @param c // litera introdusa
 */
public class Node {
	
	char content; //Litera unui cuvant
	boolean marker; //Un marker : True - litera respectiva este ultima din cuvant , False - nu este ultima
	Collection<Node> child; // Colectia cu nodurile copil
	int doc[]=null; // Vectorul cu documentele in care se gaseste cuvantul. Va fi initializat doar cand marker-ul este True.

public Node(char c){
    child = new LinkedList<Node>();
	marker = false; 
	content = c;	
}

public Node subNode(char c){  // Se cauta copiii care au drept content litera data ca parametru
	  if(child!=null){
	   for(Node eachChild:child){
	    if(eachChild.content == c){
	     return eachChild;
	    }
	   }
	  }
	  return null;
	 }
}
