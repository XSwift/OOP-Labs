/**
 * Clasa ce defineste stiva operatorilor
 * @author Vladimir
 *
 */
public class OStacks {
private  ETNode OS[];
private  int nr2;

public  ETNode pop(){
	if (nr2==0) return null;
	else { nr2--; return OS[nr2];} 
}

public OStacks(int size)
{   
	OS= new ETNode[size];
	nr2=0;
}

public  void push(ETNode nod2)
	{   System.out.println("Pun "+nod2.Tdata);
		OS[nr2]=nod2;
		nr2++;
	}
}
