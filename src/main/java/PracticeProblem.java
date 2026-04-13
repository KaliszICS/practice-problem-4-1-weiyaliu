/**
	* File: Lesson 4.1: While Loops and accumulators
	* Author: Weiya
	*	Date Created: April 8, 2026
	*	Date Last Modified: April 13, 2026
	*/
public class PracticeProblem {

	public static void main(String args[]) {

		System.out.println(seriesExclusive(7));

	}
	
	public static String seriesInclusive (int num){
		String word = "";
		int num1 = 0;
		
		while (num1 < num) {
			num1 = num1 + 1;
			word = word + num1 +" ";
		
		}
			word = word.trim();
			return word;
	}

	public static String seriesExclusive (int num ) {
		String word = "";
		int num1 = 0;

		while (num1 < num) {
			
			word = word + num1 + " ";
			num1 = num1 + 1;
			
		}
			return word.trim();
	}
}
