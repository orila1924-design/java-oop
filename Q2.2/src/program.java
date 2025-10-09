import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("PLEASE ENTER SOME NUMBER");
		int num = sc.nextInt();
		System.out.println("THE NUMBER YOU ENTERED IS " + num);

		Calculator calc = new Calculator();
		boolean symmetric = calc.isSymmetric(num);

		if (symmetric) {
			System.out.println("THE NUMBER " + num + " IS SYMMETRIC");
		} else {
			System.out.println("THE NUMBER " + num + " IS NOT SYMMETRIC");
			int candidate = num + 1;
			while (!calc.isSymmetric(candidate)) {
				candidate++;
			}
			System.out.println("THE FIRST SYMMETRIC NUMBER AFTER " + num + " IS " + candidate);

		}

	}

}
