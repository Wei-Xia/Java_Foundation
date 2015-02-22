//input midterm and final grades, and then calculate the average of grade
//if 90≤avg≤100, get A
//if 80≤avg<90, get B
//if 70≤avg<80, get C
//if avg<70, get F

import java.util.Scanner;  

public class Grade {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int number;
		int midterm_exam;
		int final_exam;
		double avg;
		
		System.out.println("Enter a midterm grade: ");
        midterm_exam = scan.nextInt();
        
        System.out.println("Enter a final grade: ");
        final_exam = scan.nextInt();
        
        System.out.println("your midterm grade is: " + midterm_exam);
        System.out.println("your final grade is: " + final_exam);
            
        avg = (midterm_exam + final_exam) /2;
        System.out.println("Your average is: " + avg);
        
        if (avg >=90 && avg <=100)
		System.out.println("A");
		else
			if (avg >=80 && avg <90)
			System.out.println("B");
			else	
				if (avg >=70 && avg <80)
				System.out.println("C");
				else
				System.out.println("F");
		
	}
}