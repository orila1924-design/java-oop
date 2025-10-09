
public class program {
	public static void main(String[] args) {

		Car Car1 = new Car();
		Car Car2 = new Car();

		Car1.speedUp();
		Car1.speedUp();
		Car1.speedUp();

		Car2.speedUp();
		Car2.speedUp();

		Car1.show();
		Car2.show();

		Car2.speedDown();

		Car1.show();
		Car2.show();

		Car1.speedUp();
		Car1.speedUp();
		Car1.speedUp();
		Car1.speedUp();
		Car1.speedUp();

		Car1.show();
		Car2.show();

		Car2.speedUp();
		Car2.speedUp();
		Car2.speedUp();
		Car2.speedUp();

		Car1.show();
		Car2.show();

		Car1.stop();
		Car2.stop();

		Car1.show();
		Car2.show();

	}

}
