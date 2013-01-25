
public class CTask implements Task {

	static int x = 0;
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println(x++);
	}
}
