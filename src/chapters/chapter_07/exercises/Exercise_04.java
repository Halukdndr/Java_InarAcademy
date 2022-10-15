package chapters.chapter_07.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the scores ");
        double[] scores = new double[10];
        scores = fillWithScanner(input,scores);
        System.out.println(getAverage(scores) + " is average " + getBelowAverage(scores) + " students are below the average, " + getAboveAverage(scores) + " students are abow the average and " + getEqualAverage(scores) + " students get the average score ");


    }
    public static int getEqualAverage(double[] scores){
        int countEqualAverage = 0;
        for (int i = 0;i < scores.length;i++){
            if (scores[i] == getAverage(scores)){
                countEqualAverage++;
            }
        }
        return countEqualAverage;
    }
    public static int getAboveAverage(double[] scores){
        int countAboveAverage = 0;
        for (int i = 0;i < scores.length;i++){
            if (scores[i] > getAverage(scores)){
                countAboveAverage++;
            }
        }
        return countAboveAverage;
    }
    public static int getBelowAverage(double[] scores){
        int countBelowAverage = 0;
        for (int i = 0;i < scores.length;i++){
            if ( 0 <= scores[i] && scores[i] < getAverage(scores)){
                countBelowAverage++;
            }
        }
        return countBelowAverage;
    }
    private static double getAverage(double[] scores){
        double sum = 0;
        int countNumberOfStudents = 0;
        for (int i = 0;i < scores.length;i++){
            if (scores[i] >= 0){
                sum += scores[i];
                countNumberOfStudents++;
            }
        }
        return sum / countNumberOfStudents;
    }

    private static double[] fillWithScanner(Scanner input, double[] scores) {
        int i = 0;
        double d = 0;
        while (d >= 0) {
            d = input.nextDouble();
            if (d > 100){
                System.exit(0);
            }
            if (d >= 0) {
                scores[i] = d;
                i++;
            }
            if (i == scores.length){
                scores = resizeArray(scores);
            }
        }
        return scores;
    }

    private static double[] resizeArray(double[] scores) {
        double[] swollenArray = new double[scores.length * 2];
        java.util.Arrays.fill(swollenArray,-1);
        System.arraycopy(scores, 0, swollenArray, 0, scores.length);
        return swollenArray;
    }
}
