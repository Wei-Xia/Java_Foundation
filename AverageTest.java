//do loop
//calculate the average grade of all the input grades
import java.util.* ;

public class AverageTest {
	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	int sumExam = 0;
	int numExam = 0;
	int input=0;
	double avg;
	
	do{
	System.out.println("Enter exam or -1 to quit");
	input = scan.nextInt();
	
	if(input>=0 && input<=100){
	sumExam=sumExam + input;
	numExam=numExam+1;}
	else
	if(input != -1)
	System.out.println("valid input is between 0 and 100");

	}while (input!=-1);
	//System.out.println("sumExam = " +sumExam);
	//System.out.println("numExam = " +numExam);
	
	if (numExam >0){
	avg = sumExam/numExam;
	System.out.println("avg is "+avg);}
	else
	System.out.println("No exam entry");
	}
	
	}
	