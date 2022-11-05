package chapters.chapter_09.examples;

public class TestPassObject {
    public static void main(String[] args) {
        CircleWithPrivateDataFields c1 = new CircleWithPrivateDataFields(1);
        int n = 5;
        printAreas(c1,n);

        System.out.println("\nRadius is " + c1.getRadius());
        System.out.println("n is " + n);

    }
    public static void printAreas(CircleWithPrivateDataFields circle,int times){
        System.out.println("Radius \t\tArea");
        while (times >= 1){
            System.out.println(circle.getRadius() + "\t\t" + circle.getArea());
            circle.setRadius(circle.getRadius() + 1);
            times--;
        }

    }
}
