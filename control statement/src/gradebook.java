


//Counter-Controlled-Repetition
import java.util.Scanner;

public class gradebook {

	//instance variable of this class
	private String coursename; 
	
	//constructor
	public gradebook (String name) //constructor set the value of coursename
	{
		coursename = name;
	}
	//end constructor
	
	//method declaration
	public String getcoursename () {//method to get the course name 
		return coursename;
	}
	
	//method declaration
	public void displaymessage() {//getcoursename get the name of the course
		System.out.printf("Welcome to the gradebook for\n%s!\n\n", getcoursename());
	}
	
	//method declaration
	public void classaverage() {//determine class average based on 10 grades entered by users
		
		Scanner input = new Scanner (System.in);
		
		int total; 
		int gradeCounter;
		int grade;
		int average;
		
		// initialization phase
		total = 0;// initialize total
		gradeCounter= 1; //initialize loop counter
		
		// processing phase uses counter-controlled repetition
		while (gradeCounter <= 3)//loop 3 times
		{
			System.out.print("Enter Grade: ");//prompt user input 
			grade = input.nextInt();//input next grade
			total = total+grade;//add grade to total
			gradeCounter= gradeCounter+1;//increment counter by 1
		}
		
	//termination phase
	average = total/3;//integer division yields integer result
	
	//display total and average of grades
	System.out.printf("\nTotal of all 3 grades is %d\n", total );
	System.out.printf( "Class average is %d\n", average );
	
	}
}













