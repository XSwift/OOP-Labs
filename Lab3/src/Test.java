import java.util.*;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArrayList v=new MyArrayList();
		v.add(5f);
		v.add(3f);
		v.add(1f);
		
		for(int j=0; j<10;j++)
		{
		Random generator=new Random();
		float value=generator.nextFloat();
		v.add(value);
		}

		
		for (int j=0; j<v.size(); j++)
		{
			Random generator=new Random();
			float value=generator.nextFloat();
			System.out.println(v.contains(value));
		}
		
		for (int j=0; j<v.size(); j++)
		System.out.println(v.get(j)+ "");
		
		v.remove(2);
		
		System.out.println(v.toString());
		
	}
}
