package chapters.chapter_06.examples;

public class Increment {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the call, x is " + x); //1
        increment(x);                                       //2
        System.out.println("After the call, x is " + x);   //1

    }
    public static void increment(int n){
        n++;
        System.out.println("n inside the method is " + n);
    }
}
