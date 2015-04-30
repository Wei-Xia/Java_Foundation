// write method that sums up the value in the array

class MyArray {
	
		int sum (int [] array) {
		
		int sum = 0;
		
		array [0] = 1000;  //chang [0] variable into 1000
		
		for (int i=0; i< array.length; i++)
			sum = sum + array[i];
		
		return sum;
	}
	

}