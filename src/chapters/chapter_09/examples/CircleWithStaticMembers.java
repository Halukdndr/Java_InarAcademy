package chapters.chapter_09.examples;

public class CircleWithStaticMembers {

    // Data field

    double radius;

    static int numberOfCircles = 0;

    // Constructor

    CircleWithStaticMembers(){
        radius = 1;
        numberOfCircles++;
    }
    CircleWithStaticMembers(double newRadius){
        radius = newRadius;
        numberOfCircles++;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    public int getNumberOfCircles(){
        return numberOfCircles;
    }



}
