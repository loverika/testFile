
public class MainComposition {

	public static void main(String[] args) {
		
		Engine e1=new Engine();
		// Honda h1=new Honda("Red", 200 , e1 ); // either way is correct, line 7 or 8
		Honda h1=new Honda("Red", 200 , new Engine() );
		h1.carInfo();
		h1.startHonda();

	}

}
