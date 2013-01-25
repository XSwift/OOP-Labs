import java.util.Enumeration;

import java.util.LinkedList;


class Observer1 implements Observer{
Map o1= new Map();


public void Execute(String x)
  { //System.out.println("A change has taken place from O1");
	String r = o1.get(x);
    if (r!=null) System.out.println(x +" se traduce in " +r);
	else System.out.println(x);
  }
}
	
class Observer2 implements Observer{
	GermanMap o2=new GermanMap();
	
	public void Execute(String x)
  { //System.out.println("A change has taken place from O2");
	String r= o2.get(x);
	if (r!=null) System.out.println(x+ " se traduce in " + r);
	else System.out.println(x);
  }
}
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageSet Set= new MessageSet();
		Set.AddL(new Observer1());
		Set.AddL(new Observer2());
		
		Set.AddM("nume");
		Set.AddM("cheie");
		Set.AddM("copil");

	}

}
