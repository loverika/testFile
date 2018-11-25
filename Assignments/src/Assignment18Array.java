import java.util.Scanner;

public class Assignment18Array {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		
	}
	public static int getIntegers() {
		// How many numbers?
		System.out.println("Enter how many numbers: ");
		int n = Integer.parseInt(scan.nextLine());
		return n;
	}
	
	public static void printArray(int [] Array) {
		//Create an array to store values
		int intArray[]=new int[getIntegers()];
		for (int i=0; i<getIntegers(); i++) {
			intArray[i]=scan.nextInt();
			}
		System.out.println(intArray);
		
	}
	
	
	
}
