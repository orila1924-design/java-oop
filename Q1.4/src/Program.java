import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("PLEASE ENTER NUMBER OF SIDES:");
		int s = sc.nextInt();
		System.out.println("PLEASE ENTER NUMBER OF ROLLS IN THE EXPERIMENT:");
		int r = sc.nextInt();

		int iteration;
		for (iteration = 0; iteration <= s; iteration++) {
			System.out.println("STARTING ITERATION #" + (iteration + 1));
			Die cube = new Die(s);
			for (int i = 0; i < r; i++) {
				cube.rollDie(true);
			}
			int[] dualCase = cube.getAllMostFrequents();
			cube.showStatistics();
			if (dualCase.length > 1) {
				break;
			}
		}
		System.out.println("\nFound multiple max frequency\nExperiment Ended after " + (iteration + 1) + " iterations");
	}
}
