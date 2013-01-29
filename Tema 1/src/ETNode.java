/**
 * Clasa ce defineste nodul pentru arborele binar pentru expresii
 * @author Vladimir
 * @param inputData
 */
public class ETNode {

	public String Tdata; // Cuvantul / operatorul
	public int vd[]=null; // Vectorul de indici
 	public ETNode left; 
 	public ETNode right;
 	
 	ETNode()    
    {
 		this.Tdata = null;
 		this.right = null;
 		this.left = null;
 		this.vd=null;
 	}
 	
 	public ETNode (String inputData)
 	{
 		Tdata = inputData;
 		this.right = null;
 		this.left = null;
 	}
 	
 	
	
	
}
