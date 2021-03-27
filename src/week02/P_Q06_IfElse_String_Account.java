package week02;

import java.util.Scanner;

public class P_Q06_IfElse_String_Account {

	/*
     * Type the program which asks the user to enter 10 
     * character code to be able to create a new account. 
     * This code should start with a capital letter. If the codes is valid, 
     * it prints
         "You can create a new account" 
        Otherwise, it prints "Please enter a valid code"
     */
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 10 character code please");
		String code = scan.nextLine().trim();
		
		if ((code.charAt(0)>='A' && code.charAt(0)<='Z') && code.length()==10) {
			System.out.println("You can create a new account");
		}else {
			System.out.println("Please enter a valid code!");
		}
	scan.close();
	
	
	}

}
