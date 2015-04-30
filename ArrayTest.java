// write method that sums up the value in the array

import java.util.*;

class ArrayTest {
	
	public static void main(String[] args) {
	
		int [] val = {10,20,30,40};
		int sum;
		
		System.out.println("Array before method = "+ Arrays.toString(val));
		
		MyArray arr = new MyArray ();
		
		sum = arr.sum(val);
		
		System.out.println("Sum is "+ sum);
		
		System.out.println ("Array value = " +Arrays.toString(val));

	}
}