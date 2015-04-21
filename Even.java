public class Even {
	
	static boolean isodd (int num){
		boolean return_value;
		
		if (num%2 ==0)
			return_value =false;
		else
			return_value =true;
		
		return (return_value);
		
		public static void main(String[] args) {
		
		if (isodd (5))
			System.out.println("odd");
		else
			System.out.println("even");
	
		}
}
}