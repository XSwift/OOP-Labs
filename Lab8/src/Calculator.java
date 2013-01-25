import java.util.ArrayList;
import java.util.Collection;





public class Calculator {

	public int add(int x,int y) throws Exception{
		if ((x+y) >= Integer.MAX_VALUE) throw  new Exception("OverflowException");
		else if((x+y) <= Integer.MIN_VALUE) throw new Exception("UnderflowException");
		return x+y;
	}
	
	public int devide(int x, int y){
		return (int)(x/y); 
	}
	
	public int average( Collection<Integer> col) throws Exception{
		java.util.Iterator<Integer> it = col.iterator();

		int sum=0;
		while(it.hasNext()){
			sum= add(sum,it.next());
		}
		
		return devide(sum,col.size());
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Calculator t = new Calculator();
		int med = 0;
		Collection<Integer> col = new ArrayList<Integer>();
		
	col.add(2147483647);
	col.add(0);
	//col.add(1);
	
	System.out.println(Integer.MAX_VALUE);
	System.out.println(Integer.MIN_VALUE);
	try{
		med  = t.average(col);
	}catch (Exception e){
		System.out.println("Exceptie..!!!");
	}
	System.out.println(med);
	
	}

}
