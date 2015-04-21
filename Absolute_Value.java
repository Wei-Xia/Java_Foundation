public class Hello {
	
	static void printHello(){
		System.out.println("in method printhell() --Hello World");
	}
	
/*	static int square (int num){
		
		int return_value;
		return_value = num * num;
		return (return_value);
		
	}
*/
	
	static int absolute (int num){
		
		int return_value;
		if (num<0)
			return_value= num *-1; 
		else
			return_value=num;
		return (return_value);
		
	}
	
	public static void main(String[] args) {
		
		//printHello();
	
/*	
	int sq;
	sq = square(-5);
	System.out.println("the square of the value is "+ sq);
	
*/
	
	int abs_value;
	// abs_value = absolute (-10);
	abs_value= Math.abs (-5);
	System.out.println("the absolute of the value is "+ abs_value);
		
	
	}
}