import java.util.Date;

public class PrintTaskRunner extends AbstractTaskRunner {

	public Container data;
	
	public PrintTaskRunner() {}
	
	public PrintTaskRunner(Strategy strategy) {
		
		cIFactory create = new cIFactory();
		data = create.createContainer(strategy);
		
	}
	
	public void addTask(Task task) {
		
		data.push(task);
		
	}
	
	public void executeAll() {
		
		Date dat = new Date();
		
		while(data.size() > 0) {
			data.pop().execute();
			
			System.out.println("Ora " + dat.getHours() + " minutul " + dat.getMinutes() + " secunde " + dat.getSeconds());
			
		}
		
	}
	
}
