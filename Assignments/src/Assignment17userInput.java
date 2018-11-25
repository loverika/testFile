//Read the numbers from console entered by the user and print the minimum and maximum number the user has entered.
//Before the user enters the number, print the message "Enter number"
//If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
//
//Hint:
//Use an endless while loop

import java.util.*;

public class Assignment17userInput {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number");
		int x=scanner.nextInt();
		int max=x; 
		int min=x;
		
		while (scanner.hasNextInt()) {
			x=scanner.nextInt();
			if(x>=max) {
				max=x;
			}else if(x<=min) {
				min=x;
			}
			System.out.println("Enter number");
		}
System.out.println("MAX number is equal "+max+" and MIN number is equal "+min);
scanner.close();
	}

}
