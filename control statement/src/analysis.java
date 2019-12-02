

//nested-controlled-statement
import java.util.Scanner;

public class analysis {

	public static void main (String[]args) {
		
		Scanner input =new Scanner (System.in);
		
		//initialize local variable in declaration 
		int pass=0;
		int fail=0;
		int studentCount=1;
		int result;
		
		//process 10 students using counter-controlled-loop
		while (studentCount <=5) {
			
			// prompt user for input and obtain value from user
			 System.out.println("Enter result (1 = pass, 2 = fail): " );
			 result = input.nextInt();
			 
			 //here pass, fail, studentCount are three assignment statement 
			 //  if....else is nested in while statement  
			 if (result == 1)//if result 1 
				 pass = pass+1;// increment passes
			 else //else result is not 1, so
				 fail = fail+1;// increment failures
			 
			 //increment loop
			studentCount=studentCount+1;
		}
		//termination phase- prepare and display result 
		System.out.printf("passed:%d\nfailed:%d\n", pass, fail);
		
		//determine whether more than 3 students passed
		if (pass > 3)
			System.out.println("congratulation to instructor");
		else 
			System.out.println("students need to work hard");
	}
}















