package day_5_Unary_Assisgnment_Relational_Operators;

public class Question2 {

	public static void main(String[] args) {
		 /*Write a program - > Declare variables for your name and birth year, and the program will display:
		   " Hello, Ozzy! Based on your input, your age is 15 :) " */
		
		String name = "Ozzy!";
		int dateOfBirth,presentYear,currentAge;
		
		dateOfBirth = 1998;
		presentYear = 2020;
		currentAge  = presentYear - dateOfBirth;
		
		
		System.out.println("Hello, " + name + " Based on your input, your age is " + currentAge + " :)");
	}
}
