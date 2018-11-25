
public class MainInterface {

	public static void main(String[] args) {
		//DeskPhone mikePhone = new DeskPhone(2094826482, true);
		Telephone mikePhone = new DeskPhone(2019387653, true);
		mikePhone.powerOn();
		mikePhone.callPhone(395968345);
		mikePhone.answer();
	}
}
