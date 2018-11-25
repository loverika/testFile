package Computer;

public class PC {

	private Case theCase;
	private Monitor theMonitor;
	private motherBoard theMotherboard;
	
	public PC(Case theCase, Monitor theMonitor, motherBoard theMotherboard) {
		this.theCase = theCase;
		this.theMonitor = theMonitor;
		this.theMotherboard = theMotherboard;
	}

	public Case getTheCase() {
		return theCase;
	}

	public Monitor getTheMonitor() {
		return theMonitor;
	}

	public motherBoard getTheMotherboard() {
		return theMotherboard;
	}
	
	
}
