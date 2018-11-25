
public class DataTypes {

	public static void main(String[] args) {
		// byte
		byte b1=25;
		byte b2=-128;
		byte b3=127;
		System.out.println(b1+"|"+b2+"|"+b3);
		System.out.println("-----------------------");
		
		//short
		short s1=500;
		short s2=-32768;
		short s3=32767;
		//short s4=32768;
		System.out.println(s1+"|"+s2+"|"+s3);
		
		System.out.println("--------------------------");
		
		//int
		int i1=-50000;
		int i2=100000; // in Java8 you can use underscore to make large number more readable, 100_00=100000
		int i3=50000;
		System.out.println(i1+"|"+i2+"|"+i3);
		
		//long
		long l1=100_000_000;
		long l2=214783985173492L;
		
		//float: floating point types have double size
		float f1=5.2f;
		double d1=5.2;
		System.out.println("f1+"|+d1);

		//boolean
		boolean bool1=true;
		boolean bool2=false;
		System.out.println(bool1+"|+bool2");
		
		//char
		char c1='D';
		char c2='2';
		char c3='@';
		char c4='A';// get it from unicode
		System.out.println(c4);
		

	}

}
