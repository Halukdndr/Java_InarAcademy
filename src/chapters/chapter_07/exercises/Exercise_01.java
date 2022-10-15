package chapters.chapter_07.exercises;

import java.util.Scanner;

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        double[] scores = getScores(numberOfStudents,input);
        char[] grades = getGrade(scores);
        for (int i = 0;i < numberOfStudents;i++){
            System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grades[i]);
        }
    }

    private static double[] getScores(int numberOfStudents,Scanner input) {
        double[] scores = new double[numberOfStudents];
        System.out.println("Enter " + numberOfStudents + " scores:");
        for (int i = 0;i < numberOfStudents;i++){
            scores[i] = input.nextDouble();
        }
        return scores;
    }
    public static double getMax(double[] scores){
        double max = scores[0];
        for (int i = 1;i < scores.length;i++){
            if (scores[i] > max){
                max = scores[i];
            }
        }
        return max;
    }
    public static char[] getGrade(double[] scores){
        double maxScore = getMax(scores);
        char[] grades = new char[scores.length];
        for (int i = 0;i < grades.length;i++){
            if (scores[i] >= maxScore - 10){
                grades[i] = 'A';
            } else if (scores[i] >= maxScore - 20) {
                grades[i] = 'B';
            } else if (scores[i] >= maxScore - 30) {
                grades[i] = 'C';
            } else if (scores[i] >= maxScore - 40) {
                grades[i] = 'D';
            }else {
                grades[i] = 'F';
            }
        }
        return grades;
    }
}
