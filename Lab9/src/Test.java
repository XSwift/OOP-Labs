import java.io.*;

public class Test {

	
	public static void main(String[] args) {

		Input in = new Input(); 
		in.encrypt("test.txt");
		DataInputStream out = null;
		Wc test = new Wc();
		//test.main(args);
		Grep test2 =  new Grep();
		//test2.main(args);
		Ex5 ex = new Ex5();
		//ex.main(args);
		Ex6 ex2 = new Ex6();
		ex2.main(args);
		try
		{
			out = new DataInputStream(new FileInputStream("test.txt"));
			String s = out.readLine();
			while(s != null)
			{
				System.out.println(s);
				s = out.readLine();
			}
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
					System.out.println("Out nu s-a inchis");
				}
		}

		Output in2 = new Output();
		in2.decrypt("test.txt");
		DataInputStream out2 = null;
		try
		{
			out2 = new DataInputStream(new FileInputStream("test.txt"));
			String s = out2.readLine();
			while (s != null)
			{
				System.out.println(s);
				s = out2.readLine();
			}
		} catch (IOException e)
		{
			e.printStackTrace();
		} finally
		{
			if (out2 != null)
				try
				{
					out2.close();
				} catch (IOException e)
				{
					System.out.println("Out2 nu s-a inchis");
				}
		}
	}

}

