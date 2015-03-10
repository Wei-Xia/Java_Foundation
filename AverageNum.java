//while loop
//calculate the average grade of all the input grades

import java.util.*;

public class AverageNum {

  public static void main (String[] args) {

	int number=0;
	Scanner scan = new Scanner (System.in);
   
        int sumTotal = 0;
        int count = 0;
        double avg = 0;

	while (number != -1) {
           
           System.out.println("Input a number or -1 to quit: ");
           number = scan.nextInt();

           if (number >= 0 && number <= 100) {
	     		sumTotal = sumTotal + number;
             	count = count + 1;
           } else
           if (number != -1)
             System.out.println
             ("Invalid entry.  Enter a number between 0 and 100");

                      
        }

        if (count > 0) {
	  avg = sumTotal / count;
          System.out.println("The average is: " + avg);
        } else
          System.out.println("No numbers entered");
 
        

         System.out.println("sumTotal is " + sumTotal);
         System.out.println("count is " + count);


  }

}