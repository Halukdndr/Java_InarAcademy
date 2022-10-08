package chapters.chapter_06.exercises;

import java.util.Scanner;

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the investment amount(e.g.,1000)");
        double investmentAmount = input.nextDouble();
        System.out.println("Enter the interest rate (e.g.,9%)");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200;
        titleOfTable();
        for (int i = 1; i <= 30; i++){
            System.out.printf("%-2d",i);
            System.out.printf("%18.2f\n",futureInvestmentValue(investmentAmount,monthlyInterestRate,i));
        }
    }

    private static void titleOfTable() {
        System.out.println("Years\t Future Value");
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){

        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate),years * 12);
        return futureInvestmentValue;
    }
}
