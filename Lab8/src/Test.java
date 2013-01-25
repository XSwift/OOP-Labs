import java.util.ArrayList;
import java.util.Collection;



public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

	
		
		MTask t1  = new MTask("mama");
		CTask t2 = new CTask();
		
		
		
		
	if (t1.s == null)
		{throw new Exception("Sirul este null");
		
		}
	t1.execute();
	
	if (t2.x == 0)	{
		throw new Exception("Este prima interatie");
	}
	t2.execute();
	}
   
}
