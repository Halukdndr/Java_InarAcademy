package chapters.chapter_08.examples;

import java.util.Arrays;
import java.util.Scanner;

public class GradeExam {
    public static void main(String[] args) {
        char[][] grades = getRandomGrades();
        System.out.println("           0  1  2  3  4  5  6  7  8  9");
        for (int i = 0;i < getRandomGrades().length;i++){
            System.out.print("Student " + i + ":");
            System.out.println(Arrays.toString(grades[i]));
        }
        char[] answerKey = getRandomAnswerKey();
        System.out.println("                      Answer Key");
        System.out.print("          ");
        System.out.println(Arrays.toString(answerKey));
        checkTheAnswers(grades,answerKey);

    }
    public static char[][] getRandomGrades(){
        char[][] grades = new char[8][10];
        for (int i = 0;i < grades.length;i++){
            for (int j = 0;j < grades[i].length;j++){
                grades[i][j] = (char) ((int)(Math.random() * 5) + 'A');
            }
        }
    return grades;
    }
    public static char[] getRandomAnswerKey(){
        char[] answers = new char[10];
        for (int i = 0;i < answers.length;i++){
            answers[i] = (char) ((int)(Math.random() * 5) + 'A');
        }
        return answers;
    }
    public static void checkTheAnswers(char[][] answers,char[] answerKey){

        for (int i = 0;i < answers.length;i++){
            int countCorrectAnswers = 0;
            for (int j = 0;j < answers[i].length;j++){
                if (answers[i][j] == answerKey[j]){
                    countCorrectAnswers++;
                }
            }
            System.out.println("Student " + i + ": " + countCorrectAnswers + "/10");
        }
    }
}
