package constructor.person;

public class BankAccount {
	private double balance;
    public BankAccount(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
    public void withdraw(double amount){
        balance = this.balance-amount;
    }
}
