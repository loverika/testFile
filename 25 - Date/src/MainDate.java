import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainDate {

	public static void main(String[] args) {
		// SimpleDate format is a concrete class for formatting and parsing date which inherits java.text.Dateformat class
		//Formatting means converting date to String, and parsing - converting String to Date
		
		Date date = new Date();
		System.out.println(date); //Wed Nov 21 11:26:24 EST 2018
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyy"); // M - month, m - minute   OUTCOME 21/11/2018
		String strDate = formatter.format(date);
		System.out.println(strDate);
		
		System.out.println("----Other option-------");
		
		formatter = new SimpleDateFormat("MM/dd/yyyy"); //11/21/2018
		strDate = formatter.format(date);
		System.out.println(strDate);
		
System.out.println("----Other option-------");
		
		formatter = new SimpleDateFormat("dd-M-yyyy hh:mm:ss"); //21-11-2018 11:26:24
		strDate = formatter.format(date);
		System.out.println(strDate);
		
System.out.println("----Other option-------");
		
		formatter = new SimpleDateFormat("dd MMMM yyyy"); //21 November 2018
		strDate = formatter.format(date);
		System.out.println(strDate);
		
System.out.println("----Other option-------");
		
		formatter = new SimpleDateFormat("dd MMMM yyyy zzzz"); //21 November 2018 Eastern Standard Time
		strDate = formatter.format(date);
		System.out.println(strDate);
		
System.out.println("----Other option-------");
		
		formatter = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss z"); //Wed, 21 Nov 2018 11:31:47 EST    ; EEEE - will print Wednesday
		strDate = formatter.format(date);
		System.out.println(strDate);
		
		//////// Convert String into Date
		System.out.println("------------------------------------");
		System.out.println("----Convert String into Date-------");
		System.out.println("------------------------------------");
		
		formatter= new SimpleDateFormat("dd/MM/yyyy");
		try {
			date = formatter.parse("31/03/2015");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(date);
		
	}

}
