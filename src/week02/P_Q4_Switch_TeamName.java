package week02;

import java.util.Scanner;

public class P_Q4_Switch_TeamName {
	
	
	// Question 1: Type the codes which asks the user to put the 
    //letters for the favorite football club in Turkey. It prints "Galatasaray" for gs, it prints "Trabzonspor" for ts, it prints "Besiktas" 
    //for bjk and it prints "Pis Fenerbahce" for fb. Please use switch statement in your codes.
	
	
	public static void main(String[] args) {
		Scanner scan =new  Scanner (System.in);
		System.out.println("Please put one of the options gs,fb,tr or bjk for you team");
		String team = scan.next().toLowerCase();
		switch(team) {
		case "gs":
			System.out.println("Galatasaray");
		break;
		case "ts":
			System.out.println("Trabzonspor");
		break;
		case "fb":
			System.out.println("Fenerbahce");
		break;
		case "bjk":
			System.out.println("Besiktas");
		break;
		default:
			System.out.println("Please enter the valid codes for your team ");
			
		}
	}

}
