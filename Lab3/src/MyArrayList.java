
public class MyArrayList {

	private float vector[];
	private int i;
	
	public MyArrayList(){
		vector= new float[10];
		
	}
	
	public MyArrayList(int length) {
		vector=new float[length];
	}
	
	public void add(float value){
		if (i==vector.length)
		{
			float[] vec=new float[vector.length * 2];
			for(int j=0; j<i; j++)
				vec[j]=vector[j];
			vector=vec;
		}
		vector[i++]=value;
	}
	
	public boolean contains(float value){
		for(int j=0; j<i; j++)
			if (vector[j]==value) return true;
			return false;
	}
	
	public void remove(int index){
		if (index > i) System.out.println("Index invalid");
		for(int j=index; j<i-1; j++)
			vector[j]=vector[j+1];	
	}
	
	public float get(int index){
		return vector[index];
	}
	
	public int size(){
		return i;
	}
	
	public String toString(){
		String s="";
		s+="[";
		for(int j=0; j<i; j++)
			s+=vector[i];
		s+="]";
		return s;	
	}
	
}
