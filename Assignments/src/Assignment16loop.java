//Write a method named getEvenDigitSum with one parameter of type int called number. The method should return the sum of the even digits within the number. If the number is negative, the method should return -1 to indicate an invalid value.
//
//Sample Output:
//getEvenDigitSum(123456789); //should return 20 since 2+4+6+8=20.
//getEvenDigitSum(252); //should return 4 since 2+2=4.
//getEvenDigitSum(-22); //should return -1 since the number is negative.

public class Assignment16loop {

	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(123456789)); //should return 20 since 2+4+6+8=20.
		System.out.println(getEvenDigitSum(252)); //should return 4 since 2+2=4.
		System.out.println(getEvenDigitSum(-22)); //should return -1 since the number is negative.

	}
	
	public static int getEvenDigitSum(int num) {
		if(num<0) {
			return -1;
		}
		int sum=0;
		while(num>0) {
			int num1=num%10;
			if(num1%2==0) {
				sum=sum+num1;
			}
			num=num/10;
		}
		return sum;
	}
}
