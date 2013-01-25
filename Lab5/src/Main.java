
public class Main {

	public static void main(String[] args) {
		
		PrintTaskRunner x = new PrintTaskRunner(Strategy.LIFO);
		
		cTask t1 = new cTask();
		rTask t2 = new rTask();
		nTask t3 = new nTask("florin");
		
		x.addTask(t2);
		x.addTask(t2);
		x.addTask(t1);
		x.addTask(t1);
		x.addTask(t3);
		
		x.executeAll();
		
	}
	
}
