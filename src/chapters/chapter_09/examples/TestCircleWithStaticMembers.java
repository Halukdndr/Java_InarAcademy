package chapters.chapter_09.examples;

public class TestCircleWithStaticMembers {
    public static void main(String[] args) {
        System.out.println("Before creating objects");
        System.out.println("The number of Circle objects is " + CircleWithStaticMembers.numberOfCircles);

        CircleWithStaticMembers c1 = new CircleWithStaticMembers();

        System.out.println("After creating c1 ");
        System.out.println("c1 radius = " + c1.radius);
        System.out.println("The number of Circle objects is " + CircleWithStaticMembers.numberOfCircles);

        CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);
        c1.radius = 9;
        System.out.println("After creating c2 and modifying c1");
        System.out.println("c1 radius = " + c1.radius);
        System.out.println("The number of Circle objects is " + CircleWithStaticMembers.numberOfCircles);
        System.out.println("c2 radius = " + c2.radius);






    }
}
