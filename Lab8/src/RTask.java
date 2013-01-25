import java.util.Random;


public class RTask implements Task {

	int x;
	
	public RTask(){
	Random r = new Random();
	this.x = r.nextInt(10);
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println(x);
	}
}
