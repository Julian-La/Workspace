package constructor.person;

import java.text.DecimalFormat;

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
    public String showBalance() {
    	DecimalFormat df = new DecimalFormat("#.##");
        return "Your balance is "+df.format(balance)+" €.";
    }
}
