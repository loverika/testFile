
public class swithCaseEleven {

	public static void main(String[] args) {
		int day=0;
		String printDayOfTheWeek;
		
		switch (day) {
	case 0: printDayOfTheWeek="Sunday";
		break;
	case 1: printDayOfTheWeek="Monday";
		break;
	case 2: printDayOfTheWeek="Tuesday";
		break;
	case 3: printDayOfTheWeek="Wednesday";
		break;
	case 4: printDayOfTheWeek="Thursday";
		break;
	case 5: printDayOfTheWeek="Friday";
		break;
	case 6: printDayOfTheWeek="Saturday";
		break;
	default: printDayOfTheWeek="Invalid day";
		
		}
		System.out.println(printDayOfTheWeek);
		
	}
}
