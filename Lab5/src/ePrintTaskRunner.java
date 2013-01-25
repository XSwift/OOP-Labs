
public class ePrintTaskRunner extends PrintTaskRunner {

	int sleep;
	
	public ePrintTaskRunner(int x) {
		
		sleep = x;
		
	}
	
	public void executeAll() {
		
		while(data.size() > 0) {
			
			try {
				
				data.pop().execute();
			    Thread.sleep(sleep); // milisecunde
			    
			} catch (InterruptedException e) {
				
			    e.printStackTrace();
			    
			}
			
		}
		
	}
	
}
