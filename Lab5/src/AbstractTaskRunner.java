
public abstract class AbstractTaskRunner {

	public Container data;
	
	public AbstractTaskRunner() {}
	
	public AbstractTaskRunner(Strategy strategy) {
		
		cIFactory create = new cIFactory();
		data = create.createContainer(strategy);
		
	}
	
	public void addTask(Task task) {
		
		data.push(task);
		
	}
	
	public void executeAll() {
		
		while(data.size() > 0)
			data.pop().execute();
		
	}
	
}
