import java.util.Random;

public class rTask implements Task {

	int x;
	
	public rTask() {
		
		Random randNumGenerator = new Random();
		x = randNumGenerator.nextInt(100);
		
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
		System.out.println(x);
		
	}

}
