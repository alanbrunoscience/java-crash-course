package a.naming_convention;

public class Example1_Account {

	private String holder;
	private Double balance;

	public Example1_Account(String holder, Double balance) {
		this.holder = holder;
		this.balance = balance;
	}

	public String getHolder() {
		return holder;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

}
