import java.io.*;

public class Grep {

	public static void main(String[] args) {

		BufferedReader in = null;
		try
		{
			in = new BufferedReader(new FileReader(args[0]));
			int nr = 0, ok = 0;
			String s = in.readLine();
			while (s != null)
			{
				String[] ss = s.split(" ");
				nr++;
				for (int i = 0; i < ss.length; i++)
					if (ss[i].equals(args[1]))
					{
						System.out.println(nr + " " + s);
						ok = 1;
						break;
					}
				if (ok == 1)
					break;
				s = in.readLine();
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

