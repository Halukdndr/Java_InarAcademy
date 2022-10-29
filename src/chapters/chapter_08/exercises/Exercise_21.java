package chapters.chapter_08.exercises;

import java.util.Scanner;

public class Exercise_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of cities:");
        int numberOfCities = input.nextInt();
        System.out.println("Enter the coordinates of the cities:");
        double[][] coordinates = new double[numberOfCities][2];
        for (int row = 0; row < coordinates.length; row++) {
            for (int col = 0; col < coordinates[row].length; col++) {
                coordinates[row][col] = input.nextDouble();
            }
        }
        getTheShortestDistance(coordinates);
    }
    public static double getTotalDistance(double[][] coordinates,int row){
        double totalDistace = 0;
        for (int i = 0; i < coordinates.length; i++) {
            totalDistace += Math.sqrt(Math.pow(coordinates[row][1] - coordinates[i][1],2) + Math.pow(coordinates[row][0] - coordinates[i][0],2));
        }
        return totalDistace;
    }
    public static void getTheShortestDistance(double[][] coordinates){
        double shortestDistance = Integer.MAX_VALUE;
        int indexOfapitalCity = -1;
        for (int row = 0; row < coordinates.length; row++) {
                if (getTotalDistance(coordinates,row) < shortestDistance){
                    shortestDistance = getTotalDistance(coordinates,row);
                    indexOfapitalCity = row;
                }
        }
        System.out.println("The central city is at (" + coordinates[indexOfapitalCity][0] + ", " + coordinates[indexOfapitalCity][1] + ")");
        System.out.println("The total distance to all other cities is " + shortestDistance);
    }
}
