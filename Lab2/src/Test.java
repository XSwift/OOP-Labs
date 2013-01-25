
/**
 * 
 * Clasa Test
 * 
 * @author Andru
 *
 */
public class Test {

	private int x;
	private static int y;
	
	@SuppressWarnings("static-access")
	public Test(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void show() {
		System.out.println(x + " " + y);
	}
	
}
