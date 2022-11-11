package chapters.chapter_10.checkpoints;

public class CheckPoint_11 {
    public static void main(String[] args) {
        System.out.println(Integer.parseInt("10")); // 10
        System.out.println(Integer.parseInt("10", 10)); // 10
        System.out.println(Integer.parseInt("10", 16)); // 16
        System.out.println(Integer.parseInt("11",2)); // 3
        System.out.println(Integer.parseInt("11", 10)); // 11
        System.out.println(Integer.parseInt("11", 16)); // 17

        Integer intObject = 2; //new Integer (2);

        Integer[] intArray = {1, 2, 3};
        System.out.println(intArray[1]); // intArray[1].intValue();

    }
}
