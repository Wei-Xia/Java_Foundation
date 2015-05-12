class PartOne {

		int highest (int [] grades) {
		
		int highest;
		highest = grades[0];

		for (int i=0; i< grades.length; i++){
			
			if (grades[i] > highest)
				highest = grades[i];
		}
				
		return highest;
	}
	

		int lowest (int [] grades) {
		
		int lowest;
		lowest = grades[0];

		for (int i=0; i< grades.length; i++){
			
			if (grades[i] < lowest)
				lowest = grades[i];
		}
				
		return lowest;
	}


		int number (int [] grades) {
		
		int num = 0;
		
		for (int i=0; i< grades.length; i++){
			num = i;
		}

		num = num+1;	
		return num;
	}


		int average (int [] grades) {
		
		int avg = 0;
		int sum = 0;
		int i=0;
		
		do {
			sum = sum + grades[i];
			i++;
			avg = sum/i;
		} while (i< grades.length);
				
		return avg;
	}


		int ga (int [] grades) {
		
		int gradeA;
		int countA = 0;

		for (int i=0; i< grades.length; i++){
			
			if (grades[i] >= 90)
				countA ++;
		}
				
		return countA;
	}


		int gb (int [] grades) {
		
		int gradeB;
		int countB = 0;

		for (int i=0; i< grades.length; i++){
			
			if (grades[i] >= 80 &&grades[i] < 90)
				countB ++;
		}
				
		return countB;
	}
	

		int gc (int [] grades) {
		
		int gradeC;
		int countC = 0;

		for (int i=0; i< grades.length; i++){
			
			if (grades[i] >= 70 &&grades[i] < 80)
				countC ++;
		}
				
		return countC;
	}


		int gd (int [] grades) {
		
		int gradeD;
		int countD = 0;

		for (int i=0; i< grades.length; i++){
			
			if (grades[i] >= 60 &&grades[i] < 70)
				countD ++;
		}
				
		return countD;
	}


		int gf (int [] grades) {
		
		int gradeF;
		int countF = 0;

		for (int i=0; i< grades.length; i++){
			
			if (grades[i] < 60)
				countF ++;
		}
				
		return countF;
	}
}