package week02;

import java.util.Scanner;

public class P_Q01_ElseIf_Overflow {

	
	/*
    Write a Java program to compute and print sum of two given numbers (more than or equal to zero). 
If given integers or the sum have more than 10 digits, print "overflow".
EXAMPLE:
INPUT      :  
Input two integers:
25
46
OUTPUT :  
Sum of the said two numbers:
71       
    */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 2 number ");
		double d1 = scan.nextDouble();
		double d2 = scan.nextDouble();
		double sum = d1+d2;
		
		if (d1<0 || d2<0){
		System.out.println("Numbers should be greater than or equal to zero ");	
		}else if (sum>=100000000001d) {
			System.out.println("Overflow");
		}else {
			System.out.println("The sum of two numbers is: "+ sum);

		}
	scan.close();
	short a=5;
	a+=8;
	a=(short) (a+7);
	
	
	}

}
