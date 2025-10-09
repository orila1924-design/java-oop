
public class program {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(3,4,5,2);
		r1.show();
		int result = r1.getArea();
		System.out.println("   Area = "+result);
		int Peri = r1.getPerimeter();
		System.out.println("   Perimeter = "+Peri);
		r1.moveTo(2,2,4,4);
		System.out.println("   Rectangle moved to :");
		r1.show();
		double diagonal = r1.getDiagonalLength();
		System.out.println("   Diagonal length = "+diagonal);
		boolean squareCase = r1.isSquare();
		System.out.println("   This Rectangle is a square : "+squareCase);
		System.out.println("         ");
		Rectangle r2 = new Rectangle(5,6,7,1);
		System.out.println("   Now were Working on r2 : ");
		r2.show();
		r2.moveTo(1,5,3,1);
		System.out.println(    "Rectangle Moved To : ");
		r2.show();
		System.out.println("         ");
		int r1Peri = r1.getPerimeter();
		int r2Peri = r2.getPerimeter();
		System.out.println("    r1 perimeter = "+r1Peri+" r2 perimeter = "+r2Peri);
		System.out.println("         ");
		boolean squareCase2 = r1.isSquare();
		boolean squareCase3 = r2.isSquare();
		System.out.println("    r1 is a square :"+squareCase2+"  r2 is a square :"+squareCase3);


	}

}
