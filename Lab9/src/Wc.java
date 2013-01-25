import java.io.*;

public class Wc {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader in = null;
		Input in2 = new Input();
		in2.encrypt(args[0]);
		try
		{
			in = new BufferedReader(new FileReader(args[0]));
			if (args.length == 2 && args[1].equals("-l"))
			{
				int nr = 0;
				while (in.readLine() != null)
					nr++;
				System.out.println("Sunt "+ nr +" linii");
			}
			else
			{
				int nr = 0;
				String s = in.readLine();
				while (s != null)
				{
					String[] ss = s.split(" ");
					nr += ss.length;
					s = in.readLine();
				}
				System.out.println("Sunt " + nr +" cuvinte");
			}
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
		}
	}

}
