package chapters.chapter_11.exercises.E03;

import chapters.chapter_09.exercises.Account;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    public void withdraw(double amount){
        if (this.getBalance() - amount >= -overdraftLimit){
            this.setBalance(this.getBalance() - amount);
        }else {
            System.out.println("Your limit is up!");
        }
    }
    @Override
    public String toString() {
        return "ClassName = CheckingAccount\nBalance = " + getBalance() +
                "\nMonthly interest = " + getMonthlyInterest() +
                "\nDate created = " + getDateCreated();
    }
}
