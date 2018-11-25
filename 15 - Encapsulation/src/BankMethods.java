
public class BankMethods {

	public static void main(String[] args) {
		
		BankClass MLN = new BankClass();
		MLN.setBalance(3000);
		double balance=MLN.getBalance();
		System.out.println(balance);
		
		
	MLN.deposit(500);
	System.out.println(MLN.getBalance());
	MLN.withdrawal(1000);
	System.out.println(MLN.getBalance());

	}
	}

