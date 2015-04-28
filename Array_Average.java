public class Array_Average {
	public static void main(String[] args) {
		
		int [] val = {12, 56, 42, 38, 77, 69, 34, 10, 90, 93 };
		int sum=0;
		for (int i=0; i<val.length; i++){
			sum = sum + val [i];
		}
		
		double avg = sum / val.length;
		System.out.println ("Average = " + avg);
	}
}
/*
Write a program the will compute the average of the values in an array.  The array
will be initialized to the following:
	
	int[ ] myValues = { 12, 56, 42, 38, 77, 69, 34, 10, 90, 93 };
*/