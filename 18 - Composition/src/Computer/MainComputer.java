package Computer;

public class MainComputer {

	public static void main(String[] args) {
				
		Dimensions theDimensions = new Dimensions(20,20,5);
		Case theCase = new Case("2288", "Dell", "240", theDimensions);
		motherBoard theMotherboard = new motherBoard("BJ-200", "Asus", 4,5,"v.2.44");
		Monitor theMonitor = new Monitor("27 inch Beast", "Acer", 27, new Resolution(2540, 1440));		
		
		PC thePC = new PC(theCase, theMonitor, theMotherboard); //new Invokes the constructor
		thePC.getTheMonitor().drawPixelAt(1500, 1200, "red");
		
		thePC.getTheMotherboard().loadProgram("Windows 1.8");
		
		thePC.getTheCase().pressPowerButton();

	}

}
