import java.util.*;

public class userInput {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("Enter a byte  value");
//		byte b1=scanner.nextByte();
//		System.out.println("My byte value is "+b1);
//		
//		System.out.println("Enter short value");
//		short s1=scanner.nextShort();
//		
		System.out.println("Enter an int value");
		int i1=scanner.nextInt();
//		
//		System.out.println("Enter boolean");
//		boolean bool1=scanner.nextBoolean();		
//		System.out.println((b1+"  |  "+s1+"  |  "+i1+"  |  "+bool1));
		
		scanner.nextLine();
		
		System.out.println("Enter your name");
		String str=scanner.nextLine();
		System.out.println(str);
		
		
		
		
		}

}
