package nov_21;

public class Modifiers {
	public static void main(String[] args) {
		final int a = 4;
//		a = 5;
		final double PI = Math.PI; //3.14;
//		Math.PI = 4;
		
		// Wrapper Classes
		int max = Integer.MAX_VALUE;
		System.out.println(max);
		int c = 90;
		int b = 5;
		int integer = new Integer(54);
		Integer integer2 = new Integer(54);
		
		System.out.println(new Integer(5) == new Integer(5));
		System.out.println(Integer.parseInt("6") + 3);
		System.out.println(Long.parseLong("23462234"));
		System.out.println(Double.parseDouble("34.24321"));
		System.out.println(Integer.compare(6, 76));
		System.out.println(Integer.compare(86, 76));
		System.out.println(Integer.compare(76, 76));
		
		String s = "here are some words";
		int len = s.length();
		System.out.println(len);
		
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		
		System.out.println("more letters".indexOf(0));
		System.out.println("more letters".charAt(3));
		
		String cat = s
				.concat(" and a few")
				.concat(" additional ones")
				.concat(" and a third time"); // s + " and a few additional ones"
		System.out.println(cat); 
		
		System.out.println(cat.substring(34));
		System.out.println(cat.substring(34, 39));
		
		String fsd = "sdf";
		fsd = "qwerty";
//		fsd = 3;
		
		short shorty = 6;
		long longy = 32797L; // short -32768 to 32767
		System.out.println(shorty+longy);
		System.out.println((short)shorty+longy);
		System.out.println((short)32803);
		System.out.println((short)(shorty+longy));
		
		long l = 5L;
		int i = 5;
		double d = 6.0;
		System.out.println(l*d);
		System.out.println(i*d);
		
		if (l == 5) {
			int j = 34;
		}
		System.out.println(Long.parseLong("1203fg2"));
	}
	
	

}

class Table {
	final int numLegs = 4;
}