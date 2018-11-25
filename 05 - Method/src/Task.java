
public class Task {

	public static void main(String[] args) {
		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Mike", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(900);
		displayHighScorePosition("Ronaldo", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(400);
		displayHighScorePosition("Taylor", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(50);
		displayHighScorePosition("Batu", highScorePosition);
		
//		calculateHighScorePosition(900);
//		calculateHighScorePosition(400);
//		calculateHighScorePosition(50);
		

	}
	public static void displayHighScorePosition( String name, int highScorePosition) {
		System.out.println(name+" managed to get into position "+highScorePosition+" on the high score table");

	}
	public static int calculateHighScorePosition(int score) {
		
		if(score>=1000) {
			return 1;
		}else if(score<1000 && score>=500) {
			return 2;
		}else if(score<500 && score>=100) {
			return 3;
		}else {
			return 4;
		}
	}

}
