package day_5_Unary_Assisgnment_Relational_Operators;

public class Question4 {

	public static void main(String[] args) {
		
		/* Declare 2 variables (Num1, Num2)

		Swap values between Num1 and Num2

		Display new values of Num1 and Num2 */
		
		int num1, num2;
		
		num1 = 10;
		num2 = 20;
		System.out.println("Before swapping:");
		System.out.println("Num1 = " + num1);
		System.out.println("Num2 = " + num2);
		
		num1=num1+num2; 
		num2=num1-num2; 
		num1=num1-num2;
		
		System.out.println("After swapping:");
		System.out.println("Num1 = " + num1);
		System.out.println("Num2 = " + num2);
		
		
		
		
		


	}

}
