package chapters.chapter_08.exercises;

import java.util.Scanner;

public class Exercise_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Each row records an employee’s seven-day work hours with seven columns");
        int[][] hoursOfWork = new int[8][7];
        for (int i = 0; i < hoursOfWork.length; i++) {
            for (int j = 0; j < hoursOfWork[i].length; j++) {
                hoursOfWork[i][j] = input.nextInt();
            }
        }
        int[][] totalHoursOfEachEmp = new int[8][2];
        totalHoursOfEachEmp = getTotalHourOfWork(hoursOfWork);
        totalHoursOfEachEmp = getSort(totalHoursOfEachEmp);
        for (int i = 0; i < totalHoursOfEachEmp.length; i++) {
            System.out.println(totalHoursOfEachEmp[i][0] +  " : " + totalHoursOfEachEmp[i][1]);
        }
    }

    private static int[][] getSort(int[][] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i][1] < arr[j][1]){
                    int temp = arr[i][1];
                    arr[i][1] = arr[j][1];
                    arr[j][1] = temp;

                    temp = arr[i][0];
                    arr[i][0] = arr[j][0];
                    arr[j][0] = temp;
                }
            }
        }
        return arr;
    }
    public static int[][] getTotalHourOfWork(int[][] arr){
       int sum = 0;
       int[][] employeeNoAndHours = new int[8][2];
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            employeeNoAndHours[i][0] = i;
            employeeNoAndHours[i][1] = sum;
        }
        return employeeNoAndHours;
    }
}