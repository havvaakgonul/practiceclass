package week03;

import java.util.Scanner;

public class PQ04_ForLoop_RepeatedLetters1 {

	public static void main(String[] args) {
		/* Ask user to enter a name and a character,
		then check how many times the character is repeated
		in the name using loops in the name
		 Example:
		        INPUT      :char ch1= 'a' ;
		                    String name =“John came late"
		        OUTPUT :  2
		        */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an String please");
	String str =scan.nextLine();
	System.out.println("Enter a character please");
	char ch = scan.next().charAt(0);
	System.out.println(ch+ " is repeated "+ countMethod(str,ch)+ "times in this String");

	}
public static int countMethod(String s, char c) {
	int counter=0;
	for(int i=0; i<s.length(); i++) {
		if(c==s.charAt(i)) {
			counter++;
		}
	}
	return counter;
}
}
