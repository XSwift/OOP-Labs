import Interfaces.Encrypter;
import Interfaces.Iterator;




public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArrayList al = new MyArrayList(10);
		al.add(23);
		al.add(2);
		al.add(3);
		al.add(2);
		
		MyArrayList.BrowseArray ba = al.iterator();
		
		ba.browse();
		
		EncrypterFactory ef = new EncrypterFactory();
		
		Encrypter e = ef.get();
		
		System.out.println(e.encrypt("asd"));
		System.out.println(e.decrypt("\\n_"));

	}

}
