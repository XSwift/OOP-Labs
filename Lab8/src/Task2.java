


public class Task2 {

	
	
	static  public  int[]  met1() {
		 return new int[1024*1024*1024];
				 }
	static public int met2(int x){
		
		if (x == 0) return 0;
		return met2(x-10);
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x;
		int y = 1024*1024;
		int z;
		try {
			x= met1();
		}catch (OutOfMemoryError e){
			System.out.println("OutOfMemoryError");
		}
			
		try{
			 z = met2(y);
		} catch ( StackOverflowError e1){
			System.out.println("StackOverflowError");
		}
		
		
		 
		
		 
	}

}
