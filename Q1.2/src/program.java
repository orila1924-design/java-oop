
public class program {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4,6);
		r1.drawEmpty('$');
		System.out.println(r1);
		r1.readRectFromConsole();
		r1.drawFilled('^');
		System.out.println(r1);
		
	}

}
