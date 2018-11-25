
public class BankClass {
	private String accountNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	
	public void deposit(double amount1) {
		this.balance=balance+amount1;
	}
	
	public void withdrawal(double amount2) {
		if(this.balance>=amount2) {
			this.balance-=amount2;
			System.out.println(balance);
		}else {
			System.out.println("Unsufficient funds to complete the transaction");
		}
		}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getcName() {
		return customerName;
	}
	public void setcName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
		
}
