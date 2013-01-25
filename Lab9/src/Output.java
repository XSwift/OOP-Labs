import java.io.*;

public class Output {

	public void decrypt(String f)
	{
		DataInputStream in = null;
		DataOutputStream out = null;
		try
		{
			in = new DataInputStream(new FileInputStream(f));
			byte[] b = new byte[100];
			in.read(b);
			for (int i = 0; i<b.length; i++)
				b[i] = (byte)(b[i]-1);
			out = new DataOutputStream(new FileOutputStream(f));
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
					System.out.println("in nu s-a inchis");
				}
			if (out != null)
				try
				{
					out.close();
				} catch (IOException e)
				{
					System.out.println("out nu s-a inchis");
				}
		}
	}
}

