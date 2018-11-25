import java.util.Scanner;

public class taskUserInput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int count=1;
		int sum=0;
				
		while (count<=10) {
			
			System.out.println("Enter number #"+count);
		
				if(scanner.hasNextInt()) {
					int i=scanner.nextInt();
					sum=sum+i;
					count++;
				}else {
					System.out.println("Invalid number");
					}
				scanner.nextLine();
		}
		
		System.out.println(sum);
		scanner.close();
	}
}
