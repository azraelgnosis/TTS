import java.util.Scanner;

public class Lesson {
	public static void main(String[] args) {
		// DATA_TYPE VAR_NAME = new CONSTRUCTOR(PARAMS);
		String string = new String("words");
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is your favorite color? ");
		String color = input.nextLine();
		String str;
		str = String.format("My favorite color is %s", color);
		//str = "My favorite color is " + color;
		System.out.println(str);
		
		System.out.print("What is your favorite number? ");
		int faveNum = input.nextInt();
		String num = String.format("My favorite number is %d", faveNum);
		System.out.println(num);
		
		System.out.println("What is your quest? ");
		input.nextLine();
		String quest = input.nextLine();
		System.out.printf("%s", quest);
		
	}
}
