
public class Account {
	
	private int accountNumber;
	private int amount;
	private int depositeAmount;
	public int getDepositeAmount() {
		return depositeAmount;
	}
	public void setDepositeAmount(int depositeAmount) {
		this.depositeAmount = depositeAmount;
	}
	public Account(int accountNumber, int amount) {
		super();
		this.accountNumber = accountNumber;
		this.amount = amount;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	

}
