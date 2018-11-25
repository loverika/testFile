
public class methodFour {

	public static void main(String[] args) {
		System.out.println(bark(true,1));
		System.out.println(bark(false,2));
		System.out.println(bark(true,8));
		System.out.println(bark(true,-1));

	}
	
	public static boolean bark(boolean barking, int hourOfDay) {
		if(barking) {
			if(hourOfDay>=0 && hourOfDay<=23) {
				if(hourOfDay<8 || hourOfDay>22) {
						return true;
				}else {
					return false;
						}
			}else{
				return false;
					}
	}else {
		return false;
	}
		
	}

}
