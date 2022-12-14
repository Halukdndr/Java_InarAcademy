package chapters.chapter_11.exercises.E08;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private String name;
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transaction> transactions = new ArrayList<>();
    public Account() {
        this(null, 0, 0, 0);
    }

    public Account(int id, double balance, double annualInterestRate) {
        this(null, id, balance, annualInterestRate);
    }

    public Account(String name, int id, double balance, double annualInterestRate) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthlyInterestRate(){
        return this.annualInterestRate / 1200.0;
    }
    public double getMonthlyInterest(){
        return  balance * this.getMonthlyInterestRate();
    }
    public ArrayList<Transaction> getTransactions() {
        return this.transactions;
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Balance : " + this.balance);
            System.out.println("The amount you can withdraw at most : " + this.balance);
            return;
        }
        this.balance -= amount;
        transactions.add(new Transaction(Transaction.WITHDRAW, amount, balance));
    }

    public void deposit(double amount) {
        this.balance += amount;
        transactions.add(new Transaction(Transaction.DEPOSIT, amount, balance));
    }

    @Override
    public String toString() {
        return "Name : " + this.name +
                "\nID : " + this.id +
                "\nBalance : " + this.balance;

    }

}
