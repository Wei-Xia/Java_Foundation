import java.util.* ;

public class Wage {
	public static void main(String[] args) {
	
	System.out.println("******************************************************* \n                      Menu \n******************************************************* \n1)      Calculate earnings at $10.00/hr \n2)      Calculate earnings at $.10 doubled each hour \n3)      Exit \n*******************************************************");

	Scanner scan = new Scanner (System.in);	
    int choice = scan.nextInt();
	double wage;
	int hour;
	
	while (choice !=3) {
		if (choice !=1 && choice !=2)
			{	
				System.out.println("Invalid Input, please input a valid choice");
				Scanner in = new Scanner (System.in);	
				choice = in.nextInt();
			}
		
		if (choice ==1) {
			System.out.println("Please input how many hours you have worked");
			hour = scan.nextInt();
			wage=10*hour;
			System.out.println("Your wage is "+wage);
			System.out.println("Please enter another choice");
			choice = scan.nextInt();
		}
		if (choice ==2) {
			System.out.println("Please input how many hours you have worked");
			hour = scan.nextInt();
			double P;
			P=Math.pow(2, hour);
			wage=0.1*(P-1);
			System.out.println("Your wage is "+wage);
			System.out.println("Please enter another choice");
			choice = scan.nextInt();
		}

	}
	}
}


/*

1) There is an old story about a student who was offered a consulting job, but had to make 
a decision on how to be paid.  The student could accept a straight $10/hour or take 10 cents 
for the  first hour, but have the hourly wage double each hour.  That is, the student  would 
make $.10 for the first hour, .20 for the second hour, .40 for the third hour etc.  

The doubling effect makes the wage grow pretty fast, so if you were planning on working for 
very many hours, the second option is the best.  However if you are only working a few hours 
the $10/hour adds up fastest.

Write a program that will help you make a decision.  Your program should have three options:  
1) calculate the $10/hr earnings for a user specified number of hours, 2) calculate the earnings 
for a given number of hours if you chose the $.10 /hour that doubles each hour or 3) Exit.  
Assume that for either method you only get paid for whole hours worked.  
In other words, don’t calculate wages for 10.5 hours, only whole hours count.  

Your program should continue to run until the user enters an option 3.

Create a menu of choices as shown below, and take input from the keyboard where required.  
A sample output is shown below:

    *******************************************************
                         Menu      
    *******************************************************
    1)      Calculate earnings at $10.00/hr
    2)      Calculate earnings at $.10 doubled each hour
    3)      Exit
    *******************************************************
    1
    How many hours? 10
    You will earn $100.00 

    2
    How many hours? 10
    You will earn $102.30

NOTE:  Here are the answers in total earnings:

    hour:      method 1      method2
     1           $10           $.10
     2           $20           $.30  (.10 for 1st hr + .20 for 2nd hr)
     3           $30           $.70  (.10 for 1st hr + .20 for 2nd hr + .40 for 3rd hr)
     4           $40           $1.50 (+.80 for 4th hr)
     5           $50           $3.10 (+1.60 for 5th hr)
     6           $60           $6.30 (+3.20 for 6th hr)
     etc...

*/
	
