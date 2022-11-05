package chapters.chapter_08.exercises;
import java.util.Arrays;
import java.util.Scanner;
public class Exercise_34 {
    public static void main(String[] args) {
        double[][] points = getPointsFromUser();
        System.out.println("The rightmost lowest pointis " + Arrays.toString(getRightmostLowestPoint(points)));
    }
    public static double[] getRightmostLowestPoint(double[][] points){
        double[] rigthmostLowestPoint = new double[2];
        // rightmostLowestPointMeasureValue is a parameter of rightmost lowest degree.if a points' rightmost value is the highest, this is the rightmost lowest point.
        // x => + gets point y => - gets point x => - lowers point y => + lowers point
        double rightmostLowestPointMeasureValue = Integer.MIN_VALUE;
        int indexOfRL = -1;
        for (int row = 0; row < points.length; row++) {
            if (points[row][0] - points[row][1] > rightmostLowestPointMeasureValue){
                rightmostLowestPointMeasureValue = points[row][0] - points[row][1];
                indexOfRL = row;
            }
        }
        rigthmostLowestPoint[0] = points[indexOfRL][0];
        rigthmostLowestPoint[1] = points[indexOfRL][1];
        return rigthmostLowestPoint;
    }
    public static double[][] getPointsFromUser(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 6 points: ");
        double[][] points = new double[6][2];
        for (int row = 0; row < points.length; row++) {
            for (int col = 0; col < points[row].length; col++) {
                points[row][col] = input.nextDouble();
            }
        }
        return points;
    }
}
