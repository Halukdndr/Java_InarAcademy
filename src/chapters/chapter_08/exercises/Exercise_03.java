package chapters.chapter_08.exercises;

import java.util.Arrays;

public class Exercise_03 {
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
        int[][] numberOfCorrectAnswersOfStudents = new int[8][2];
        numberOfCorrectAnswersOfStudents = checkTheAnswers(grades,answerKey);
        numberOfCorrectAnswersOfStudents = sort(numberOfCorrectAnswersOfStudents);
        display(numberOfCorrectAnswersOfStudents);

    }

    private static void display(int[][] arr) {
        for (int i = 0;i < arr.length;i++) {
            System.out.println("Student " + arr[i][0] + ":" + arr[i][1] + "/10");
        }
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
    public static int[][] checkTheAnswers(char[][] answers,char[] answerKey){
        int[][] numberOfCorrectAnswersOfStudents = new int[8][2];
        for (int i = 0;i < answers.length;i++){
            int countCorrectAnswers = 0;
            for (int j = 0;j < answers[i].length;j++){
                if (answers[i][j] == answerKey[j]){
                    countCorrectAnswers++;
                }
            }
            numberOfCorrectAnswersOfStudents[i][0] = i;
            numberOfCorrectAnswersOfStudents[i][1] = countCorrectAnswers;
        }
        return numberOfCorrectAnswersOfStudents;
    }
    public static int[][] sort(int[][] numberOfCorrectAnswersOfStudents){

            for (int j = 0; j < numberOfCorrectAnswersOfStudents.length - 1; j++) {
                for (int i = j + 1; i < numberOfCorrectAnswersOfStudents.length; i++) {
                    if (numberOfCorrectAnswersOfStudents[j][1] > numberOfCorrectAnswersOfStudents[i][1]){
                        int temp = numberOfCorrectAnswersOfStudents[j][1];
                        numberOfCorrectAnswersOfStudents[j][1] = numberOfCorrectAnswersOfStudents[i][1];
                        numberOfCorrectAnswersOfStudents[i][1] = temp;

                        temp = numberOfCorrectAnswersOfStudents[j][0];
                        numberOfCorrectAnswersOfStudents[j][0] = numberOfCorrectAnswersOfStudents[i][0];
                        numberOfCorrectAnswersOfStudents[i][0] = temp;
                    }
                }
            }
            return numberOfCorrectAnswersOfStudents;
    }


}
