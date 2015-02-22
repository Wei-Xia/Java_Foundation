//Professor Version
//input midterm and final grades, and then calculate the average of grade
// "/*   here is a bunch of comments  */"


import java.util.Scanner; 

public class Average_Professor_Version {

  public static void main (String[] args) {
    
    Scanner scan = new Scanner (System.in);

    int midterm_exam;
    int final_exam;
    double avg;

    System.out.println("Enter a midterm grade: ");
    midterm_exam = scan.nextInt();

    System.out.println("Enter a final grade: ");
    final_exam = scan.nextInt();
   
    System.out.println("midterm grade= " + midterm_exam);
    System.out.println("final grade= " + final_exam);

    avg = (midterm_exam + final_exam) / 2;

    System.out.println("avg = " + avg);


    if (avg >=90)
	System.out.println("A");
    else
    	if (avg >=80)
      	System.out.println("B");
    	else
    		if (avg >=70)
      		System.out.println("C");
    		else
      		System.out.println("F");

/*

	if (avg>=90 && avg <=100)
      System.out.println("A");
    
    if (avg>=80 && avg<90)
      System.out.println("B");
    
    if (avg>=70 && avg<80)
      System.out.println("C");
    
    if (avg<70)
      System.out.println("F");


///////

	if (avg >= 70) 
      System.out.println("Pass");
    else
      System.out.println("Fail");

*/

  }


}