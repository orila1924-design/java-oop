import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Car r1 = new Car("2332", 250);
		int maxSum = 0;
		int bestIndex;
		int sum;
		

		for (int i = 1; i <= 7; i++) {
			System.out.println("ENTER FIRST TERM ");
			int firstTerm = sc.nextInt();
			System.out.println("A1 = " + firstTerm);
			System.out.println("ENTER DIFFERENCE ");
			int difference = sc.nextInt();
			System.out.println("D = " + difference);

			Car.Progression p = r1.new Progression(firstTerm, difference);
			sum = 5 * (2 * firstTerm + (5 - 1) * difference) / 2;

			if (sum > maxSum) {
				maxSum = sum;
				bestIndex = i;
				System.out.println(" MAX SUM IS: " + maxSum + " BEST INDEX IS:" + bestIndex);
				p.showProg(5);
			
			}
			

		}

	}

}
