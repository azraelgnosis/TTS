package nov_21;

import java.util.Random;
import java.util.Scanner;

public class lesson {
	public static void main(String[] args) {
		
		// Random Number Generator (1-100)
		Random rand = new Random();
		int upperBound = 100;
		int target = rand.nextInt(upperBound)+1;
		
		//User Input Variable & Number of Guesses
		int guess = -1;
		int numGuesses = 0;
		
		int num = 1;
		while (Math.pow(2, num) < upperBound) {
			num++;
		}
		int numChances = num;
		System.out.println(numChances);
		
		Scanner input = new Scanner(System.in);
		
		//Response to User Input
		while (guess != target && numGuesses < numChances) {
			System.out.print("Pick a number between 1-100. You have 10 tries to guess!");
			guess = input.nextInt();
			//Tracks Number of Guesses
			++numGuesses;
			System.out.println("Guess number " + numGuesses);

			if (guess == target) {
				System.out.println("Yay! You guessed that the correct answer is " + target);
			} else if (guess < target){
				System.out.println("Brr, cold, your guess is too low.");
				System.out.println("You have " + (numChances-numGuesses) + " guesses remaining.");
			} else {
				System.out.println("Hot hot, your guess is too high.");
				System.out.println("You have " + (numChances-numGuesses) + " guesses remaining.");
			} 
		}
		
		//Response to Max Number of Guesses Reached
		if (guess != target && numGuesses == numChances) {
			System.out.println("You have no more guesses remaining. Play Again.");
		}
		
		System.out.println("Hm....");
	}
}