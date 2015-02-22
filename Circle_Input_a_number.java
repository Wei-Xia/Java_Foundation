//input a radius, and calculate the area of the circle with this radius

import java.util.Scanner;  

// import java.util.*;

public class Circle_Input_a_number {
	public static void main(String[] args) {
		int	r;
		double area;
		int number;


		Scanner scan = new Scanner (System.in);

		System.out.println("Input a number: ");
        number = scan.nextInt();
        
        r = number;
		area = Math.PI * r * r;

		System.out.println( "The area of a circle is " + area);
	}
}