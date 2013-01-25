import java.util.LinkedList;
import java.util.Vector;
import java.util.Enumeration;
import java.util.HashMap;
interface Observer {
	
	
public void Execute(String x); }

interface Observed
{ 
public void Notify(String x);
}

public class MessageSet implements Observed {
	
private Vector obs = new Vector();	
LinkedList<String>	List;

public MessageSet()
{
List=new LinkedList<String>();
}

public void AddL(Observer OS){
obs.addElement(OS);	
	
}

public void AddM(String n)
{
List.add(n);	
this.Notify(n);
}


public void Notify(String x) {
    for (Enumeration e=obs.elements(); e.hasMoreElements(); )
     ((Observer)e.nextElement()).Execute(x);
   
} 
    

}
