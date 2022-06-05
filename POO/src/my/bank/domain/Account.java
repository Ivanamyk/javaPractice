package my.bank.domain;

public class Account {
	private Double balance;
	
	public Account(Double amount) {
		balance=0.0;
	}

	public void deposit(Double amount) {
		balance = balance + amount;
	}

	public void withdraw(Double amount) {
		if(balance>=amount) {
			 balance = balance - amount;
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void show() {
		System.out.println("resultado: " + balance);
	}
	
	
	
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	
	
	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}
	
	
	
}
