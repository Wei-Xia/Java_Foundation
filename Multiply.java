/*
Computers are playing an increasing role in education.  
Write a program that will help elementary school children 
learn multiplication.
Use the Random class in the java.util package to produce 
two positive one-digit integers.  

this number is as follows:
The Math class in the java.lang package is also used to convert 
the number to an absolute value.  The modulus is used to get a 
single digit number.

Use this one digit number produced to type the question as follows:

     How much is 6 times 7?

The student then types the answer.  
Your program checks the student's answer.  
If it is correct, print "Very Good!" and 
then ask another multiplication question.  
If the answer is wrong, print "No.  Please try again." 
and then let the student try the same question again repeatedly 
until the student finally gets it right.  Enter a -1 to exit program.
*/

import java.util.*;  

public class Multiply {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		
		Random  myRandomNumber = new Random();
		int num1 = Math.abs(myRandomNumber.nextInt() % 10 );
	    int num2 = Math.abs(myRandomNumber.nextInt() % 10 );
	    
	    int answer;
	    int input=0;
	    
	    while (input != -1) {
		    System.out.println("What is "+num1+" times "+num2+"?");
		    input = scan.nextInt();
	    
		    answer = num1* num2;
		    if (input==answer){
	 		   	System.out.println("Correct!");
	 		   	num1 = Math.abs(myRandomNumber.nextInt() % 10 );
	   		 	num2 = Math.abs(myRandomNumber.nextInt() % 10 );
	    	}
	    else
	    if(answer != -1)
	    	System.out.println("Incorrect!");}

	}
	}