/*
PART II:

Modify the Statistics class so that the user can pass into a constructor an array of ints, 
so that statistical operations can be performed on this new set of numbers.
  
    For Example:
	int[ ] finalGrades;
	Statistics  finalExamStat = new Statistics(finalGrades);


In the main program, allow the user to enter the grades into the array.  Since you would
need to know the size of the array beforehand, you would prompt the user to first enter 
the number of grades and then prompt the user to enter each grade.

	For Example:
		Enter the number of grades to input: 5
		Enter grade 1:  90
		Enter grade 2:  80
		Enter grade 3:  70
		Enter grade 4:  85
		Enter grade 5:  95

This would make the object work for any array of ints which provides flexibility to the
user.  Test this object with new array as done in part I.

*/

import java.util.*;

public class PartTwo {
	
	public static void main(String[] args) {
	
		int number;
		System.out.println("Please enter the number of grades");   //let user tell us how many grades in array
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();					//get number of grades
		
		int [] grades = new int [number];
		
		System.out.println("Please enter each grade");    //get each grades
		
		for (int i=0;i<number;i++) {		
			System.out.println("Enter grade "+(i+1)+" :");
			grades[i] = scan.nextInt();
		}
		System.out.println("The grades are "+ Arrays.toString(grades));     //output all the grades

		System.out.println("Here are results:");
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