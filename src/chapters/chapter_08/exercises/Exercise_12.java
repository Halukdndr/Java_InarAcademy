package chapters.chapter_08.exercises;

import java.util.Scanner;

public class Exercise_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your filing status (0 for single filer,1 for married jointly or qualifying widow(er),2 for married separately,3 for head of household) :");
        int status = input.nextInt();
        System.out.println("Enter your amount of taxable income :");
        double amountOfIncome = input.nextDouble();
        double tax = computeTax(status,amountOfIncome);
        System.out.println("Your tax amount is " + tax);

    }

    private static double computeTax(int status,double amountOfIncome) {
        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950}, // Single filer
                {16700, 67900, 137050, 20885, 372950}, // Married jointly or qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475}, // Married separately
                {11950, 45500, 117450, 190200, 372950} // Head of household
        };
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        double tax = 0;
        if (amountOfIncome >= brackets[status][0]) {
            for (int i = brackets[status].length - 1; i >= 0; i--) {
                if (amountOfIncome > brackets[status][i]) {
                    tax += (amountOfIncome - brackets[status][i]) * rates[i + 1];
                    amountOfIncome = brackets[status][i];
                }
            }
            tax += brackets[status][0] * rates[0];
        }else{
            tax = amountOfIncome * rates[0];
        }
        return tax;
    }
}
