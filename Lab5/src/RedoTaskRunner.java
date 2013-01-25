
public class RedoTaskRunner extends AbstractTaskRunner {

	Stack data2;
	
	public void executeAll() {
		
		while(data.size() > 0) {
			
			Task x = data.pop();
			x.execute();
			data2.push(x);
		
		}
			
	}
	
	public void executeAgain() {
		
		while(data2.size() > 0)
			data2.pop().execute();	
	
	}
	
}
