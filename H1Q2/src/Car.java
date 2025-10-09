
public class Car {
	int Speed;

	public void speedUp() {
		Speed = (Speed + 1) - ((Speed + 1) / 11);
	}

	public void speedDown() {
		Speed = (Speed - 1) + ((Speed - 1) / 11);
	}

	public void stop() {
		Speed = 0;
	}

	public void show() {
		System.out.println("  Current Speed :" + Speed + "  KmH");
	}

}
