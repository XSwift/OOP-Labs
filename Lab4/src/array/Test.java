package array;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Stiva st = new Stiva();
		System.out.println(st.push(2));
		System.out.println(st.toString());
		System.out.println("Nr de elem din stiva este :" + st.NrElem());
		System.out.println(st.push(3));
		System.out.println("Nr de elem din stiva este :" + st.NrElem());
		System.out.println(st.toString());
	  
		st.pop();
		System.out.println(st.toString());
		  
				
				/*StivaM sm = new StivaM();
				sm.push(2);
				sm.push(7);
				System.out.println(sm.toString());
				sm.pop();
				System.out.println(sm.toString());*/
	}
}
