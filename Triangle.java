class Triangle {

 int side1;
 int side2;
 int side3;

 public Triangle (int a, int b, int c) {
	side1 = a;
	side2 = b;
	side3 = c;
 }
 
	
	public boolean scalene() {
		boolean answer;
 
		if (side1 == side2)
			answer = false;
		else 
			if (side1 == side3)
				answer = false;
			else 
				if (side2 == side3)
				answer = false;
				else
				answer = true;
		
		return answer;
 } 
 
 	public boolean isosceles() {
		boolean answer;
 
		if ((side1 == side2)&&(side1 != side3)&&(side2 != side3))
			answer = true;
		else 
			if ((side1 != side2)&&(side1 == side3)&&(side2 != side3))
				answer = true;
			else 
				if ((side1 != side2)&&(side1 != side3)&&(side2 == side3))
				answer = true;
				else
				answer = false;
		
		return answer;
 } 
 
	 public boolean equilateral() {
		boolean answer;
 
		if ((side1 == side2) && (side2 == side3) && (side1 == side3))
			answer = true;
		else 
			answer = false;
		
		return answer;
 } 
	 public String print_sides() {
		return (side1 + " " + side2 + " " + side3);
	}
	
}


/*
Write a class called Triangle that can be used to represent a triangle.  
It should include the following methods that return boolean values indicating if the particular property holds:
	a) is_scalene (no two sides are the same length)
	b) is_isosceles (exactly two sides are the same length)
	c) is_equilateral (all three sides are the same length)	
*/

