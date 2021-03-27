package week01;

import java.util.Scanner;

public class Q3_GradeCalculation {

	public static void main(String[] args) {
		
		/*
        Ask user to enter mid-term grade, final grade, and project grade 
        Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)
        
         Example: 
             INPUT: mid-term grade=78
                   project grade = 66
                    final  grade = 90 
             OUTPUT: "Your grade is : 81,6"
        
        */	

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your midterm grade" );
		double midterm = scan.nextDouble();
		
		System.out.println("Please enter your project grade" );
		double project = scan.nextDouble();
		
		System.out.println("Please enter your final grade" );
		double finalexam = scan.nextDouble();
		
		// double generalGrade = midterm*0.3+finalexam*0.5+project*0.2;

		System.out.println("your general grade is: " + ((midterm*0.3) + (project*0.2) + (finalexam*0.5)));
	}

}
