//input MTWRF to definite which weekday

public class Dayofweek {
	
	public static void main(String[] args) {
	
		char day = 'i';
		
		switch (day) {
			case 'M':
			System.out.println("Monday");
			break;
			case 'T':
			System.out.println("Tuesday");
			break;
			case 'W':
			case 'w':
			System.out.println("Wednesday");
			break;
			case 'R':
			System.out.println("Thursday");
			break;
			case 'F':
			System.out.println("Friday");
			break;
			default:
			System.out.println("Invalid character");
		}
		
/*
		if (day == 'M')
			System.out.println("Monday");
		else
		if (day == 'T')
			System.out.println("Tuesday");
		else
		if (day == 'W')
			System.out.println("Wednesday");
		else
		if (day == 'R')
			System.out.println("Thursday");
		else
		if (day == 'F')
			System.out.println("Friday");
*/

		}
			
}
		