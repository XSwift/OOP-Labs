
public class CountTaskRunner extends AbstractTaskRunner {
	
	int count = 0;
	
	public void executeAll() {
		
		while(data.size() > 0) {
			
			data.pop().execute();
			count++;
			
		}
		
	}
	
}
