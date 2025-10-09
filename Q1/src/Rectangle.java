
public class Rectangle {
	private int xu, yu;
	private int xl, yl;

	public Rectangle(int a, int b, int c, int d) {
		xu = a;
		yu = b;
		xl = c;
		yl = d;
	}

	public int getArea() {
		return Math.abs(xl - xu) * Math.abs(yu - yl);
	}

	public Rectangle() {
		xu = 0;
		yu = 0;
		xl = 1;
		yl = -1;
	}

	public int getPerimeter() {
		return (Math.abs(xl - xu) + Math.abs(yu - yl)) * 2;
	}

	public void moveTo(int a, int b, int c, int d) {
		xu = a;
		yu = b;
		xl = c;
		yl = d; // height (xl - xu) width (yu - yl)
	}

	public void show() {
		System.out.println("Rectangle coordinates   xu =" + xu + "  yu =" + yu + "  xl =" + xl + "  yl =" + yl);
	}

	public double getDiagonalLength() {
		return Math.sqrt((yu - yl) * (yu - yl) + (xu - xl) * (xu - xl));
	}

	public boolean isSquare() {
		return Math.abs(yu - yl) == Math.abs(xl - xu);
	}

	public boolean isGolden() {
		return Math.abs((double) (xu - xl) / (yu - yl) - 1.68) < 0.01;
	}

}
