package constructor.person;

import java.text.DecimalFormat;

public class BankAccount_Program {

	public static void main(String[] args) {
		BankAccount b = new BankAccount(2202.2);
//		System.out.println(b.getBalance());
		b.withdraw(4.65);
		System.out.println(b.showBalance());

	}

}
