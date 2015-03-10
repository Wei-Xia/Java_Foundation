/*
write a program that reads an integer value between 0 and 100 (inclusive), 
representing the amount of a purchase in cents.  
Produce an error message if the input value is not in range.  
If the input is valid, determine the amount of change that 
would be received from one dollar, 
and print the number of quarters, dimes, nickels,
And pennies that should be returned.  
Maximize the coins with the highest value.
Follow the format below.

	Enter the purchase amount [0-100 ]:  36

OUTPUT:
	Your change of 64 cents is given as:
	  2 Quarters
	  1 Dimes
	  0 Nickels
	  4 Pennies

HINT:  64 / 25 equals 2, and 64 % 25 equals 14

*/

import java.util.Scanner; 

public class Change {
	
	public static void main(String[] args) {

	int number;
	int Quarters;
	int Dimes;
	int Nickels;
	int Pennies;
	int Rest;
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Enter the purchase amount [0-100]:");
        number = scan.nextInt();
 	
    if (number>100 || number<0)
    System.out.println("Error: I only receive 0-100");
    	else
    		if (number==100 || number==0)
    		System.out.println("You don't need any change");
    			else{

	Rest = 100- number;
	Quarters = Rest/25;
	Dimes = (Rest%25)/10;
	Nickels = ((Rest%25)%10)/5;
	Pennies = ((Rest%25)%10)%5;

/*	
	Rest = 100- number;
	Quarters = Rest/25;
	Dimes = (Rest-Quarters*25)/10;
	Nickels = (Rest-Quarters*25-Dimes*10)/5;
	Pennies = Rest-Quarters*25-Dimes*10-Nickels*5;
*/

    System.out.println("Your change of " +Rest + " cents is given as:");	
	System.out.println(Quarters + " Quarters");
	System.out.println(Dimes + " Dimes");
	System.out.println(Nickels + " Nickels");
	System.out.println(Pennies + " Pennies");
			}

} 
}
