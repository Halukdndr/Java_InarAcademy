package chapters.chapter_11.exercises.E15;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_15 {
    public static void main(String[] args) {
        ArrayList<Double> points = getFromUser();
        System.out.println(points);
        System.out.println("The total area is " + computeTheAreaOfPolygon(points));
    }
  public static ArrayList<Double> getFromUser(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of the points: ");
        int number = input.nextInt();

        System.out.println("Enter the coordinates of the points: ");
        ArrayList<Double> points = new ArrayList<>();
        for (int i = 0; i < number * 2; i++) {
            points.add(input.nextDouble());
        }

        return points;
    }

    public static double computeTheAreaOfPolygon(ArrayList<Double> points){
       double sumLeftSide = 0;
       double sumRightSide = 0;
       int i = 0;
        for (i = 1; i < 13; i += 2) {
            sumLeftSide += points.get(i) * points.get(i + 1);
        }
        sumLeftSide += points.get(i) * points.get(0);
        for (i = 0; i < 11; i += 2) {
            sumRightSide += points.get(i) * points.get(i + 3);
        }
        sumRightSide += points.get(i) * points.get(1);
        return Math.abs(sumLeftSide - sumRightSide) / 2;
    }


}
