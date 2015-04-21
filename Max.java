public class Max {
	
	
	static int max_value (int num1, int num2){
		
		int return_value;
	
		if (num1 > num2)
			return_value= num1; 
		else
			return_value= num2;

		return (return_value);
		
	}
	
	public static void main(String[] args) {
	
	//System.out.println("the max of the value is "+ max_value (10,20));
	System.out.println("the max of the value is "+ Math.max(30,20));

	}
}