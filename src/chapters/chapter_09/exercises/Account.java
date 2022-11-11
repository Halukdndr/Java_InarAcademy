package chapters.chapter_09.exercises;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(){
        this(0,0);
        this.annualInterestRate = 0;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
        this.annualInterestRate = 0;
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


    public double getMonthlyInterestRate(){
        return this.annualInterestRate / 1200.0;
    }
    public double getMonthlyInterest(){
        return  balance * this.getMonthlyInterestRate();
    }
    public void  withdraw(double amount){
        this.balance -= amount;
    }
    public void deposit(double amount){
        this.balance += amount;
    }


}
