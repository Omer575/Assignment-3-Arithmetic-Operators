package day_5_Unary_Assisgnment_Relational_Operators;

public class Question5 {

	public static void main(String[] args) {
		
		/*Write a program that outputs the number of hours, minutes, and seconds that corresponds to input total seconds.

		-Declare int variables inputSeconds, hours, minutes, seconds
		-Initialize the inputSeconds

		-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
		-Assign values to the hours, minutes, seconds variables
		-Display the result

       	Sample Output:

       	inputSecond is 3695

      	1 hours, 1 minutes, and 35 seconds */
		
		int inputSeconds,hours,minutes,seconds;
		
		inputSeconds 	= 3695;
		
		hours = inputSeconds/3600;
		minutes = (inputSeconds/60)%60;
		seconds = inputSeconds%60;
		
		
		
		
		System.out.println(inputSeconds + " seconds equal to " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");
	
		
		
	}

}
