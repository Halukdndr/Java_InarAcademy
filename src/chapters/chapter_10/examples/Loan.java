package chapters.chapter_10.examples;

import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    public Loan() {
        this(2.5, 1, 1000);
    }
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }
    public double getMonthlyPayment(){
        double monthlyInterestRate = this.annualInterestRate / 1200;
        return this.loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate,this.numberOfYears * 12)));
    }
    public double getTotalPayment(){
        return getMonthlyPayment() * numberOfYears * 12;
    }
    @Override
    public String toString(){
        return "total payment: " + getTotalPayment() + " monthly payment " + getMonthlyPayment();
    }

}
