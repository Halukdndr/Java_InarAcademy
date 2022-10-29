package chapters.chapter_08.exercises;

public class Exercise_07 {
    public static void main(String[] args) {
        double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1},
                             {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3},
                             {-1.5, 4, 2}, {5.5, 4, -0.5}};
        findTheClosest2Points(points);
    }
    public static void findTheClosest2Points(double[][] points){
        double closestDistance = Math.sqrt(Math.pow(points[1][0] - points[0][0],2) + Math.pow(points[1][1] - points[0][1],2) + Math.pow(points[1][2] - points[0][2],2));
        for (int i = 1; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (Math.sqrt(Math.pow(points[j][0] - points[i][0],2) + Math.pow(points[j][1] - points[i][1],2) + Math.pow(points[j][2] - points[i][2],2)) < closestDistance){
                    closestDistance = Math.sqrt(Math.pow(points[j][0] - points[i][0],2) + Math.pow(points[j][1] - points[i][1],2) + Math.pow(points[j][2] - points[i][2],2));
                    System.out.println("The closest points are (" + points[i][0] + "," + points[i][1] + "," + points[i][2] + ")" + " and (" + points[j][0] + "," + points[j][1] + "," + points[j][2] + ")");
                    System.out.println("The distance is " + closestDistance);
                }
            }
        }
    }
}
