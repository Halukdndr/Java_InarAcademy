package chapters.chapter_07.examples;

import java.util.Scanner;

public class AnalyzeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of student");
        int numberOfStudent = input.nextInt();

        double[] scoreArray = new double[numberOfStudent];

        System.out.println("Enter " + numberOfStudent + " scores ");
        double sum = 0;
        for (int i = 0;i < scoreArray.length;i++){
            scoreArray[i] = input.nextDouble();
            sum += scoreArray[i];
        }

        double average = sum / scoreArray.length;
        int countOfOverAverage = 0;
        for (int i = 0;i < scoreArray.length;i++){
            if (scoreArray[i] > average){
                countOfOverAverage++;
            }
        }
        System.out.println("The average is " + average);
        System.out.println("The number of student who are over average is " + countOfOverAverage);


    }
}
