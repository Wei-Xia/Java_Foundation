public class TriangleTest{
	public static void main(String args[]) {
	
	Triangle equal = new Triangle (3,3,3);
	Triangle isosceles = new Triangle (3, 4, 4);
	Triangle scalene = new Triangle (1,2,3);
 
	System.out.println("Triangle with sides: 3 3 3");
	if (equal.isosceles())
		System.out.println("\tIt is isosceles");
	else
		System.out.println("\tIt is NOT isosceles");
	
	if (equal.equilateral())
		System.out.println("\tIt is equilateral");
	else
		System.out.println("\tIt is NOT a equilateral");
	
	if (equal.scalene())
		System.out.println("\tIt is scalene");
	else
		System.out.println("\tIt is NOT scalene");
	
	System.out.println("\t");
	

	System.out.println("Triangle with sides: 3 4 4");
	if (isosceles.isosceles())
		System.out.println("\tIt is isosceles");
	else
		System.out.println("\tIt is NOT isosceles");
 
	if (isosceles.equilateral())
		System.out.println("\tIt is equilateral");
	else
		System.out.println("\tIt is NOT equilateral");
	
	if (isosceles.scalene())
		System.out.println("\tIt is scalene");
	else
		System.out.println("\tIt is NOT scalene");
	
	System.out.println("\t");
 
	System.out.println("Triangle with sides: 1 2 3");
	if (scalene.isosceles())
		System.out.println("\tIt is isosceles");
	else
		System.out.println("\tIt is NOT isosceles");
 
	if (scalene.equilateral())
		System.out.println("\tIt is equilateral");
	else
		System.out.println("\tIt is NOT equilateral");
 
	if (scalene.scalene())
		System.out.println("\tIt is scalene");
	else
		System.out.println("\tIt is NOT scalene");
	}
}

/*
Write a class called Triangle that can be used to represent a triangle.  
It should include the following methods that return boolean values indicating if the particular property holds:
	a) is_scalene (no two sides are the same length)
	b) is_isosceles (exactly two sides are the same length)
	c) is_equilateral (all three sides are the same length)	
*/
