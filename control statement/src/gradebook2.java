



//Sentinel-Controlled Repetition
import java.util.Scanner; // program uses class Scanner

 	public class gradebook2
 	{
 		private String courseName; // name of course this GradeBook represents

 		//constructor
 		public gradebook2 (String name) //constructor set the value of coursename
 		{
 			courseName = name;
 		}
 		
 		// method to retrieve the course name
 		public String getCourseName()
 		{
 			return courseName;
 		} // end method getCourseName

 		public void displayMessage()
 
 		{
 			// getCourseName gets the name of the course
 			System.out.printf( "Welcome to the grade book for\n%s!\n\n", getCourseName() );
 		} 
 
  		public void determineClassAverage() {
 
 			Scanner input = new Scanner( System.in );

 			int total; // sum of grades
 			int gradeCounter; // number of grades entered
 			int grade; // grade value
 			double average; // number with decimal point for average

 			//initialization phase
 			total = 0; // initialize total
 			gradeCounter = 0; // initialize loop counter

 			System.out.print( "Enter grade or -1 to quit: " );
 			grade = input.nextInt();

 			while (grade != -1) {
 				
 				total = total + grade;
 				gradeCounter = gradeCounter + 1; 		
 				System.out.print( "Enter grade or -1 to quit: " );
 				grade = input.nextInt();
 			}
 			
 			if (gradeCounter != 0) {
 				average = (double) total / gradeCounter;
 				System.out.printf( "\nTotal of all %d grades entered is %d\n",gradeCounter, total );
 				System.out.printf( "Class average is %.2f\n", average );
 			}
 			else System.out.println( "No grades were entered" );
 		}
 	}




























