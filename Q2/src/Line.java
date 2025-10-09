
public class Line {
	double xa, ya;
	double xb, yb;

	Line() {
		xa = 0;
		ya = 1;

		xb = 4;
		yb = 3;
	}

	Line(double xa, double ya, double xb, double yb) {
		this.xa = xa;
		this.xb = xb;
		this.ya = ya;
		this.yb = yb;
	}

	Line(double xb, double yb) {
		this(0, 0, xb, yb);

	}

	public void show() {
		System.out.println("(" + xa + " , " + ya + ") - (" + xb + "," + yb + ")");
	}

	public double slope() {
		return (yb - ya) / (xb - xa);
	}

	public double intercept() {
		return ya - slope() * xa;
	}

	public boolean isOnLine(double x, double y) {
		double b = intercept();
		double m = slope();

		return Math.abs(y - (m * x + b)) < 0.0001;
	}

}
