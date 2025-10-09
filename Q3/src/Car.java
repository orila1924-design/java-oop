
public class Car {
	int Speed;
	int maxSpeed;
	String licenseNumber;

	Car(String licenseNumber, int maxSpeed) {
		this.licenseNumber = licenseNumber;
		this.maxSpeed = maxSpeed;
	}

	public void speedUp() {
		Speed = (Speed + 1) - ((Speed + 1) / maxSpeed);
	}

	public void speedUp(int KmH) {
		Speed = (Speed + Math.max(0, KmH)) - ((Speed + Math.max(0, KmH)) / maxSpeed);
	}

	public void speedDown() {
		Speed = (Speed - 1) + ((Speed - 1) / 11);
	}

	public void speedDown(int KmH) {
		Speed =  Math.max(0,Speed - Math.max(0, KmH));
	}

	public void stop() {
		Speed = 0;
	}

	public void show() {
		System.out.println("  Current Speed :" + Speed + "  KmH" + "  licenseNumber :" + licenseNumber + " max speed :"
				+ maxSpeed);
	}

	public int getSpeed() {
		return Speed;

	}
}
