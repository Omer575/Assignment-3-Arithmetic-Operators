package day_5_Unary_Assisgnment_Relational_Operators;

public class Question6 {

	public static void main(String[] args) {
		/* Scientists estimate that roughly 10 grams of caffeine consumed at one time is a lethal overdose.

		Write a program with a variable that holds the number of milligrams of caffeine in a drink 
		and outputs how many drinks it takes to kill a person.

       	Sample Output

      	Number of milligrams in drink: 500
      	It would take about 20 drinks for a lethal overdose*/

		// 1 gram equal to 1000 milligrams 
		
		int oneGramEqualtoMilligram = 10*1000;
		
		final int lethaloverdoseMilligrams = oneGramEqualtoMilligram; // 10 grams 
		
		int inputDrinkMilligrams = 500;
		 
		int totalDrinksOverdose = lethaloverdoseMilligrams/inputDrinkMilligrams;
		 
		System.out.println("Number of milligrams in drink: " + inputDrinkMilligrams +"\n" + "It would take about " + totalDrinksOverdose + " drinks for a lethal overdose");
		
	
		
	}

}
