package day_5_Unary_Assisgnment_Relational_Operators;

public class Question1 {

	public static void main(String[] args) {

		/*Write a program to convert gallons into Liters and display it.

        Sample output: 15 gallon is 56.7812 liter*/
		
		int gallons = 15;
		double liters;		

		// 1 gallon is equal to 3.785411784 liters. Formula : liter = gallon * 3.785411784
		
		liters = gallons * 3.785411784;
		System.out.println("15 gallons is equal to " + liters + " liters");
	}

}
