package week01;

import java.util.Scanner;

public class Q6_MaxMinNumber {

	public static void main(String[] args) {
		
		
		/*
        ask user to enter 3 numbers then 
1-find the max number
2-find the minumum number
EXAMPLE:
    INPUT      :      Num1: 23
                      Num2: 29
                      Num3: 55 
                     
    OUTPUT  :         Max Number is : 55
                      Min Number is : 23
                      
        */
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number");
	int num1= scan.nextInt();
	
	System.out.println("Enter a number");
	int num2= scan.nextInt();
	
	System.out.println("Enter a number");
	int num3= scan.nextInt();
	
	if (num1>num2 && num1>num3) {
		System.out.println("Max number is : " + num1);
	}else if (num2>num3) {
		System.out.println("Max number is " + num2);
	}else {
		System.out.println("Max number is: " + num3);
	}
	
	if (num1<num2 && num1<num3) {
	System.out.println("Min number is: " +num1);
	}else if (num2<num1 && num2<num3) {
		System.out.println("Min number is: " +num2);
		}else {
			System.out.println("Min number is: " +num3);
		}
	}
		
	
	
	
	}

