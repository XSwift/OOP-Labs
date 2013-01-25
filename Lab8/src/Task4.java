
public class Task4 {


		public int verificare(int j) throws Exception{
			int x=1000;
			if (x < j) throw new Exception("Clau");
			return x;
		}
		
		public boolean verifica(int[] b){
			for(int i=0; i< b.length; i++ ){
				try{
					verificare(b[i]);
					return true;
				}catch (Exception e){ return false;
					
				}finally {
					System.out.println(b[i]);
				}
			}return true;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task4 t = new Task4();
		int alfa = 1007;
		int [] beta = {100,1072};
		if (t.verifica(beta)) 
			System.out.println("terminat!!!");
	}

}
