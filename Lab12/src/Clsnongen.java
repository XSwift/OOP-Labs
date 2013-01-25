import java.util.ArrayList;
import java.util.Collection;


public class Clsnongen {

	Collection c = new ArrayList();
	
	public long time(){
		long start = System.nanoTime();
		c.add(10);
		c.add(11);
		c.add(12);
		for(Object e: c)
			System.out.println(e);
		return System.nanoTime() - start;
		
	}
	
}
