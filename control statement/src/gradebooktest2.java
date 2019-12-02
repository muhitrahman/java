


public class gradebooktest2

{
	public static void main( String[] args )
{
		// create GradeBook object myGradeBook and
		// pass course name to constructor
		
		gradebook2 myGradeBook = new gradebook2("CS101 Introduction to Java Programming");
		
		myGradeBook.displayMessage(); // display welcome message
		myGradeBook.determineClassAverage(); // find average of grades
	} 
} 