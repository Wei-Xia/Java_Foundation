//input midterm and final grades, if the average grades is greater than or equal 70, it shows Pass, or it shows Fail

import java.util.Scanner;  

public class Average {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
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
        System.out.println("the average is: " + avg);
        
        if (avg >= 70)
		System.out.println("Pass");
		else
		System.out.println("Fail");
		
	}
}