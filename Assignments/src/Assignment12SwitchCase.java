
public class Assignment12SwitchCase {

	public static void main(String[] args) {
		int num=9;
		String printNumberInWord;
		switch(num) {
		case 0:
			printNumberInWord="ZERO";
			break;
		case 1:
			printNumberInWord="ONE";
			break;
		case 2:
			printNumberInWord="TWO";
			break;
		case 3:
			printNumberInWord="THREE";
			break;
		case 4:
			printNumberInWord="FOUR";
			break;
		case 5:
			printNumberInWord="FIVE";
			break;
		case 6:
			printNumberInWord="SIX";
			break;
		case 7:
			printNumberInWord="SEVEN";
			break;
		case 8:
			printNumberInWord="EIGHT";
			break;
		case 9:
			printNumberInWord="NINE";
			break;
		default:
			printNumberInWord="OTHER";
		}
		System.out.println(printNumberInWord);
	}
}
