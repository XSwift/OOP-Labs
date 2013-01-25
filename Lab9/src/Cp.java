
import java.io.*;

public class Cp {

	public static void main(String[] args) {
		
		BufferedReader in = null;
		PrintWriter out = null;
		Input in2 = new Input();
		in2.encrypt(args[0]);
		try
		{
			in = new BufferedReader(new FileReader(args[0]));
			char[] b = new char[100];
			out = new PrintWriter(args[1]);
			in.read(b);
			out.write(b);
		} catch (IOException e)
		{
			e.printStackTrace();
		} finally
		{
			if (in != null)
				try
				{
					in.close();
				} catch (IOException e)
				{
					System.out.println("In nu s-a inchis");
				}
			if (out != null)
				try
				{	
					out.close();
				} catch (Exception e)
				{
					System.out.println("Out nu s-a inchis");
				}
		}
	}

}

