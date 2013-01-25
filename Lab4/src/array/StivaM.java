package array;

public class StivaM extends Array {
	int size;
	
	public StivaM (){
		super();
		size = 0;
	}
	
	public int push(int nr){
		int rez = super.set(size,nr);
		if(rez != ERROR){ size++; } 
		return rez;
	}
	
	public int pop(){
		int rez = super.get(size-1);
		if(rez != ERROR)size--;
		super.set(size, 0);
		return rez;
	}
}
