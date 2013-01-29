/**
 * Clasa ce defineste tipul Trie
 * @author Vladimir
 * @param s , Vec[] - Primite de insert | s si de search
 */
public class Trie {
	
 public Node rootT;
	 
 public Trie(){
 rootT = new Node(' ');

 }
 
 
 public void insert(String s, int Vec[]){
	  Node current = rootT; 
	  if(s.length()==0) { //cazul in care string-ul este vid
	   current.marker=true;
	   current.doc=new int[Vec.length];
	   current.doc=Vec;
	   
	  }
	  
	  for(int i=0;i<s.length();i++){ // Pentru fiecare litera a cuvantului
	   Node child = current.subNode(s.charAt(i)); // Se cauta litera printre copiii nod-ului curent
	   if(child!=null){ 
	    current = child; // Daca  este gasit, se trece la el
	   }
	   else{
	    current.child.add(new Node(s.charAt(i))); // Daca nu este gasit, se creeaza unul si se leaga de nodul curent
	    current = current.subNode(s.charAt(i));
	   }
	   
	   if(i==s.length()-1){ // Daca este ultima litera din cuvant, se pune marker-ul true si se transmite vectorul de indici.
	    current.marker = true; 
	    current.doc=new int[Vec.length];
	    current.doc=Vec;
	    
	  }	   
	   
	  } 
	 }
 
 public int[] search(String s){ // Functia ce cauta un cuvant in arbore
	  Node current = rootT; // Se pleaca de la radacina
	  while(current != null){ // Cat timp are unde cauta
	   for(int i=0;i<s.length();i++){    // Se ia fiecare litera in parte
	    if(current.subNode(s.charAt(i)) == null) // Se cauta litera printre nodurile child
	     return null;
	    else
	     current = current.subNode(s.charAt(i)); // Daca este gasita, se trece mai departe
	   }
	   
	   if (current.marker == true) // Daca a fost gasit, adica au fost parcurse literele si marker-ul este true, se returneaza vectorul
	    return current.doc;
	   else
	    return null;
	  }
	  return null; 
	 }
 
}
