package week02;

import java.util.Scanner;

public class P_Q05_Switch_Letters {
	
	/*
    Ask user to enter a letter.
    If user enters a letter that in first four letters, 
    Your program will print "(This letter) is in the first four letters" 
    It will also print if this letter is vowel or consonant
    Use switch.
    
    Example :
    INPUT: A
    OUTPUT: "A is in first letters"
            "A is vowel"
     
    */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a letter");
		
		String str = scan.next().toUpperCase();		
		char letter = str.charAt(0);		
		
		if (str.length()==1) {
					
				if (letter>='A' && letter<='Z') {
		
					switch (letter) {
		
					case 'A':
			System.out.println("the letter "+ letter + " is in first four letters");
		case'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("The letter " + letter +" is a vowel");
		break;
		case 'B':
		case'C':
		case 'D':
			System.out.println("The letter "+ letter + " is in first four letters");
	default:
		System.out.println("The letter "+ letter+ " is a consonant");
		
		}
	
	}else {
		System.out.println("Enter letter only");
	}
				}else {
				System.out.println("Enter letter only");	
				}
	scan.close();			
	}
				}

