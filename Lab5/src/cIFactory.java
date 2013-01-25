
public class cIFactory implements IFactory {

	@Override
	public Container createContainer(Strategy strategy) {
		// TODO Auto-generated method stub
		
		if (strategy == Strategy.FIFO) return new Stack();
		return new Queue();
	}
	
}
