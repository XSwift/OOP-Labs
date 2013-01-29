
public class ExTree {
/**
 * @author Vladimir
 * Clasa ce defineste arborele binar pentru expresie
 * Functia de inserare
 * Functia de printare
 * Functia de rezolvare	
 * @param expr, base - Primite de insert 
 * @param subTree, ind - Primite de print
 * @param subt - Primit de rezultat
 */
private ETNode root; 	
public int v3[]=null; // Vectorul rezultat al unei operatii

public void SetTree() { 
    root = null; 
  } 

public ETNode insert(String expr,Trie base, int count)
{   int v1 [] =null; // Se initializeaza 2 vectori pentru cei 2 operanzi
	int v2 [] =null;
	int k3=0;
	v1=null;
	v2=null;
	v3=null;
	
    if (count==1)	 // Daca avem un singur termen este caz de exceptie , neavand paranteze
	{ 
	  v1=base.search(expr); // Se cauta cuvantul in dictionar
	  if (v1==null) v3=null; // Daca nu este gasit, vectorul rezultat este null
	  else {v3 = new int [v1.length] ; for (int i=0;i<v1.length;i++) {v3[i]=v1[i]; 
	                                                                   
	                                                                  }
	                                                                  k3=v3.length;} // Altfel se completeaza vectorul 
	  Stacks.operand.push(new ETNode(expr)); 
	  ETNode operand1Removed = Stacks.operand.pop();
	  operand1Removed.vd=v3;
	  Stacks.operand.push(operand1Removed); // Este introdus in stiva de operanzi
	  v3=null;
	}
	else
	    {	
		 // Daca avem o expresie cu mai multi termeni
		
		k3=0;
	    v1=null;
		v2=null;
		v3=null;
		 
		
	   // Se cauta printre cazuri ce este string-ul curent : Operator, operand, paranteza. 
		if (expr.equals(" ")) {// sarim peste 
		}
		else if(expr.equals("and")) 
		{
			Stacks.operator.push(new ETNode(expr)); // Este introdusa in stiva operatorilor
		}
		else if(expr.equals("or"))
		{
			Stacks.operator.push(new ETNode(expr)); // La fel
		}
		else  if(expr.equals(")"))
		{
			ETNode operand1Removed = Stacks.operand.pop(); // Se scot 2 operanzi
			ETNode operand2Removed = Stacks.operand.pop();
			ETNode operator1Removed = Stacks.operator.pop(); // Se scoate un operator
			operator1Removed.left = operand2Removed; // Se creeaza legaturile in arborele binar
			operator1Removed.right = operand1Removed;
			// In continuare se rezolva operatia
			v1  = base.search(operand1Removed.Tdata);
			 // Daca nu este gasit in arbore, de exemplu este rezultatul a unei operatii precedente
			if (v1==null && operand1Removed.vd!=null)  v1=operand1Removed.vd;	// Se verifica daca in arborele binar are un vector nenull		
			v2  = base.search(operand2Removed.Tdata);
			if (v2==null && operand2Removed.vd!=null)  v2=operand2Removed.vd;
			
				if (operator1Removed.Tdata.equals("and"))  // Daca operatorul este and
				{	
					if (v1==null || v2==null)  v3=null;  // Daca un termen este null, intersectia este null
				     else     
			         { v3= new int[v1.length+v2.length]; 
                      					
 					 for (int k1=0;k1<v1.length;k1++) // Se face intersectia
						for (int k2=0;k2<v2.length;k2++)
							if (v1[k1]==v2[k2]) {
								
								v3[k3]=v1[k1];							
								k3++;
								
							}
			         }
				}
				else if (operator1Removed.Tdata.equals("or")) // Daca operatorul este or
					// Daca unul din termeni este null, rezultatul este celalalt termen
				{	
				    if (v1==null && v2==null) v3=null;
				    else
				    if (v1==null) {  v3 = new int [v2.length] ; for (int i=0;i<v2.length;i++) v3[i]=v2[i];k3=v3.length;} 
				    else if (v2==null) {  v3 = new int[v1.length]; for (int i=0;i<v1.length;i++) v3[i]=v1[i];k3=v3.length;}
				    else     
				    { v3= new int[v1.length+v2.length];
					for (int k1=0;k1<v1.length;k1++)
				{   boolean ok=false; // Altfel se face reuniunea, evitandu-se in prima faza elementele din intersectie. Ex: Se pune A\B
					for (int k2=0;k2<v2.length;k2++)
						if (v1[k1]==v2[k2]) ok=true;
					if (ok==false) {
						v3[k3]=v1[k1];
						k3++;        }					
			    }
				   for (int k2=0;k2<v2.length;k2++) // Se completeaza cu ce a ramas , adica B
				{      
					   v3[k3]=v2[k2];
					   k3++;
			    }
		        
				 }
				}
		    
			int v4 [] = new int[k3]; // Se trece intr-un nou vector pentru a se evita elementele nule din cauza length-ului mai mare decat 
			                         // numarul de elemente
			if (v3==null || k3==0) v4=null;
			else
			for (int i=0;i<v4.length;i++) {
				v4[i]=v3[i];
				
			}
			operator1Removed.vd=v4;
			Stacks.operand.push(operator1Removed); // Se pune in stiva
			v1=null;
			v2=null;
			v3=null;
			v4=null;
			
		}	
			
		
		else if(expr.equals("("))
		{
			//System.out.println("Am deschis paranteza");
			// Nu e nevoie sa facem nimic dar m-a ajutat la debug
		}
		
		else
		{
			Stacks.operand.push(new ETNode(expr));
			//System.out.println(current);
			// Avem un operand , il punem in stiva
		}
	
	 }
	if (count==3 || count==1)
	{	//System.out.println("Extragere radacina");
	ETNode ExT =  Stacks.operand.pop();
	root = ExT;
	return root; // returnam radacina
	}
	else 
	return null;
}

public void printTree(ETNode subTree,int ind)
{
	// Functie de printare, m-a ajutat la debug
	if (subTree.right != null)
		printTree(subTree.right, ind+1);
		
	System.out.println("\n\n\n");
	
	for (int i=0; i<ind; i++)
		System.out.print("\t");
		
	System.out.println(subTree.Tdata);
	
	if (subTree.left != null)
		printTree(subTree.left, ind+1);
	
}

public void rezultat(ETNode subt) // Functia ce intoarce rezultatul. Daca vrem rezultatul final, apelam cu radacina.
                                  // Putem obtine rezultatul la orice nivel, in functie de apel
{  int i=0;  
	if (subt.vd!=null) 
	{
	for (i=0;i<subt.vd.length-1;i++)
	System.out.print(subt.vd[i]+" ");
	System.out.println(subt.vd[i]);}
	else 
	System.out.println();
	
} 
}
