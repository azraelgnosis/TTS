import java.util.Scanner;

public class QuickMaths {
	public static void main(String[] args) {
		double x = 5.0;
		int y = 2;
//		System.out.println(x/y);
		
		
//		int i = 0;
//		while (i < 10) {
//			System.out.println(++i);
//		}
		
//		int num1 = 2;
//		int num2 = 4;
//		num1 *= num2; // num1 = num1 * num2;
//		System.out.println(num1);
//		
		
		Scanner userInput = new Scanner(System.in);
		
//		int ageLimit = 21;
//		
//		System.out.print("How old are you? ");
//		int age = Integer.parseInt(userInput.nextLine());
//		
//		if (age >= ageLimit) {
//			System.out.println("Old enough!");
//		} else if (age < ageLimit) {
//			System.out.println("Get off my lawn!");
//			System.out.printf("Come back in %d years", ageLimit-age);
//		} 	
		
		String word1 = "Hello";
		String word2 = "Hello";
		String word3 = "Goodbye";
		
		String s1 = new String("Hello World");
		String s2 = new String("Hello World");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(word1 == "Hello"); // true
		System.out.println(word1 == word2); // true
		System.out.println(word1.equals(word2)); // true
		System.out.println(word1.equals(word3)); // false
		System.out.println(new String("Hello World").equals("Hello World")); // true
		System.out.println(new String("Hello World") == "Hello World"); // false
		System.out.println(new String("Hello World") == new String("Hello World")); // false
		System.out.println("Hello World" == "Hello " + "World"); // true
	}
}