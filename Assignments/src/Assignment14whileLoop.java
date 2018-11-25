//Write a method called isPalindrome with one int parameter called number.
//The method needs to return a boolean.
//It should return true if the number is a palindrome number otherwise it should return false.
//
//Sample Output:
//isPalindrome(-1221) - > should return true
//isPalindrome(707) - > should return true
//isPalindrome(11212) - > should return false because reverse is 21211 and that is not equal to 11212

public class Assignment14whileLoop {

	public static void main(String[] args) {
		System.out.println(isPalindrome(-1221)); // - > true
		System.out.println(isPalindrome(707)); // - > true
		System.out.println(isPalindrome(11212)); // - > false

	}
	public static boolean isPalindrome(int num) {
		int reverse=0;
		int num1=num;
		while(num!=0) {
			int lastDigit=num%10;
			reverse=reverse*10+lastDigit;
			num=num/10;			
		}
		if(num1==reverse) {
			return true;
		}else {
			return false;
		}
	} //isPalindrome
}
