
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
		Speed = Math.max(0, Speed - Math.max(0, KmH));
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

	public class Progression {
		int firstTerm;
		int difference;

		public Progression() {
			this.firstTerm = -3;
			this.difference = 2;
		}

		public Progression(int firstTerm, int difference) {
			this.firstTerm = firstTerm;
			this.difference = difference;

		}

		public int getElement(int k) {
			int an = this.firstTerm + (k - 1) * this.difference;
			return an;
		}

		public void showProg(int n) {
			int current = firstTerm;

			for (int i = 1; i <= n; i++) {
				System.out.print(current + ", ");
				current = current + this.difference;
			}
			System.out.println("\n \n ");
		}

		public void showProg() {
			int n = 10;
			int current = firstTerm;

			for (int i = 1; i <= n; i++) {
				System.out.print(current + ", ");
				current = current + this.difference;
			}
			System.out.println("\n \n ");

		}

		public void showProgUpTo(int n) {
			int current = firstTerm;

			while (current <= n) {
				System.out.print(current + ", ");
				current = current + this.difference;
			}
			System.out.println("\n \n ");

		}

	}

}
