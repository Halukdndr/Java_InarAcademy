package chapters.chapter_10.exercises;

public class Exercise_03 {
    public static void main(String[] args) {

        MyInteger int1 = new MyInteger(5);
        System.out.println("int1");
        System.out.println("Even: " + int1.isEven());
        System.out.println("Odd: " + int1.isOdd());
        System.out.println("Prime: " + int1.isPrime());

        char[] int2 = {'5','6','2'};
        System.out.print("int2: ");
        System.out.println(MyInteger.parseInt(int2));

        System.out.println(int1.equals(MyInteger.parseInt(int2)));

        System.out.println(int1.equals(new MyInteger(5)));

        System.out.println("Even: " + MyInteger.isEven(new MyInteger(8)));

        System.out.println(MyInteger.parseInt("35"));


    }
}
