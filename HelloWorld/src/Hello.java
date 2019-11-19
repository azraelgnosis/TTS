import java.util.Scanner;

public class Hello {
	public String hi = "hi";
	
	public static void main(String[] args) {
		// ACCESS_MODIFIER DATA_TYPE VAR_NAME;
		String hey;
		hey = "Hello there";
		String oi = "'sup";
		
		// Primitive Data Types
		boolean b = true;
		byte by = 5;
		short sh = 127;
		int i = 12345;
		long l = 123456789102l;
		char han = '한';
		float f = 1.34f;
		double d = 1.33455464d;
		
		// String is a reference type
		String str = "한한";
		char[] hans = {'한', '한'};
		
		
		char character = 'f'; // single-quote
		String string = "f"; // double-quote
//		char char2 = "f";
//		String str = 'f';
		

		// Formatted Strings / String Interpolation
		String firstName = "Lynn";
		String lastName = "Smith";
		System.out.println("Hello there, " + firstName + " " + lastName);
		System.out.printf("Hello there, %s %s\n", firstName, lastName);
		String greeting = String.format("Hello there, %s %s", firstName, lastName);
		System.out.println(greeting);
		System.out.println("Today is pretty ok!");
		
		Scanner input = new Scanner(System.in);
		System.out.print("What's your first name? ");
		String givenName = input.nextLine();
		System.out.print("What's your last name? ");
		String surname = input.nextLine();
		System.out.printf("Hey %s %s", givenName, surname);
		
	}
}