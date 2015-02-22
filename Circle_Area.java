// Write a program to calculate the area of a circle ( 3.1425*r*r ) 

public class CircleArea{
	public static void main(String[] args) {
		int r = 5;
		final double PI = 3.1425;
		double area;

		area = r * r * PI;
		
		System.out.println( "The area of a circle is " + area);
	}
}
