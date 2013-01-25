
public class cTask implements Task {

	int x;
	
	@Override
	public void execute() {
		
		System.out.println(x++);
		
	}

}
