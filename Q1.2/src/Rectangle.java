
import java.util.Scanner;
public class Rectangle {
	private int xu, yu;
	private int xl, yl;
	private int height, width;

	public Rectangle(int a, int b, int c, int d) {
		xu = a;
		yu = b;
		xl = c;
		yl = d;
	}

	public Rectangle() {
		xu = 0;
		yu = 0;
		xl = 1;
		yl = -1;
	}

	public Rectangle(int h, int w) {
		this.height = h;
		this.width = w;
	}

	public int getArea() {
		return Math.abs(xl - xu) * Math.abs(yu - yl);
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

	public void drawFilled() {
		for (int h = 0; h < height; h++) {
			for (int i = 0; i < width; i++) {
				System.out.print("X");
			}
			System.out.println();
		}

	}

	public void drawEmpty() {
		for (int w = 0; w < width; w++) {
			System.out.print("*");
		}
		System.out.println();
		for (int h = 0; h < height - 2; h++) {
			System.out.print("*");
			for (int i = 0; i < width - 2; i++) {
				System.out.print(" ");
			}
			System.out.println("*");

		}
		for (int r = 0; r < width; r++) {
			System.out.print("*");
		}
	}
	
	public void drawEmpty(char a) {
		for (int w = 0; w < width; w++) {
			System.out.print(a);
		}
		System.out.println();
		for (int h = 0; h < height - 2; h++) {
			System.out.print(a);
			for (int i = 0; i < width - 2; i++) {
				System.out.print(" ");
			}
			System.out.println(a);

		}
		for (int r = 0; r < width; r++) {
			System.out.print(a);
		}
		System.out.println();
	}

	public void drawFilled(char a) {
		for (int h = 0; h < height; h++) {
			for (int i = 0; i < width; i++) {
				System.out.print(a);
			}
			System.out.println();
		}
	}
	
	public void readRectFromConsole() {
		Scanner sc = new Scanner(System.in);
		System.out.println("  Please Enter New Height : ");
		this.height = sc.nextInt();
		System.out.println("  Please Enter New Width : ");
		this.width = sc.nextInt();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}