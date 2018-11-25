
public class ifStatement {

	public static void main(String[] args) {
		
		int i = 432876547, i25=150_000_000, i30=300_000_000, i35=600_000_000, i40=1_200_000_000;
		double t;
		
		if(i<i25) {
			t=i*0.25;
			System.out.println("On amount of $"+i+" you will have to pay $"+t+" taxes.");
		}else if(i>=i25 && i<i30){
			t=i25*0.25+(i-i25)*0.30;
			System.out.println("On amount of $"+i+" you will have to pay $"+t+" taxes.");
		}else if(i>=i30 && i<i35) {
			t=i25*0.25+(i30-i25)*0.30+(i-i30)*0.35;
			System.out.println("On amount of $"+i+" you will have to pay $"+t+" taxes.");
		}else if(i>=i35 && i<i40) {
			t=i25*0.25+(i30-i25)*0.30+(i35-i30)*0.35+(i-i35)*0.40;
		}else {
			t=i25*0.25+(i30-i25)*0.30+(i35-i30)*0.35+(i40-i35)*0.40+(i-i40)*0.50;
		}
	}
}
