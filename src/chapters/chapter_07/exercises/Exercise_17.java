package chapters.chapter_07.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students ");
        int numberOfStudents = input.nextInt();
        System.out.println("Enter the students' names and scores:");
        String[] namesOfTheStudents = new String[numberOfStudents];
        double[] scoresOfTheStudents = new double[numberOfStudents];
        for (int i = 0;i < numberOfStudents;i++){
            namesOfTheStudents[i] = input.next();
            scoresOfTheStudents[i] = input.nextDouble();
        }
        for (int i = 0;i < numberOfStudents - 1;i++){
            for (int j = i + 1;j < numberOfStudents;j++){
                if (scoresOfTheStudents[i] < scoresOfTheStudents[j]){
                    swapDoubleArray(scoresOfTheStudents,i,j);
                    swapStringArray(namesOfTheStudents,i,j);
                }
            }
        }
        System.out.println(Arrays.toString(scoresOfTheStudents));
        System.out.println(Arrays.toString(namesOfTheStudents));
    }
    public static void swapStringArray(String[] arrStr,int index1,int index2){
        String temp = arrStr[index1];
        arrStr[index1] = arrStr[index2];
        arrStr[index2] = temp;
    }
    public static void swapDoubleArray(double[] arrDouble,int index1,int index2){
        double temp = arrDouble[index1];
        arrDouble[index1] = arrDouble[index2];
        arrDouble[index2] = temp;
    }
}
