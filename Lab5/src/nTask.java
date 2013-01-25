
public class nTask implements Task {

	String x;
	
	public nTask(String x) {
		
		this.x = x;
		
	}
	
	@Override
	public void execute() {
		
		System.out.println(x);
		
	}

}
