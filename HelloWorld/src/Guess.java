import java.util.Random;
import java.util.Scanner;

public class Guess {
	public static void main(String[] args) {
		
		Random rand = new Random();
		int target = rand.nextInt(100);
		
		int guess = 0;
		while (guess != target) {
			System.out.print("Pick a number between 1 and 100: ");
			Scanner input = new Scanner(System.in);
			guess = input.nextInt();
			
			if (guess == target) {
				System.out.println("Yay");
			} else {
				System.out.println("Wrong!");
			}
		}
	}
}