import java.util.ArrayList;


public class Queue implements Container {

	ArrayList<Task> x = new ArrayList<Task>();
	int head, tail;
	
	@Override
	public Task pop() {
		// TODO Auto-generated method stub
		
		if (x.size() > 0) {
			Task a = x.get(0);
			x.remove(0);
			return a;
		}
		
		return null;
		
	}

	@Override
	public void push(Task task) {
		// TODO Auto-generated method stub
			
			x.add(task);

		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return x.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (x.size() == 0)
			return true;
		return false;
	}

	@Override
	public void transferFrom(Container container) {
		// TODO Auto-generated method stub
		
		while (!container.isEmpty()) {
			
			this.push(container.pop());
			
		}
		
	}

	
	
}
