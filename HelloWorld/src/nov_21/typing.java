package nov_21;

public class typing {
	public static void main(String[] args) {
//		int i = 5;
//		System.out.println(i);
//		for (i *= 3; i < 19; i++) {
//			System.out.println(i);
//		}
//		
//		System.out.println(i);
		
      int inTheIf = 33;

      for( int i=0; i<20; i++  )
      {
        // both inTheIf and the for-loop varible are accessible in here
        System.out.println("Value of inTheIf: " + inTheIf++); // "Value of inTheIf: 33"
        System.out.println("Index: " + i); // "Index: 0"
      }
		
	}
}