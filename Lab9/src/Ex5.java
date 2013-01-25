import java.io.*;

public class Ex5 {

	public static long dimensiune(File f)
	{
		File[] list = f.listFiles();
		if (f.isFile())
			return f.length();
		long d = 0;
		for (int i=0; i<list.length; i++)
			d = d + dimensiune(list[i]);
		return d;
	}
	
	public static void main(String[] args) {
		
		File path=new File(".");
		if (path.isFile())
			System.out.println(path.getName()+" "+path.length());
		else if (path.isDirectory())
		{
			long dim = dimensiune(path);
			System.out.println(path.getName()+" "+dim);
		}
		
	}

}

