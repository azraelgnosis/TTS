
public class varTypes {
	public static void main(String[] args) {
		int a = 0, b = 1, c = 2;
//		int a;
//		int b;
//		int c;
		
		byte bite = (byte)129;
		System.out.println(bite);
		
		float x = (float)(int)'A'; //'A' = 65
		System.out.println(x);
		
		int smallInt = 120;
		int biggerInt = 550;
		
		byte b1 = (byte)smallInt;
		byte b2 = (byte)biggerInt;
		
		short s1 = (short)biggerInt;
		System.out.println(b1); // 120
		System.out.println(b2); // 38
		System.out.println(s1); // 550
		
		long BigLong = 230L;
		int integer = (int) 230L;
		float SomeFloat = 927.42F;
		double someDbl = 392.2D;
		double wishfulSalary = 123_000_100_325.0d;
		
		// ---
		char answer = 'Y';
		char middleInitialC = 0x0043; 
		char lowerCaseA = '\u0061'; // char lowerCaseA = 'a';
		char capitalK = 75; // char capitalK = 'K';
		System.out.println(middleInitialC);
		System.out.println(lowerCaseA);
		System.out.println(capitalK);
	}
}