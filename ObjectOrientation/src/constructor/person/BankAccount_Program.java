package constructor.person;

public class BankAccount_Program {

	public static void main(String[] args) {
		BankAccount b = new BankAccount(2.2);
		System.out.println(b.getBalance());
		b.withdraw(1);
		System.out.println(b.getBalance());

	}

}
