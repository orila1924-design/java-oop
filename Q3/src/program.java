
public class program {

	public static void main(String[] args) {
		Car car1 = new Car("12345", 120);
		Car car2 = new Car("123456", 100);
		
		car1.speedUp(5);
		car2.speedUp();
		car1.show();
		car2.show();
		
		int rnd = (int)(Math.random() * 150 +50);
		
		car2.speedUp(rnd);
		int currentSpeed = car2.getSpeed();
		car2.speedUp(Math.max(0, 31 - currentSpeed));  
		car2.speedDown(Math.max(0, currentSpeed - 31));
		
		car2.show();


	}

}
