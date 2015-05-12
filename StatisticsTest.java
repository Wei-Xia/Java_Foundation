/*
PART I:

Design and implement a class called Statistics that stores an array of int (grades) and does various statistical calculations. 
The class will contain the following methods/operations:

  1) highest - returns the highest grade
  2) lowest - returns the lowest grade
  3) number of grades - returns the number of grades in the array
  4) average - returns the average of all the grades
  5) print chart - prints out the number of A, B, C, D, F if an
	A = 90 - 100
	B = 89 - 80
	C = 79 - 70
	D = 69 - 60
	F = < 60

Write a main method to test out this object.  The grades to be implemented for this object 
are:
  int[ ]  grades = {79, 93, 51, 50, 70, 75, 97, 97, 98, 62, 67, 80, 69, 44, 84, 93, 94,
		    76, 61, 96, 97, 58, 37, 83, 60, 59, 54, 56, 82, 33, 83, 62, 64, 26,
		    74, 71}

*/

import java.util.*;

class StatisticsTest {
	
	public static void main(String[] args) {
	
		int [] grades = {79, 93, 51, 50, 70, 75, 97, 97, 98, 62, 67, 80, 69, 44, 84, 93, 94, 76, 61, 96, 97, 58, 37, 83, 60, 59, 54, 56, 82, 33, 83, 62, 64, 26, 74, 71};
		//System.out.println("The grades are "+ Arrays.toString(grades));     //output the array

		System.out.println("----------Highest----------");

		int high;
		PartOne one = new PartOne ();
		high = one.highest(grades);
		System.out.println("Highest is "+ high);


		System.out.println("----------Lowest----------");

		int low;
		PartOne two = new PartOne ();
		low = two.lowest(grades);
		System.out.println("Lowest is "+ low);

		System.out.println("----------Number----------");

		int num;
		PartOne three = new PartOne ();
		num = three.number(grades);
		System.out.println("Number of grades is "+ num);
		
		System.out.println("----------Average----------");

		int avg;
		PartOne four = new PartOne ();
		avg = four.average(grades);
		System.out.println("Average is "+ avg);

		System.out.println("----------Grades Chart----------");
		int a;
		PartOne nine = new PartOne ();
		a = nine.ga(grades);
		System.out.println("A is "+ a);

		int b;
		PartOne five = new PartOne ();
		b = five.gb(grades);
		System.out.println("B is "+ b);

		int c;
		PartOne six = new PartOne ();
		c = six.gc(grades);
		System.out.println("C is "+ c);

		int d;
		PartOne seven = new PartOne ();
		d = seven.gd(grades);
		System.out.println("D is "+ d);

		int f;
		PartOne eight = new PartOne ();
		f = eight.gf(grades);
		System.out.println("F is "+ f);

	}
}