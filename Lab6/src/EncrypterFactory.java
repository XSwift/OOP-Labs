import java.util.Random;

import Interfaces.Encrypter;


public class EncrypterFactory {
	
	public class Encrypter1 implements Encrypter{
		@Override
		public String encrypt(String s) {
			// TODO Auto-generated method stub
			char[] c = s.toCharArray();
			
			for (int i = 0; i < c.length; i++) {
				c[i] += 1;
			}
			
			return new String(c);
		}

		@Override
		public String decrypt(String s) {
			// TODO Auto-generated method stub
			char[] c = s.toCharArray();
			
			for (int i = 0; i < c.length; i++) {
				c[i] -= 1;
			}
			
			return new String(c);
		}
	}
	
	public class Encrypter2 implements Encrypter{
		@Override
		public String encrypt(String s) {
			// TODO Auto-generated method stub
			char[] c = s.toCharArray();
			
			for (int i = 0; i < c.length; i++) {
				c[i] -= 5;
			}
			
			return new String(c);
		}

		@Override
		public String decrypt(String s) {
			// TODO Auto-generated method stub
			char[] c = s.toCharArray();
			
			for (int i = 0; i < c.length; i++) {
				c[i] += 5;
			}
			
			return new String(c);
		}
	}
	
	public Encrypter get(){
		Random r = new Random();
		
		if(r.nextBoolean()){
			Encrypter e = new Encrypter1();
			return e;
		} else {
			Encrypter e = new Encrypter2();
			return e;
		}
		
		
	}

	

}
