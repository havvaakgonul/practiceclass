package week02;

import java.util.Scanner;

public class P_Q02_ElseIf_MassIndex {
	/*
	Ask user to their weight and height and type a program with calculates mass index
    HINT : Body Mass Index = Weight (kg) / Square of height (m)
    Then give a message to user as following:
    If BMI is less than 18.5 , print "you re weak"
    If BMI is between 18.5 and 25 ,print  "your weight is ideal"
    If BMI is between 25 and 30, print "you re fat"
    If BMI is more than or equal to 30, print "obese" 
    
    EXAMPLE : 
    
    INPUT: Weight : 71
           Height : 1,72
           
    OUTPUT : Your BMI is  : 23.99945916711736
    */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter your weight as  k?ograms");
		double weight = scan.nextDouble();
		System.out.println("Enter your height as meters");
		double height = scan.nextDouble();
		double BMI = weight/(height*height);
		System.out.println("your BMI is: " + BMI);
	 if (weight<=0 && height<=0) {
		 System.out.println("They cant be negative");
	 }else if (BMI<18.5) {
		 System.out.println("You re weak");
	 }else if(BMI>=18.5 && BMI<=25) {
		 System.out.println("Your weight is ideal");
	 }else if (BMI>25 && BMI<30) {
		 System.out.println("You are fat you need to eat less and have excercise");
	 }else {
		 System.out.println("OBESE :(");
	 }
	
	scan.close();
	
	}

}
