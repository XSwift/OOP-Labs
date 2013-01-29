/**
 * Clasa ce defineste stiva operanzilor
 * @author Vladimir
 *
 */
public class TStacks {

private   ETNode TS[]=null;
private  int nr=0;

public  ETNode pop(){
	if (nr==0) return null;
	else { nr--; 
	       ETNode obj=TS[nr];
	       TS[nr]=null;
	       return obj;} 
}

public TStacks(int size)
{   
	TS= new ETNode[size];
	nr=0;
}


public  void push(ETNode nod)
{   System.out.println("Pun "+nod.Tdata);
    
    //System.out.println(nr);
    TS[nr]=nod;
    nr++;
	System.out.println("Pun "+TS[nr].Tdata);
}

}
