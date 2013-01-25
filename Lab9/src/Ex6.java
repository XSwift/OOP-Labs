import java.io.*;

public class Ex6 {

	public static void main(String[] args) {
		
		RandomAccessFile out = null;
		try
		{
			out = new RandomAccessFile("secret.txt", "rw");
			long l = out.readLong();
			out.seek(l);
			long nr = out.readInt();
			System.out.println(nr);
		} catch (IOException e)
		{
			e.printStackTrace();
		} finally
		{
			if (out != null)
				try
				{
					out.close();
				} catch (IOException e)
				{
					e.printStackTrace();
				}
		}
		
		
	}

}
