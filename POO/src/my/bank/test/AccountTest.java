package my.bank.test;

import my.bank.domain.Account;

public class AccountTest {
	public static void main(String[] args) {
		Account cuenta = new Account(0.0);
		cuenta.deposit(200.00);
		cuenta.withdraw(50.0);
		cuenta.show();
		cuenta.deposit(2100.00);
		cuenta.show();
	}
}
