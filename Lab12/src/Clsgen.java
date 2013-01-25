import java.util.ArrayList;
import java.util.Collection;


public class Clsgen {

	Collection<Integer> c = new ArrayList<Integer>();
	
	
	public long time(){
		long start = System.nanoTime();
		c.add(10);
		c.add(11);
		c.add(12);
		for(Integer e : c)
			System.out.println(e);
		return System.nanoTime() - start;
	}
	
	
	
}
