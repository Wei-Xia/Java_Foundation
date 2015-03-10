//while loop
//calculate the average grade of all the input grades

import java.util.Scanner;  

public class Avg {
	public static void main(String[] args) {
		
		int number = 0;
		double avg;
		int count = 0;
		int sumTotal = 0;
		Scanner scan = new Scanner (System.in);

        
        while (number != -1) {
        System.out.println("Input a number or -1 to quit: ");
        number = scan.nextInt();
        
/*        if (number == -1)
        break;
*/
       
        if (number >= 0 && number <= 100){
        sumTotal = sumTotal+ number;
        count = count +1;
        }
        else
        if (number != -1)
        System.out.println("Invalid entry. try a new number ");
 
        }
        if (count >0){
        avg = sumTotal / count;
        System.out.println("avg is "+ avg);
        }
        else
        System.out.println("No exam entered");
       
        
        //System.out.println("sumTotal is "+ sumTotal);
        //System.out.println("count is "+ count);
        
		
	}
}