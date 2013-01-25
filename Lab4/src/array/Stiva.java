package array;

public class Stiva{

	private int nr;
	Array s;
	
	public Stiva()
	{
		s = new Array();
		nr = 0;
	}

	public int push(int val)
	{
		if(nr == 10) return -1;
		s.set(nr, val);
		nr++;
		return val;
	}
	
	public void pop()
	{
		if(nr == 0) System.out.println("Stiva goala");
		else
			{
			System.out.println(s.get(nr - 1));
			nr--;
			s.set(nr, 0);
			}
	}
	
	public int NrElem()
	{
		return nr;
	}
	
	public String toString(){
		return s.toString();
	}
	
	
}
