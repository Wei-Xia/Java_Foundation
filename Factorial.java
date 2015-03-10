//calculate the factorial of the input number

import java.util.* ;

public class Factorial {
	public static void main(String[] args) {
	
	int input;
	int factorial=1;
	Scanner scan = new Scanner (System.in);
	System.out.println("input");
	input = scan.nextInt();
	
	for(int n=1; n<=input; n++)
	factorial= factorial*n;
	System.out.println(factorial);
	
	}
	}
	