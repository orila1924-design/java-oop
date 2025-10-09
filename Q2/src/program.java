
public class program {

	public static void main(String[] args) {

		Line line = new Line();
		Line parallel = new Line(0, 2, 4, 4);
		Line perpendicular = new Line(0, 1, 1, -1);
		double x = line.slope() * perpendicular.slope();
		System.out.println("  X :" + x);

		System.out.println("  parallel slope is :" + parallel.slope());

	}

}
