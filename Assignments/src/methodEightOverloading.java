
public class methodEightOverloading {

	public static void main(String[] args) {
		
		getDuration(653, 46);
		getDuration(3893);

	}
	
	public static int getDuration(int min, int sec) {
		if(min<0 || sec<0 || sec>59) {
			System.out.println("Invalid value");
			}
		int hours = min/60;
		min=min%60;
		System.out.println(hours+" hours "+min+" minutes "+sec+" seconds");
		return hours;
	}
	
	public static int getDuration(int sec) {
		if(sec<0) {
			System.out.println("Invalid entry");
		}
		int hours=sec/3600;
		int min=sec-hours*60;
		sec=sec%3600;
		System.out.println(hours+" hours "+min+" minutes "+sec+" seconds");
		return hours;			
		}
	}

