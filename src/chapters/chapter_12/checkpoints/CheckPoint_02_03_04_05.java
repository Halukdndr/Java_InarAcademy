package chapters.chapter_12.checkpoints;

public class CheckPoint_02_03_04_05 {
    public static void main(String[] args) {

    /*02
     System.out.println(1 / 0);  // throws exception
     System.out.println(1.0 / 0); // infinity
     *03
     long value = Long.MAX_VALUE + 1;
     System.out.println(value);  //  go beyond its maximum bounds without throwing an exception
     *04
     terminates the program
     with try and catch method
     *05

     */
        try {
            int value = 30;
            if (value < 40)
                throw new Exception("value is too small");     //30 => value is too small
        }                                                           // Continue after the catch block
        catch (Exception ex) {                                 //50 => Continue after the catch block
            System.out.println(ex.getMessage());
        }
        System.out.println("Continue after the catch block");

    }
}