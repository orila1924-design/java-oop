
public class Calculator {

	public int countDigits(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		return count;
	}

	public boolean evenOdd(int num) {
		int even = 0;
		int odd = 0;

		while (num > 0) {
			int lastDigit = num % 10;
			num = num / 10;
			if (lastDigit % 2 == 0) {
				even += lastDigit;
			} else {
				odd += lastDigit;
			}

		}
		return even > odd;
	}

	public int getLastDigit(int num) { // 456
		int d = countDigits(num); // 3
		int power = 1; // POWER=1 // last digit

		for (int i = 1; i < d; i++) { // 1 < 3
			power = power * 10; // החלוקה כל פעם עולה ב 0 10 100 1000
		}
		int lastDigit = num / power; // 456 / 100
		return lastDigit;
	}

	public int getDigitLoop(int num, int k) {
		for (int i = 1; i < k; i++) {
			num = num / 10;
		}
		return num % 10;

	}

	public int getDigitPow(int num, int b) {
		int power = (int) Math.pow(10, b - 1);
		return (num / power) % 10;
	}

	public int setDigit(int num, int k, int d) {
		int power = (int) Math.pow(10, k - 1);
		int secPow = (int) Math.pow(10, k);

		int lastPart = num % power;
		int firstPart = num / secPow;

		firstPart = (firstPart * 10) + d;
		int result = (firstPart * power) + lastPart;
		return result;
	}

	public int getLastDigit2(int num) {
		int k = countDigits(num);
		int power = (int) Math.pow(10, k - 1);

		int result = num / power;
		return result;
	}

	public int getLastDigit2Loop(int num) {
		int k = countDigits(num);
		for (int i = 1; i < k; i++) {
			num = num / 10;
		}
		return num;
	}

	public int countMinDigit(int num) {
		int minDigit = 9;
		int count = 0;

		while (num > 0) {
			int d = num % 10;

			if (d < minDigit) {
				minDigit = d;
				count = 1;
			} else {
				if (d == minDigit) {
					count++;
				}
			}
			num = num / 10;

		}
		return count;

	}

	public boolean isSymmetric(int num) {
		int k = countDigits(num);
		int power = (int) Math.pow(10, k - 1);

		while (k > 1) {
			int last = num % 10;
			int first = num / power;

			if (last != first) {
				return false;
			} else {
				num = (num % power) / 10;
			}

			k -= 2;
			power /= 100;
		}
		return true;
	}

	public int search(int num, int d) {
		int count = 0;

		while (num > 0) {
			int c = num % 10;

			if (c == d) {
				count++;
			}
			num = num / 10;
		}

		return count;

	}

}
