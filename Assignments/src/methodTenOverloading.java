
public class methodTenOverloading {

	public static void main(String[] args) {
		printYearsAndDays(525600); //= > "525600 min = 1 y and 0 d"
		printYearsAndDays(1051200); //= > "1051200 min = 2 y and 0 d"
		printYearsAndDays(561600); //= > "561600 min = 1 y and 25 d"

	}
	public static long printYearsAndDays(long minutes) {
		if(minutes<0) {
			System.out.println("Invalid entry");
		}
		long days=minutes/(60*24);
		long years=days/365;
		days=days%365;
		System.out.println(minutes+" minutes is equal to "+years+" year(s) and "+days+" days.");
		return years;
		}

}
