package chapters.chapter_12.exercises.E04;

import java.util.Date;

public class Loan2 {

        private double annualInterestRate;
        private int numberOfYears;
        private double loanAmount;
        private java.util.Date loanDate;

    public Loan2(double annualInterestRate, int numberOfYears, double loanAmount) {
        if (loanAmount <= 0 || numberOfYears <= 0 || annualInterestRate <= 0) {
            throw new java.lang.IllegalArgumentException("Check your input!");
        }
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
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
