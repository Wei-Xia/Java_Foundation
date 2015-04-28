/*
Design and implement an application that reads an arbitrary number of integers that are in the range of 0 to 50 inclusive 
and counts how many occurrences of each are entered.  After all inputs have been processed, 
print only the values that have an occurrence of greater than zero.  Also, print the number of occurrences next to
the value. [HINT: use arrays and indexing ]

e.g.

	Enter a value between 0 and 50 [ -1 to end ]: 10
	Enter a value between 0 and 50 [ -1 to end ]: 2
	Enter a value between 0 and 50 [ -1 to end ]: 30
	Enter a value between 0 and 50 [ -1 to end ]: 10
	Enter a value between 0 and 50 [ -1 to end ]: 3
	Enter a value between 0 and 50 [ -1 to end ]: 10
	Enter a value between 0 and 50 [ -1 to end ]: 30
	Enter a value between 0 and 50 [ -1 to end ]: 2
	Enter a value between 0 and 50 [ -1 to end ]: -1

Output:

	The value of 2 has 2 occurrences.
	The value of 3 has 1 occurrences.
	The value of 10 has 3 occurrences.
	The value of 30 has 2 occurrences.
*/
import java.util.*;

public class Array_Count {
public static void main(String[] args){

    int number;
    int[] count = new int[51];

    Scanner scan = new Scanner(System.in);
	System.out.println("Enter a value between 0 and 50 [ -1 to end ]:");

    do{
		number = scan.nextInt();

		if(number >= 0 && number <= 50)
			count[number] ++;
		else
			System.out.println("Please enter a number between zero and fifty");

	} while(number != -1);


    System.out.println("Results are:");

    for(int i = 0; i <= 50; i++){
		if(count[i] > 0){
		System.out.println("The value of " + i + " has " + count[i] + " occurrences.");
		}
    }

}
}

