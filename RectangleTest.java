class RectangleTest {

	public static void main(String[] args) {

    Rectangle r1 = new Rectangle();
    int area;

		r1.setLength(10);
		r1.setWidth(20);

    area = r1.calcArea();


    System.out.println("The area of r1 is " + area);

	Rectangle r2 = new Rectangle();
		r2.setLength(5);
		r2.setWidth(10);

		area = r2.calcArea();

    System.out.println("The area of r2 is " + area);

    System.out.println("Format two decimal " + String.format("%.2f",.32675));

  }

}