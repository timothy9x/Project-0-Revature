package automotivedealership;

import java.util.*;
import java.util.Scanner;

public class AccountSelection {

	public static void menuSelection() throws InputMismatchException{
		Scanner user = new Scanner(System.in);
		String input = "";
		
		do {
			System.out.println("Enter 1: To log in" + "\nEnter 2: Create user account");
			try {
				input = user.next();
			} catch (InputMismatchException e) {
				System.out.println("Enter 1: To log in" + "\nEnter 2: Create user account");
			}
		} while (input.matches("[1-2]") == false);

		userInput(input);
	}

/******************************************************************** Validate Method ********************************************************************************/	
	public static boolean validate (int val) {
		if (val < 0 || val > 2) {
			return false;
		}
		return true;
	}
	
/******************************************************************** User Input Cases ********************************************************************************/	
	public static void userInput(String x) {
		int num = Integer.parseInt(x);
		
		if(num == 1) {															// When user logs in with the correct credientials, 
			System.out.println("Enter Username and Password");					// the Database will match with the proper Customer or Employee account
																				// If User, jump to a class with user accessibility 
																				// If Employee jump to class with employee accessibility
		} else if (num == 2) { 													
			System.out.println("Create an account");
																				// Stores user's username and password into database
		}
	}
}		
		
//		switch (num) {
//			case 1: {															// When user logs in with the correct credientials, 
//				System.out.println("Enter Username and Password");				// the Database will match with the proper Customer or Employee account
//				// If User jump to a class with user accessibility 
//				// If Employee jump to class with employee accessibility
//				break;
//			} case 2: { 														// Create a new user account
//				System.out.println("Create an account");
//				// Stores user's username and password into database
//				break;
//			}
//		}



